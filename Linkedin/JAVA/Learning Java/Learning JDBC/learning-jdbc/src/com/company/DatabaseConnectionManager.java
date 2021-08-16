package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
    private final String url;
    private final Properties properties;

    public DatabaseConnectionManager(String host, String dbName, String user, String password) {
        this.url = "jdbc:postgresql://" + host + "/" + dbName;
        this.properties = new Properties();
        properties.setProperty("user", user);
        properties.setProperty("password", password);
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }
}
