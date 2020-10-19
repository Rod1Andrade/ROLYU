package View.Screen;

import Controller.ChangeScreenController;
import Controller.MouseChangeScreenController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Tela para mostrar as Stocks
 *
 * @author Rodrigo Andrade
 */
public class StocksScreen extends AbsctractScreen {

    public StocksScreen(JFrame parent, AbsctractScreen parentScreen) {
        super(parent, parentScreen);
        this.setLayout(new BorderLayout());

        JLabel label = new JLabel("Voltar");
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label.addMouseListener(
                new MouseChangeScreenController(parent, parentScreen)
        );

        this.add(label, BorderLayout.NORTH);
    }


}
