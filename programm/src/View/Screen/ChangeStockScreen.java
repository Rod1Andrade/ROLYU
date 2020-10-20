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

    public ChangeStockScreen(JFrame parent, AbsctractScreen parentScreen) {
        super(parent, parentScreen);
        this.setLayout(new BorderLayout());

        JLabel label = new JLabel("Voltar");
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label.addMouseListener(
                new MouseChangeScreenController(parent, parentScreen)
        );

        JPanel changeFormPanel = new JPanel();

        StocksDAO stocks = new StocksDAO();

        System.out.println(stocks.getById(10));


        this.form = new DeleteStocksFormComponent(new StocksController(), stocks.getById(1));
        changeFormPanel.add(form);

        this.add(label, BorderLayout.NORTH);
        this.add(changeFormPanel, BorderLayout.CENTER);
    }

}


