package View.Screen;

import Controller.ChangeScreenController;
import Controller.MouseChangeScreenController;
import View.Components.BalanceComponent;
import View.Components.NewStocksFormComponent;
import model.Stocks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Tela Principal
 */
public class MainScreen extends AbsctractScreen {

    private StocksScreen stocksScreen;

    private BalanceComponent balanceComponent;

    private NewStocksFormComponent newStocksForm;

    public MainScreen(JFrame parent) {
        super(parent, null);

        this.stocksScreen = new StocksScreen(parent, this);

        GridLayout gridLayout = new GridLayout(1, 2);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);

        this.setLayout(gridLayout);
        this.setBackground(Color.WHITE);

        // Coluna 1
        JPanel balanceComponentPanel = new JPanel();
        this.balanceComponent = new BalanceComponent(
                new MouseChangeScreenController(this.parent, this.stocksScreen)
        );
        balanceComponentPanel.add(balanceComponent);
        balanceComponentPanel.setBackground(Color.WHITE);

        this.add(balanceComponentPanel);

        // Coluna 2
        JPanel newStocksFormPanel = new JPanel();
        this.newStocksForm = new NewStocksFormComponent();
        newStocksFormPanel.add(newStocksForm);
        newStocksFormPanel.setBackground(Color.WHITE);

        this.add(newStocksFormPanel);
    }

}
