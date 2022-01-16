package dz.solutions.developemnt.service.jdbc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatabaseConnectionTest {

    @DisplayName("test get derby database connection")
    @Test
    public void testGetDerbyConnection() throws  SQLException {
        Connection connection = DatabaseConnection.getDerbyConnection();
        assertNotNull(connection);
    }

    @DisplayName("test get postgresql database connection")
    @Test
    public void testGetPostgresqlConnection() throws  SQLException {
        Connection connection = DatabaseConnection.getPostgresqlConnection();
        assertNotNull(connection);
    }

    @DisplayName("test get postgresql database connection")
    @Test
    public void testGetMysqlConnection() throws  SQLException {
        Connection connection = DatabaseConnection.getMysqlConnection();
        assertNotNull(connection);
    }

    @Test
    public void testSingletonPostgresqlConnection() throws  SQLException{
        Connection connection1 = DatabaseConnection.getPostgresqlConnection();
        Connection connection2 = DatabaseConnection.getPostgresqlConnection();
        assertEquals(connection1,connection2);
    }

    @Test
    public void testSingletonDerbyConnection() throws  SQLException{
        Connection connection1 = DatabaseConnection.getDerbyConnection();
        Connection connection2 = DatabaseConnection.getDerbyConnection();
        assertEquals(connection1,connection2);
    }
}
