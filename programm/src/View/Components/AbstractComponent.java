package View.Components;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Componente abstrato com implementações padrões.
 */
public abstract class AbstractComponent extends JPanel {

    private int pixels;

    private int opacity;

    private int shade;

    protected void dropShadow(int pixels, int ... args) {
        this.pixels = pixels;

        this.opacity = args.length == 1 ? args[0] : 0;
        this.shade = args.length == 2 ? args[1] : 0;

        Border border = BorderFactory.createEmptyBorder(pixels, pixels, pixels, pixels);
        this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(), border));
        this.setLayout(new BorderLayout());
    }

    @Override
    protected void paintComponent(Graphics g) {
        int shade = this.shade;
        int topOpacity = this.opacity != 0 ? this.opacity : 40;
        for (int i = 0; i < pixels; i++) {
            g.setColor(new Color(shade, shade, shade, ((topOpacity / pixels) * i)));
            g.drawRect(i, i, this.getWidth() - ((i * 2) + 1), this.getHeight() - ((i * 2) + 1));
        }
    }

}
