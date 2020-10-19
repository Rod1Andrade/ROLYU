package View.Screen;

import Controller.ChangeScreenController;
import Controller.Navigator;
import View.Components.BalanceComponent;
import View.Components.NewStocksFormComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Tela Principal
 */
public class MainScreen extends JPanel {

    private JFrame baseFrame;

    private BalanceComponent balanceComponent;

    private NewStocksFormComponent newStocksForm;

    public MainScreen(JFrame baseFrame) {

        this.baseFrame = baseFrame;

        GridLayout gridLayout = new GridLayout(1, 2);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);

        this.setLayout(gridLayout);
        this.setBackground(Color.WHITE);

        // Coluna 1
        JPanel balanceComponentPanel = new JPanel();
        this.balanceComponent = new BalanceComponent(
                new TextAction(baseFrame, new StocksScreen())
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

    private class TextAction implements MouseListener {

        private JFrame frame;
        private JPanel panel;

        public TextAction(JFrame frame, JPanel panel) {
            this.frame = frame;
            this.panel = panel;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            new ChangeScreenController(this.frame, this.panel).change();
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

}
