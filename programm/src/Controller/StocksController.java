package Controller;

import DTO.StocksDTO;
import model.Stocks;

/**
 * Controller da 'Stocks'
 *
 * @author Rodrigo Andrade
 */
public class StocksController implements ControllerInterface<StocksDTO, Stocks> {

    @Override
    public void store(StocksDTO dto) {
        System.out.println(dto.getName());
        System.out.println(dto.getAmount());
        System.out.println(dto.getUniquePrice());
    }

}
