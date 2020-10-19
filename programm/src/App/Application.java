package App;

import Utils.Constants;
import View.Screen.MainScreen;

import javax.swing.*;
import java.awt.*;

/**
 * Classe Principal - Entry point
 */
public class Application extends JFrame {

    /**
     * Constructor
     * @param title
     */
    private Application(String title) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int width = (int) (screenSize.getWidth() * 0.7);
        int height = (int) (screenSize.getHeight() * 0.8);

        this.setTitle(title);
        this.setResizable(false);
        this.setMinimumSize(new Dimension(width, height));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Roda aplicacao com o componente
     * que deve ser iniciado juntamente.
     * @param component Componente
     */
    private void run(JComponent component) {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(component);
    }

    public static void main(String[] args) {
        new Application(Constants.TITLE_APP).run(new MainScreen());
    }

}
