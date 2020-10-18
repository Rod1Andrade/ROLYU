package View.Screen;

import View.Components.BalanceComponent;

import javax.swing.*;
import java.awt.*;

/**
 * Tela Principal
 */
public class MainScreen extends JPanel {

    private BalanceComponent balanceComponent;

    public MainScreen() {

        GridLayout gridLayout = new GridLayout(1, 2);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);

        this.setLayout(gridLayout);

        JPanel balanceComponentPanel = new JPanel();
        this.balanceComponent = new BalanceComponent();
        balanceComponentPanel.add(balanceComponent);

        this.add(balanceComponentPanel);
        this.add(new JPanel());
    }

}
