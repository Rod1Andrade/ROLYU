package Controller;

import DTO.StocksDTO;
import Repository.StocksRepository;
import Utils.Constants;
import database.dao.StocksDAO;
import model.Stocks;

import java.util.Map;

/**
 * Controller da 'Stocks'
 *
 * @author Rodrigo Andrade
 */
public class StocksController implements ControllerInterface<StocksDTO, Stocks> {

    private StocksRepository stocksRepository;

    public void adpaterToStore(Map<String, Object> values) {
        StocksDTO stocksDTO = new StocksDTO(
                (String) values.get(Constants.KEY_NAME),
                (String) values.get(Constants.KEY_AMOUNT),
                (String) values.get(Constants.KEY_UNIQUE_PRICE)
        );

        this.store(stocksDTO);
    }

    @Override
    public void store(StocksDTO dto) {
        this.getStocksRepository().persist(dto.adapter(dto));
    }

    /**
     * Retorna uma instancia de stockRepository
     *
     * @return
     */
    private StocksRepository getStocksRepository() {
        if (stocksRepository == null) {
            this.stocksRepository = new StocksRepository(new StocksDAO());
        }

        return this.stocksRepository;
    }

}
