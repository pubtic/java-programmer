package dz.solutions.developemnt.service.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatabaseSetupTest {

    @Test
    public void testSetUpDerby() throws SQLException {
        Connection connection = DatabaseSetup.setUpDerby();
        assertNotNull(connection);
    }
}
