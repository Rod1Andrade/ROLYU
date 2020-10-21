package Controller;

import javax.swing.*;

/**
 * Classe de controle da mudanca de tela
 *
 * @author Rodrigo Andrade
 */
public class ChangeScreenController {
    private JFrame baseFrame;
    private JPanel toPanel;

    public ChangeScreenController(JFrame baseFrame, JPanel toPanel) {
        this.baseFrame = baseFrame;
        this.toPanel = toPanel;
    }

    /**
     * Faz a mudanca entre tela.
     */
    public void change() {
        NavigatorController.to(this.baseFrame, this.toPanel);
    }
}
