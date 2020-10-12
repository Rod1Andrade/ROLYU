package database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe de conexao com o banco de dados sqlite.
 *
 * @author Rodrigo Andrade
 */
public class SqliteConnection {

    private static final String DRIVER_JDBC = "jdbc:sqlite:database/database_rolyu.db";

    private static Connection connection;

    private SqliteConnection() {
    }

    /**
     * Instancia de conexao com o banco de dados.
     *
     * @return Unique instance of Connection
     */
    public static Connection getInstance() throws SQLException {

        if(connection == null) {
            connection = DriverManager.getConnection(DRIVER_JDBC);
        }

        return connection;
    }

}
