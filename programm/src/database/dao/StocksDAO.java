package database.dao;

import Exceptions.StocksException;
import database.connection.SqliteConnection;
import model.Stocks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para prover Manipulação de acesso a dados
 *
 * @author Rodrigo Andrade
 */
public class StocksDAO {

    public static String TABLE_NAME = "tb_stocks";

    /**
     * Criar a tablea com base no objeto
     */
    public boolean createStockTable() throws SQLException {

        Connection connection = SqliteConnection.getInstance();

        String ddl = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
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

    /**
     *
     * @param stocks Stocks
     * @return True caso a operacao deu certo
     */
    public int update(Stocks stocks) {
        Connection connection = null;

        String sql = "UPDATE " + TABLE_NAME + " SET " +
                "name = ?, " +
                "amount = ?, " +
                "totalPrice = ?" +
                " WHERE id = ?";

        try {
            connection = SqliteConnection.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, stocks.getName());
            preparedStatement.setInt(2, stocks.getAmount());
            preparedStatement.setDouble(3, stocks.getTotalPrice());
            preparedStatement.setInt(4, stocks.getId());

            return preparedStatement.executeUpdate();

        } catch (SQLException exception) {
            throw new StocksException(exception.getMessage());
        }
    }

    /**
     * Busca uma Stocks por id
     * @param id Int
     * @return
     */
    public Stocks getById(int id) {

        Stocks stocks = null;
        Connection connection = null;
        String sql = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";

        try {
            connection = SqliteConnection.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                stocks = new Stocks();
                stocks.setId(resultSet.getInt("id"));
                stocks.setName(resultSet.getString("name"));
                stocks.setAmount(resultSet.getInt("amount"));
                stocks.setTotalPrice(resultSet.getDouble("totalPrice"));
            }

            return stocks;
        } catch (SQLException exception) {
            throw new StocksException(exception.getMessage());
        }
    }

    /**
     * Retorna todas as ocorrências de Stocks
     * @return List<Stocks>
     */
    public List<Stocks> getAll() {
        List<Stocks> stocksList = null;

        Connection connection = null;
        String sql = "SELECT * FROM " + TABLE_NAME;

        try {
            connection = SqliteConnection.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

               stocksList = new ArrayList<>();
               Stocks stocks = new Stocks();

               while(resultSet.next()) {
                   stocks.setId(resultSet.getInt("id"));
                   stocks.setName(resultSet.getString("name"));
                   stocks.setAmount(resultSet.getInt("amount"));
                   stocks.setTotalPrice(resultSet.getDouble("totalPrice"));

                   stocksList.add(stocks);
               }

           return stocksList;
        } catch (SQLException exception) {
            throw new StocksException(exception.getMessage());
        }
    }

    /**
     * Deleta uma 'Stocks' do banco.
     * @param stocks Stocks que deve ser deletada
     */
    public int remove(Stocks stocks) {

        Connection connection = null;
        String dml = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";

        try {
            connection = SqliteConnection.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement(dml);
            preparedStatement.setInt(1, stocks.getId());

            return preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            throw new StocksException(exception.getMessage());
        }
    }
}
