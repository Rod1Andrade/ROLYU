package Controller;

import javax.swing.*;

/**
 * Classe responsavel por fazer a navegacao entre telas.
 */
public class NavigatorController {

    /**
     * Navega de um baseFrame para um JPanel
     *
     * @param baseFrame - Frame base
     * @param toPanel   - Painel e navegacao
     */
    public static void to(JFrame baseFrame, JPanel toPanel) {
        baseFrame.getContentPane().removeAll();
        baseFrame.getContentPane().add(toPanel);
        baseFrame.getContentPane().doLayout();
        baseFrame.revalidate();
        baseFrame.repaint();
        baseFrame.update(baseFrame.getGraphics());
    }

}
