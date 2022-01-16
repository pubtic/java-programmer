package dz.solutions.developemnt.service.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection postgresConnection = null;

    public static Connection getDerbyConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:derby:test_db;create=true");
        return connection;
    }

    public static Connection getPostgresqlConnection() throws SQLException {
        if(postgresConnection == null) {
            postgresConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test_db",
                    "root",
                    "root");
        }
        return postgresConnection;
    }

    public static Connection getMysqlConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db",
            "root",
            "root");
        return connection;
    }
}
