package View.Components;

import Controller.MouseChangeScreenController;
import Controller.StocksController;
import Utils.Colors;
import Utils.Constants;
import model.Stocks;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class WalletComponent extends AbstractComponent {

    private JTable walletTable;


    ArrayList<Stocks> stocksList;

    DefaultTableModel model = new DefaultTableModel();

    public WalletComponent() {
        this.walletTable = new JTable(model);

        this.dropShadow(6);

        int width = (int) (Constants.SCREEN_SIZE.getWidth() * 0.5);
        int height = (int) (Constants.SCREEN_SIZE.getHeight() * 0.3);

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(width, height));

        JScrollPane scroll = new JScrollPane(createTable());


        this.add(scroll);
    }

    private JTable createTable() {


        StocksController stocksController = new StocksController();
        stocksList = (ArrayList<Stocks>) stocksController.show();

        model.addColumn("NOME");
        model.addColumn("QUANTIDADE");
        model.addColumn("TOTAL");


        for (Stocks stock : stocksList) {
            model.addRow(new Object[]{stock.getName(), stock.getAmount(), stock.getTotalPrice()});
        }


        return this.walletTable;
    }

    public String getNameofSelectedRow() {
        int row = walletTable.getSelectedRow();
        if(row == -1)
            return model.getValueAt(1, 0).toString();
        else
            return model.getValueAt(row, 0).toString();
    }
}
