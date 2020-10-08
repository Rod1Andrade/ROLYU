package database;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe de conexao com o banco de dados
 *
 * @author Rodrigo Andrade
 */
public class Connection {

    private static final String DRIVER_JDBC = "jdbc:sqlite:database/database_rolyu.db";

    private static java.sql.Connection connection;

    private Connection() {
    }

    /**
     * Instancia de conexao com o banco de dados
     * @return Unique instance of Connection
     */
    public static java.sql.Connection getInstance() throws SQLException {

        if(connection == null) {
            connection = DriverManager.getConnection(DRIVER_JDBC);
        }

        return connection;
    }

}
