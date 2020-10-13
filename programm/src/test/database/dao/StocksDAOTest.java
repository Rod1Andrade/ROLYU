package test.database.dao;

import Exceptions.StocksException;
import database.dao.StocksDAO;
import model.Stocks;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.sql.SQLException;
import java.util.List;

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
        Assert.assertTrue(stocksDAO.createTable());
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

    @Test
    public void shouldUpdateAStocksWithId1() {
        Stocks stocks = new  Stocks(1,"TestUpdated01", 4, 50.0);
        StocksDAO stocksDAO = new StocksDAO();
        Assert.assertEquals(1, stocksDAO.update(stocks));
    }

    @Test
    public void shouldDeleteAStocksWithId2() {
        Stocks stocks = new Stocks();
        stocks.setId(2);

        StocksDAO stocksDAO = new StocksDAO();
        Assert.assertEquals(1, stocksDAO.remove(stocks));
    }

    @Test
    public void shouldReturnAStockWithId1() {
        StocksDAO stocksDAO = new StocksDAO();
        Stocks stocks = stocksDAO.getById(1);
        Assert.assertEquals(1, stocks.getId());
    }

    @Test
    public void shouldReturnAStocksList() {
        StocksDAO stocksDAO = new StocksDAO();
        List<Stocks> stocksList = stocksDAO.getAll();

        stocksList.forEach(System.out::println);
        Assert.assertNotNull(stocksList);
    }
}
