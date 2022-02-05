package com.vlad.web.dvdrental.connection;

import org.apache.log4j.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnectionSingleton {
    private static final Logger LOGGER = Logger.getLogger(DBConnectionSingleton.class);

    private static DBConnectionSingleton instance;
    private Connection connection;
    private static final String URL = "jdbc:postgresql://localhost:5432/dvdrental";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";

    private DBConnectionSingleton() {
        try {
            InitialContext initialContext = new InitialContext();
            Context context = (Context) initialContext.lookup("java:comp/env");
            DataSource dataSource = (DataSource) context.lookup("jdbc/postgres");
            connection = dataSource.getConnection();
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DBConnectionSingleton getInstance() {
        if (instance == null) {
            instance = new DBConnectionSingleton();
        } else {
            try {
                if (instance.getConnection().isClosed()) {
                    instance = new DBConnectionSingleton();
                }
            } catch (SQLException exception) {
                LOGGER.error("Error during connection to DB");
            }
        }
        return instance;
    }
}
