package View.Screen;

import Controller.ControllerInterface;
import Controller.MouseChangeScreenController;
import Controller.StocksController;
import View.Components.AbstractComponent;
import View.Components.DeleteStocksFormComponent;
import View.Components.WalletComponent;
import database.dao.StocksDAO;
import model.Stocks;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ChangeStockScreen extends AbsctractScreen {

    DeleteStocksFormComponent form;
    public String rowName;

    public ChangeStockScreen(JFrame parent, AbsctractScreen parentScreen, String rowName) {
        super(parent, parentScreen);
        this.setLayout(new BorderLayout());
        this.rowName = rowName;

        JLabel label = new JLabel("Voltar");
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label.addMouseListener(
                new MouseChangeScreenController(parent, parentScreen)
        );

        JPanel changeFormPanel = new JPanel();

        StocksDAO stocks = new StocksDAO();

        this.form = new DeleteStocksFormComponent(new StocksController(), stocks.getByName(this.rowName));
        changeFormPanel.add(form);

        this.add(label, BorderLayout.NORTH);
        this.add(changeFormPanel, BorderLayout.CENTER);
    }

}


