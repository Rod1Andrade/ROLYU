package database.dao;

import Exceptions.StocksException;
import database.connection.SqliteConnection;
import model.Stocks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Classe para prover Manipulação de acesso a dados
 *
 * @author Rodrigo Andrade
 */
public class StocksDAO {

    /**
     * Criar a tablea com base no objeto
     */
    public boolean createStockTable() throws SQLException {

        Connection connection = SqliteConnection.getInstance();

        String ddl = "CREATE TABLE IF NOT EXISTS tb_stocks (" +
                "id INTEGER NOT NULL PRIMARY KEY," +
                "name VARCHAR(45) NOT NULL UNIQUE," +
                "amount INTEGER NOT NULL," +
                "totalPrice REAL NOT NULL" +
                ")";

        PreparedStatement preparedStatement = connection.prepareStatement(ddl);
        return !preparedStatement.execute();
    }

    /**
     * Classe responsavel por persistir a entidade 'Stocks'.
     *
     * @param stocks Stocks
     */
    public boolean persist(Stocks stocks) {

        String sql = "INSERT INTO tb_stocks('name', 'amount', 'totalPrice') VALUES (?, ?, ?)";

        Connection connection = null;
        try {
            connection = SqliteConnection.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, stocks.getName());
            preparedStatement.setInt(2, stocks.getAmount());
            preparedStatement.setDouble(3, stocks.calcTotalPrice());

            return preparedStatement.execute();
        } catch (SQLException exception) {
            throw new StocksException(exception.getMessage());
        }
    }

}
