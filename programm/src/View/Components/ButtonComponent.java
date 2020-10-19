package View.Components;

import View.Styles.MouseHover;
import View.Styles.ResetButtonModel;

import javax.swing.*;
import java.awt.*;

/**
 * Botao usado na aplicacao
 *
 * @author Rodrigo Andrade
 */
public class ButtonComponent extends JButton {

    /**
     * Construtor
     * @param text - Texto do botao
     * @param buttonColor - Cor Primaria do botao
     * @param textColor - Cor de texto do botao
     */
    public ButtonComponent(String text, Color buttonColor, Color textColor) {
        this.setContentAreaFilled(true);
        this.setFocusPainted(false);
        this.setRolloverEnabled(false);
        this.setBorderPainted(true);

        this.setModel(new ResetButtonModel());

        this.setText(text);
        this.setBackground(buttonColor);
        this.setForeground(textColor);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    /**
     * Acao ativada quando o mouse passa por cima do botao.
     */
    public void hover(Color hoverColor, Color textColor) {
        this.addMouseListener(new MouseHover(this, hoverColor, textColor));
    }
}
