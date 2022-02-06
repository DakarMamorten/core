package com.vlad.web.dvdrental.dao.category;


import com.vlad.web.dvdrental.connection.DBConnectionSingleton;
import com.vlad.web.dvdrental.dao.AbstractDAO;
import com.vlad.web.dvdrental.model.Category;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static com.vlad.web.dvdrental.util.DateUtil.DATE_TIME_FORMAT;


public class CategoryDAO implements AbstractDAO<Category> {

    private static final Logger LOGGER = Logger.getLogger(CategoryDAO.class);

    @Override
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        String sql = "SELECT * FROM category";
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    Category category = new Category();
                    category.setCategoryId(resultSet.getInt(1));
                    category.setName(resultSet.getString(2));
                    category.setLastUpdate(
                            LocalDateTime.parse(resultSet.getString(3),
                                    DateTimeFormatter.ofPattern(DATE_TIME_FORMAT)));
                    categories.add(category);
                }
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: {}", exception);
        }
        return categories;
    }

    @Override
    public Category findById(Long id) {
        Category category = new Category();
        String sql = "SELECT * FROM category WHERE category_id = " + id;
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                resultSet.next();
                category.setCategoryId(resultSet.getInt(1));
                category.setName(resultSet.getString(2));
                category.setLastUpdate(
                        LocalDateTime.parse(resultSet.getString(3),
                                DateTimeFormatter.ofPattern(DATE_TIME_FORMAT)));
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: {}", exception);
        }
        return category;
    }

    @Override
    public void deleteById(Long id) {
        String sql = "DELETE FROM category WHERE category_id = " + id;
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());
        }
    }

    @Override
    public void save(Category entity) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        String formatDateTime = LocalDateTime.now().format(formatter);
        String sql = "INSERT INTO category(name,last_update) VALUES(" + " '" + entity.getName() + "','" + formatDateTime
                + "')";
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());
        }
    }

}
