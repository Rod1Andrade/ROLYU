package View.Screen;

import Controller.MouseChangeScreenController;
import View.Components.BalanceComponent;
import View.Components.NewStocksFormComponent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

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

        this.setBorder(new EmptyBorder(50, 70, 50, 70));
        this.add(newStocksFormPanel);
    }

}
