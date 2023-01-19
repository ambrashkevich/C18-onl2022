package by.tms.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {

    private DbUtils() {
    }

    //127.0.0.1
    private static final String DB_URL = "jdbc:postgres://localhost:5432/postgres";
    private static final String DB_USERNAME = "vadim";
    private static final String DB_PASSWORD = "vadim";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
//            connection.rollback();
        } catch (SQLException e) {
            System.out.println("Exception " + e.getMessage());
        }
        return connection;
    }
}