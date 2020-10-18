package View.Components;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Componente de saldo
 */
public class BalanceComponent extends JPanel {

    private JLabel labelBalance;

    private JLabel textValue;

    private JLabel textAction;

    private int pixels;

    public BalanceComponent() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.dropShadow(6);

        int width = (int) (screenSize.getWidth() * 0.3);
        int height = (int) (screenSize.getHeight() * 0.3);

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(width, height));

        // Componente CENTER
        JPanel centerPanel = new JPanel(new BorderLayout());
        this.labelBalance = new JLabel("Saldo");
        this.textValue = new JLabel("R$ 1500,00");

        centerPanel.add(labelBalance, BorderLayout.WEST);
        centerPanel.add(textValue, BorderLayout.EAST);

        centerPanel.setBackground(Color.WHITE);
        centerPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        this.add(centerPanel, BorderLayout.CENTER);

        // Componente SOUTH
        JPanel southPanel = new JPanel(new BorderLayout());
        this.textAction = new JLabel("Ver Todas as Ações");

        southPanel.add(textAction, BorderLayout.EAST);
        southPanel.setBackground(Color.WHITE);

        this.add(southPanel, BorderLayout.SOUTH);
    }

    private void dropShadow(int pixels) {
        this.pixels = pixels;
        Border border = BorderFactory.createEmptyBorder(pixels, pixels, pixels, pixels);
        this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(), border));
        this.setLayout(new BorderLayout());
    }

    @Override
    protected void paintComponent(Graphics g) {
        int shade = 0;
        int topOpacity = 80;
        for (int i = 0; i < pixels; i++) {
            g.setColor(new Color(shade, shade, shade, ((topOpacity / pixels) * i)));
            g.drawRect(i, i, this.getWidth() - ((i * 2) + 1), this.getHeight() - ((i * 2) + 1));
        }
    }

}
