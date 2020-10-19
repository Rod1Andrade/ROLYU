package Controller;

import DTO.StocksDTO;
import model.Stocks;

import java.util.Map;

/**
 * Controller da 'Stocks'
 *
 * @author Rodrigo Andrade
 */
public class StocksController implements ControllerInterface<StocksDTO, Stocks> {

    public void adpaterToStore(Map<String, Object> values) {
        StocksDTO stocksDTO = new StocksDTO(
                (String) values.get("name"),
                (String) values.get("amount"),
                (String) values.get("uniquePrice")
        );

        this.store(stocksDTO);
    }

    @Override
    public void store(StocksDTO dto) {
        System.out.println(dto.getName());
        System.out.println(dto.getAmount());
        System.out.println(dto.getUniquePrice());
    }

}
