package Controller;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Controller que implementa o MouseListener
 * e invoca o ChangeScreenController.
 */
public class MouseChangeScreenController implements MouseListener {

    private JFrame frame;
    private JPanel panel;

    public MouseChangeScreenController(JFrame frame, JPanel panel) {
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
