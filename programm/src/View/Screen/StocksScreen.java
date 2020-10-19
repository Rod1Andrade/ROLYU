package View.Screen;

import javax.swing.*;
import java.awt.*;

/**
 * Tela para mostrar as Stocks
 *
 * @author Rodrigo Andrade
 */
public class StocksScreen extends JPanel {

    public StocksScreen() {
        this.setLayout(new BorderLayout());
        this.add(new JLabel("Bem Vindo"), BorderLayout.NORTH);
    }

}
