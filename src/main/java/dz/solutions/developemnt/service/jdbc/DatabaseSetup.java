package dz.solutions.developemnt.service.jdbc;

import java.sql.*;

public class DatabaseSetup {

    public static Connection setUpDerby() throws SQLException {
        String url = "jdbc:derby:zoo;create=true";
        try (Connection connection = DriverManager.getConnection(url)) {

            run(connection,"DROP TABLE names");
            run(connection,"DROP TABLE exhibits");

            run(connection,"CREATE TABLE exhibits ("
                + "id INTEGER PRIMARY KEY, "
                + "name VARCHAR(255), "
                + "num_acres DECIMAL(4,1))");

            run(connection,"CREATE TABLE names ("
                + "id INTEGER PRIMARY KEY, "
                + "species_id integer REFERENCES exhibits (id), "
                + "name VARCHAR(255))");

            run(connection,"INSERT INTO exhibits VALUES (1, 'African Elephant', 7.5)");
            run(connection,"INSERT INTO exhibits VALUES (2, 'Zebra', 1.2)");

            run(connection,"INSERT INTO names VALUES (1, 1, 'Elsa')");
            run(connection,"INSERT INTO names VALUES (2, 2, 'Zelda')");
            run(connection,"INSERT INTO names VALUES (3, 1, 'Ester')");
            run(connection,"INSERT INTO names VALUES (4, 1, 'Eddie')");
            run(connection,"INSERT INTO names VALUES (5, 2, 'Zoe')");

            printCount(connection,"SELECT count(*) FROM names");
            return connection;
        }
    }

    private static void run(Connection conn, String sql) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }

    private static void printCount(Connection conn, String sql) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            rs.next();
            System.out.println(rs.getInt(1));
        }
    }
}
