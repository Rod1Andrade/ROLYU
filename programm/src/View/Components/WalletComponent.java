package View.Components;

import Controller.StocksController;
import Utils.Constants;
import model.Stocks;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class WalletComponent extends AbstractComponent {

    private JTable walletTable;
    ArrayList<Stocks> stocksList;

    DefaultTableModel model = new DefaultTableModel();

    public WalletComponent() {

        this.dropShadow(6);

        int width = (int) (Constants.SCREEN_SIZE.getWidth() * 0.5);
        int height = (int) (Constants.SCREEN_SIZE.getHeight() * 0.3);

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(width, height));

        JScrollPane scroll = new JScrollPane(createTable());

        this.add(scroll);
    }

    private JTable createTable() {
        walletTable = new JTable(model);

        StocksController stocksController = new StocksController();
        stocksList = (ArrayList<Stocks>) stocksController.show();

        model.addColumn("NOME");
        model.addColumn("QUANTIDADE");
        model.addColumn("TOTAL");
        model.addColumn("OPÇÕES");

        for (Stocks stock : stocksList) {
            model.addRow(new Object[]{stock.getName(), stock.getAmount(), stock.getTotalPrice(), "OPTION"});
        }


        return walletTable;
    }
}
