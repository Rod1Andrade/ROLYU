package View.Screen;

import Controller.MouseChangeScreenController;
import View.Components.WalletComponent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseListener;

/**
 * Tela para mostrar as Stocks
 *
 * @author Rodrigo Andrade
 */
public class StocksScreen extends AbsctractScreen {

    WalletComponent wallet;
    ChangeStockScreen changeStockScreen;

    public StocksScreen(JFrame parent, AbsctractScreen parentScreen) {
        super(parent, parentScreen);
        this.setLayout(new BorderLayout());
        this.changeStockScreen = new ChangeStockScreen(parent, this);

        JLabel label = new JLabel("Voltar");
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label.addMouseListener(
                new MouseChangeScreenController(parent, parentScreen)
        );

        JPanel walletPanel = new JPanel();


        this.wallet = new WalletComponent(
                new MouseChangeScreenController(this.parent, this.changeStockScreen)
        );
        walletPanel.add(wallet);

        walletPanel.setBorder(new EmptyBorder(200, 0, 0, 0));

        this.add(label, BorderLayout.NORTH);
        this.add(walletPanel, BorderLayout.CENTER);
    }


}
