package model;

/**
 * Entidade Stocks
 *
 * @author Rodrigo Andrade
 */
public class Stocks {

    private int id;

    private String name;

    private int amount;

    private double uniquePrice;

    private double totalPrice;

    public Stocks() {
    }

    public Stocks(String name, int amount, double uniquePrice) {
        this.name = name;
        this.amount = amount;
        this.uniquePrice = uniquePrice;
        this.setTotalPrice(this.calcTotalPrice());
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

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * Calcula o preço total com base na quantide
     * e no preço unico.
     * @return double
     */
    public double calcTotalPrice() {
        return this.uniquePrice * this.amount;
    }
}
