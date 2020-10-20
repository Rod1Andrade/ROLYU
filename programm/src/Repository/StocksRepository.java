package Repository;

import Exceptions.StocksException;
import database.dao.DataAccessObject;
import model.Stocks;

/**
 * Classe Repository da entidade 'Stocks'
 *
 * @author Rodrigo Andrade
 */
public class StocksRepository {

    private DataAccessObject<Stocks> dao;

    /**
     * Constructor
     *
     * @param dao - Data Acess Object
     */
    public StocksRepository(DataAccessObject dao) {
        this.dao = dao;
    }

    /**
     * Periste uma entidade no banco de dados.
     *
     * @param stocks - Entidade Stocks
     */
    public void persist(Stocks stocks) {
        try {
            this.dao.persist(stocks);
        } catch (StocksException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
