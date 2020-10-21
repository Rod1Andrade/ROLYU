package View.Styles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Mouse Hover - Comumente usada em botao
 *
 * @author Rodrigo Andrade
 */
public class MouseHover extends MouseAdapter {
    private final JButton button;
    private final Color oldColor;
    private final Color hoverColor;
    private final Color oldTextColor;
    private final Color textHoverColor;

    public MouseHover(JButton button, Color hoverColor, Color textHoverColor) {
        this.button = button;
        this.oldColor = button.getBackground();
        this.oldTextColor = button.getForeground();
        this.hoverColor = hoverColor;
        this.textHoverColor = textHoverColor;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        super.mouseEntered(e);
        this.button.setBackground(this.hoverColor);
        this.button.setForeground(this.textHoverColor);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        super.mouseExited(e);
        this.button.setBackground(this.oldColor);
        this.button.setForeground(oldTextColor);
    }
}
