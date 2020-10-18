package App;

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
        this.setTitle(title);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
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
        this.add(component);
    }

    public static void main(String[] args) {
        new Application("ROLYU").run(new JPanel());
    }

}
