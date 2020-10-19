package Controller;

import javax.swing.*;

/**
 * Classe responsavel por fazer a navegacao entre telas.
 */
public class Navigator  {

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
        baseFrame.update(baseFrame.getGraphics());
    }

}
