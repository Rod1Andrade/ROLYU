package View.Screen;

import Controller.MouseChangeScreenController;
import Utils.Constants;
import View.Components.BalanceComponent;
import View.Components.ButtonComponent;
import View.Components.WalletComponent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

/**
 * Tela para mostrar as Stocks
 *
 * @author Rodrigo Andrade
 */
public class StocksScreen extends AbsctractScreen {

    WalletComponent wallet;
    ChangeStockScreen changeStockScreen;
    MouseListener mouseListener;
    ButtonComponent buttonChange;
    StocksScreen thisScreen;


    public StocksScreen(JFrame parent, AbsctractScreen parentScreen) {
        super(parent, parentScreen);
        this.setLayout(new BorderLayout());
        this.wallet = new WalletComponent();
        this.thisScreen = this;


        JLabel label = new JLabel("Voltar");
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label.addMouseListener(
                new MouseChangeScreenController(parent, parentScreen)
        );

        JPanel walletPanel = new JPanel();

        this.buttonChange = new ButtonComponent(Constants.LABEL_CHANGE, Color.BLUE, Color.WHITE);


        this.buttonChange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeStockScreen = new ChangeStockScreen(parent, thisScreen, wallet.getNameofSelectedRow());

                mouseListener = new MouseChangeScreenController(parent, changeStockScreen);
                buttonChange.addMouseListener(mouseListener);
            }
        });


        walletPanel.add(wallet);

        walletPanel.setBorder(new EmptyBorder(200, 0, 0, 0));

        this.add(label, BorderLayout.NORTH);
        this.add(walletPanel, BorderLayout.CENTER);
        this.add(buttonChange, BorderLayout.SOUTH);

    }
}
