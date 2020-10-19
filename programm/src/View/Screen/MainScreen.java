package View.Screen;

import View.Components.BalanceComponent;
import View.Components.NewStocksForm;

import javax.swing.*;
import java.awt.*;

/**
 * Tela Principal
 */
public class MainScreen extends JPanel {

    private BalanceComponent balanceComponent;

    private NewStocksForm newStocksForm;

    public MainScreen() {

        GridLayout gridLayout = new GridLayout(1, 2);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);

        this.setLayout(gridLayout);
        this.setBackground(Color.WHITE);

        // Coluna 1
        JPanel balanceComponentPanel = new JPanel();
        this.balanceComponent = new BalanceComponent();
        balanceComponentPanel.add(balanceComponent);
        balanceComponentPanel.setBackground(Color.WHITE);

        this.add(balanceComponentPanel);

        // Coluna 2
        JPanel newStocksFormPanel = new JPanel();
        this.newStocksForm = new NewStocksForm();
        newStocksFormPanel.add(newStocksForm);
        newStocksFormPanel.setBackground(Color.WHITE);

        this.add(newStocksFormPanel);
    }

}
