package View.Components;

import Utils.Colors;
import Utils.Constants;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Componente de saldo
 *
 * @author Rodrigo Andrade
 */
public class BalanceComponent extends AbstractComponent {

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

        Font font = new Font("Arial", Font.PLAIN, 33);

        this.labelBalance = new JLabel(Constants.LABEL_BALANCE);
        this.labelBalance.setFont(font);
        this.labelBalance.setForeground(Colors.PRIMARY_COLOR);

        this.textValue = new JLabel("R$ 1500,00");
        this.textValue.setFont(font);

        centerPanel.add(labelBalance, BorderLayout.WEST);
        centerPanel.add(textValue, BorderLayout.EAST);

        centerPanel.setBackground(Color.WHITE);
        centerPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        this.add(centerPanel, BorderLayout.CENTER);

        // Componente SOUTH
        JPanel southPanel = new JPanel(new BorderLayout());
        this.textAction = new JLabel(Constants.LABEL_TODAS_ACOES);
        this.textAction.setForeground(Colors.PRIMARY_COLOR);

        southPanel.add(textAction, BorderLayout.EAST);
        southPanel.setBackground(Color.WHITE);
        southPanel.setBorder(new EmptyBorder(0,0, 10, 20));

        this.add(southPanel, BorderLayout.SOUTH);
    }
}
