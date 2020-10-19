package DTO;

import model.Stocks;

/**
 * Classe de transferencia de dados
 * entre as camadas do sistema referente a entidade modelo 'Stocks'.
 *
 * @author Rodrigo Andrade
 */
public class StocksDTO implements DataTransferObject<Stocks> {

    private int id;

    private String name;

    private int amount;

    private double uniquePrice;

    public StocksDTO() {

    }

    public StocksDTO(String name, String amount, String uniquePrice) {
        this.name = name;
        this.amount = Integer.parseInt(amount);
        this.uniquePrice = Double.parseDouble(uniquePrice);
    }

    public StocksDTO(String name, int amount, double uniquePrice) {
        this.name = name;
        this.amount = amount;
        this.uniquePrice = uniquePrice;
    }

    public StocksDTO(int id, String name, int amount, double uniquePrice) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.uniquePrice = uniquePrice;
    }

    @Override
    public Stocks adapter(DataTransferObject dto) {

        Stocks instance = null;

        if (dto != null) {
            instance = new Stocks();
            StocksDTO stocksDTO = (StocksDTO) dto;
            instance.setId(stocksDTO.getId());
            instance.setName(stocksDTO.getName());
            instance.setAmount(stocksDTO.getAmount());
            instance.setUniquePrice(stocksDTO.getUniquePrice());
            instance.setTotalPrice(instance.calcTotalPrice());
        }

        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getUniquePrice() {
        return uniquePrice;
    }

    public void setUniquePrice(double uniquePrice) {
        this.uniquePrice = uniquePrice;
    }

}
