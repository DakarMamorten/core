package com.vlad.web.dvdrental.dao.film;


import com.vlad.web.dvdrental.connection.DBConnectionSingleton;
import com.vlad.web.dvdrental.dao.AbstractDAO;
import com.vlad.web.dvdrental.model.Film;
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

public class FilmDAO implements AbstractDAO<Film> {

    Film film = new Film();
    FilmCategoryDAO filmCategoryDAO = new FilmCategoryDAO();

    String data = "yyyy-MM-dd HH:mm:ss.SSS";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(data);
    private static final Logger LOGGER = Logger.getLogger(FilmDAO.class);

    @Override
    public List<Film> findAll() {
        List<Film> films = new ArrayList<>();
        String sql = "SELECT * FROM film  ORDER BY film_id LIMIT 20";
        return filmBuild(films, sql);
    }

    @Override
    public Film findById(Long id) {
        String sql = "SELECT * FROM film WHERE id = " + id;
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                film = Film.builder()
                        .filmId(resultSet.getInt(1))
                        .title(resultSet.getString(2))
                        .description(resultSet.getString(3))
                        .releaseYear(resultSet.getInt(4))
                        .languageId(resultSet.getInt(5))
                        .rentalDuration(resultSet.getInt(6))
                        .rentalRate(resultSet.getDouble(7))
                        .length(resultSet.getInt(8))
                        .replacementCost(resultSet.getDouble(9))
                        .rating(resultSet.getString(10))
                        .lastUpdate(LocalDateTime.parse(resultSet.getString(11), formatter))
                        .specialFeatures(resultSet.getString(12))
                        .fullText(resultSet.getString(13))
                        .build();
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());
        }
        return film;
    }

    public List<Film> findFilmByCategoryId(Long id) {
        List<Film> films = new ArrayList<>();
        String sql = "SELECT * FROM film AS f \n" +
                "INNER JOIN film_category AS fc ON f.film_id = fc.film_id \n" +
                "WHERE fc.category_id = " + id + "ORDER BY fc.category_id" + " LIMIT 20";
        return filmBuild(films, sql);
    }

    public void saveFilmToCategory(FilmCategory entity) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(data);
        String formatDateTime = entity.getLastUpdate().format(formatter);
        filmCategoryDAO.save(entity);
        String sql = "INSERT INTO film_category VALUES (" + entity.getCategoryId() + "," + entity.getFilmId() + ",'" + formatDateTime + "')";
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());
        }
    }


    private List<Film> filmBuild(List<Film> films, String sql) {
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    film = Film.builder()
                            .filmId(resultSet.getInt(1))
                            .title(resultSet.getString(2))
                            .description(resultSet.getString(3))
                            .releaseYear(resultSet.getInt(4))
                            .languageId(resultSet.getInt(5))
                            .rentalDuration(resultSet.getInt(6))
                            .rentalRate(resultSet.getDouble(7))
                            .length(resultSet.getInt(8))
                            .replacementCost(resultSet.getDouble(9))
                            .rating(resultSet.getString(10))
                            .lastUpdate(LocalDateTime.parse(resultSet.getString(11), formatter))
                            .specialFeatures(resultSet.getString(12))
                            .fullText(resultSet.getString(13))
                            .build();
                    films.add(film);
                }
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());
        }
        return films;
    }


    @Override
    public void deleteById(Long id) {
        String sql = "DELETE FROM film WHERE id =  " + id;
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());

        }
    }

    @Override
    public void save(Film entity) {
        String sql = "INSERT INTO film(title, description, releaseYear, languageId, " +
                "rentalDuration, rentalRate, length, replacementCost, rating, lastUpdate," +
                " specialFeatures, fullText) VALUES(" + "," + "'" + entity.getTitle() + "'," +
                "," + entity.getDescription() + "," + entity.getReleaseYear() + ", " +
                entity.getLanguageId() + "," + "'" + entity.getRentalDuration() + "'," + "" + entity.getRentalRate() + "," +
                entity.getLength() + "," + entity.getReplacementCost() + ",'" + entity.getRating() + "'," + "'" + entity.getLastUpdate() + "'," +
                "'" + entity.getSpecialFeatures() + "'," + "'" + entity.getFullText() + "'," + ",)";
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());
        }
    }
}


