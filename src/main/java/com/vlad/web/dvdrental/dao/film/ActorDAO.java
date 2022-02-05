package com.vlad.web.dvdrental.dao.film;


import com.vlad.web.dvdrental.connection.DBConnectionSingleton;
import com.vlad.web.dvdrental.dao.AbstractDAO;
import com.vlad.web.dvdrental.model.Actor;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ActorDAO implements AbstractDAO<Actor> {
    private static final Logger LOGGER = Logger.getLogger(ActorDAO.class);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SS");


    @Override
    public List<Actor> findAll() {
        List<Actor> listActor = new ArrayList<>();
        String sql = "SELECT * FROM actor";
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Actor actor = new Actor();
                    actor.setActorId(resultSet.getInt(1));
                    actor.setFirstName(resultSet.getString(2));
                    actor.setLastName(resultSet.getString(3));
                    actor.setLastUpdate(LocalDateTime.parse(resultSet.getString(4),formatter));
                    listActor.add(actor);
                }
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());
        }
        return listActor;
    }

    @Override
    public Actor findById(Long id) {
        Actor actor = new Actor();
        String sql = "SELECT * FROM film WHERE film_id = " + id;
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();
                resultSet.next();
                actor.setActorId(resultSet.getInt(1));
                actor.setFirstName(resultSet.getString(2));
                actor.setLastName(resultSet.getString(3));
                actor.setLastUpdate(LocalDateTime.parse(resultSet.getString(4), formatter));
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());
        }
        return actor;
    }

    @Override
    public void deleteById(Long id) {
        String sql = "DELETE FROM actor WHERE actor_id = " + id;
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());
        }
    }

    @Override
    public void save(Actor entity) {
        String sql = "INSERT INTO actor (actor_id, first_name, last_name, last_update) VALUES (" + entity.getActorId() + "," + "'" + entity.getFirstName() +
                "', '" + entity.getLastName() + "', '" + entity.getLastUpdate() + "')";
        try (Connection connection = DBConnectionSingleton.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        } catch (SQLException exception) {
            LOGGER.error("Error: " + exception.getMessage());
        }
    }

}
