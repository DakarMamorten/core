package com.vlad.web.dvdrental.dao.film;


import com.vlad.web.dvdrental.connection.DBConnectionSingleton;
import com.vlad.web.dvdrental.dao.AbstractDAO;
import com.vlad.web.dvdrental.model.FilmCategory;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FilmCategoryDAO implements AbstractDAO<FilmCategory> {
    FilmCategory filmCategory = new FilmCategory();
    String data = "yyyy-MM-dd HH:mm:ss.SSS";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(data);
    private static final Logger LOGGER = Logger.getLogger(FilmCategory.class);


    @Override
    public List<FilmCategory> findAll() {
        List<FilmCategory> filmCategories = new ArrayList<>();
        String sql = "SELECT * FROM film  ORDER BY film_id LIMIT 20";
        return filmBuild(filmCategories, sql);
    }

    @Override
    public FilmCategory findById(Long id) {
        FilmCategory filmCat = new FilmCategory();
        String sql = "SELECT * FROM film_category WHERE id = " + id;
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                resultSet.next();
                filmCat = FilmCategory.builder()
                        .filmId(resultSet.getInt(1))
                        .categoryId(resultSet.getInt(2))
                        .lastUpdate(LocalDateTime.parse(resultSet.getString(11), formatter))
                        .build();
            }
        } catch (SQLException exception) {
            LOGGER.error(("Error: " + exception.getMessage()));
        }
        return filmCat;
    }


    private List<FilmCategory> filmBuild(List<FilmCategory> filmCategories, String sql) {
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    filmCategory = FilmCategory.builder()
                            .filmId(resultSet.getInt(1))
                            .categoryId(resultSet.getInt(2))
                            .lastUpdate(LocalDateTime.parse(resultSet.getString(11), formatter))
                            .build();
                    filmCategories.add(filmCategory);
                }
            }
        } catch (SQLException exception) {
            System.out.println(("Error: " + exception.getMessage()));
        }
        return filmCategories;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void save(FilmCategory entity) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(data);
        String formatDateTime = entity.getLastUpdate().format(formatter);
        String sql = "INSERT INTO film_category VALUES (" + entity.getCategoryId() + "," + entity.getCategoryId() + ",'" + formatDateTime + "')";
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());
        }
    }
}

