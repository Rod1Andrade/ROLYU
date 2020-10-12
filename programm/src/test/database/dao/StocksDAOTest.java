package test.database.dao;

import Exceptions.StocksException;
import database.dao.StocksDAO;
import model.Stocks;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.sql.SQLException;

/**
 * Classe de teste de 'StocksDAO'
 *
 * @author Rodrigo Andrade
 */
public class StocksDAOTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldCreateATable() throws SQLException {
        StocksDAO stocksDAO = new StocksDAO();
        Assert.assertTrue(stocksDAO.createStockTable());
    }

    @Test
    public void shouldPersistAStockEntity() {
        Stocks stocks = new Stocks("Test01", 3, 100.0);
        StocksDAO stocksDAO = new StocksDAO();
        Assert.assertNotNull(stocksDAO.persist(stocks));
    }

    @Test
    public void shouldReturnAStocksException() {
        Stocks stocks = new Stocks("Test01", 3, 100.0);
        StocksDAO stocksDAO = new StocksDAO();
        exception.expect(StocksException.class);
        stocksDAO.persist(stocks);
    }
}
