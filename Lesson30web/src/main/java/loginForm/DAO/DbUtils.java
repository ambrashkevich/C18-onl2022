package loginForm.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {
    private DbUtils() {
    }

    //127.0.0.1
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/lesson30";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "vadim";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Exception " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
