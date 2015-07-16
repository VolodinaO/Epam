package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by ооо on 15.07.2015.
 */
public class DBWorker {

    private final String URL = "jdbc:mysql://localhost:3306/hodor";
    private final String USERNAME = "root";
    private final String PASSWORD = "hodor";

    private Connection connection = null;

    public DBWorker(){
        try {
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
