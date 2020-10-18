package model;

import java.util.List;

public class Wallet {

    private List<Stocks> stocksList;

    private double balance;

    public Wallet() {}

    public Wallet(List<Stocks> stocksList, double balance) {
        this.stocksList = stocksList;
        this.balance = balance;
    }

    public List<Stocks> getStocksList() {
        return stocksList;
    }

    public void setStocksList(List<Stocks> stocksList) {
        this.stocksList = stocksList;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
