package test.database.connection;

import database.connection.SqliteConnection;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Classe de teste do SqliteConnection
 *
 * @author Rodrigo Andrade
 */
public class SqliteConnectionTest {

    @Test
    public void testShouldConnectInSqlite() throws SQLException {
        Connection connection = SqliteConnection.getInstance();
        Assert.assertNotNull(connection);
    }

}
