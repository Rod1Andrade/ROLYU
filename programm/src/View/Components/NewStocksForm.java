package View.Components;

import Utils.Colors;
import Utils.Constants;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Classe para representar o formulario de 'Nova Ação'.
 *
 * @author Rodrigo Andrade
 */
public class NewStocksForm extends AbstractComponent {

    private JTextField nameField;

    private JTextField amountField;

    private JTextField uniquePriceField;

    private JButton buttonSave;

    private JButton buttonClear;

    public NewStocksForm() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.dropShadow(6);

        // O NewStocksForm componente ocupa 30% do tamanho da tela na largura e 60% na altura.
        int width = (int) (screenSize.getWidth() * 0.3);
        int height = (int) (screenSize.getHeight() * 0.5);

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(width, height));

        // *************************************************
        // Titulo do Topo
        // *************************************************
        JPanel titleTopPanel = new JPanel(new BorderLayout());
        titleTopPanel.setBorder(new EmptyBorder(15, 10, 5, 10));
        titleTopPanel.setBackground(Color.white);

        JLabel title = new JLabel(Constants.TITLE_NEW_STOCKS);
        title.setFont(new Font("Arial", Font.PLAIN, 14));
        title.setForeground(Colors.PRIMARY_COLOR);
        titleTopPanel.add(title, BorderLayout.WEST);

        this.add(titleTopPanel, BorderLayout.NORTH);

        // Grid Layout
        GridLayout gridLayout = new GridLayout(6, 1);

        // *************************************************
        // Campos Centrais
        // *************************************************
        JPanel centerFieldPanel = new JPanel(gridLayout);
        centerFieldPanel.setBorder(new EmptyBorder(15, 20, 100, 20));

        JPanel labelPanel = new JPanel(new BorderLayout());
        JPanel fieldPanel = new JPanel(new BorderLayout());

        // Name Label
        JLabel nameLabel = new JLabel(Constants.LABEL_NAME);
        labelPanel.add(nameLabel, BorderLayout.WEST);

        // Name Field
        this.nameField = new JTextField();

        fieldPanel.add(nameField, BorderLayout.CENTER);

        centerFieldPanel.add(nameLabel);
        centerFieldPanel.add(fieldPanel);

        // Amount Label
        fieldPanel = new JPanel(new BorderLayout());
        JLabel amoutLabel = new JLabel(Constants.LABEL_AMOUNT);
        labelPanel.add(amoutLabel, BorderLayout.WEST);

        // Amount Field
        this.amountField = new JTextField();

        fieldPanel.add(amountField, BorderLayout.CENTER);

        centerFieldPanel.add(amoutLabel);
        centerFieldPanel.add(fieldPanel);

        // Unique Price Label
        fieldPanel = new JPanel(new BorderLayout());

        JLabel uniquePriceLabel = new JLabel(Constants.LABEL_UNIQUE_PRICE);
        labelPanel.add(uniquePriceLabel, BorderLayout.WEST);

        // Unique Price Field
        this.uniquePriceField = new JTextField();

        fieldPanel.add(uniquePriceField, BorderLayout.CENTER);

        centerFieldPanel.add(uniquePriceLabel);
        centerFieldPanel.add(fieldPanel);
        centerFieldPanel.setBackground(Color.white);

        this.add(centerFieldPanel, BorderLayout.CENTER);

        // *************************************************
        // Seção de Ação
        // *************************************************
        JPanel actionPanel = new JPanel(new BorderLayout());
        actionPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        this.buttonSave = new JButton(Constants.LABEL_SAVE);
        this.buttonClear = new JButton(Constants.LABEL_Clear);
        this.actionButtonConfig();

        gridLayout = new GridLayout(1, 2);
        gridLayout.setHgap(10);

        JPanel buttonPanel = new JPanel(gridLayout);
        buttonPanel.add(buttonClear);
        buttonPanel.add(buttonSave);

        actionPanel.add(buttonPanel, BorderLayout.EAST);
        actionPanel.setBackground(Color.white);

        this.add(actionPanel, BorderLayout.SOUTH);
    }

    /**
     * Aplicação de certas configurações ao botões de ação desse componente.
     */
    private void actionButtonConfig() {
        // Button Save
        this.buttonSave.setContentAreaFilled(true);
        this.buttonSave.setFocusPainted(false);
        this.buttonSave.setRolloverEnabled(false);
        this.buttonSave.setBorderPainted(true);

        this.buttonSave.setModel(new ResetButtonModel());

        this.buttonSave.setBackground(Color.white);
        this.buttonSave.addMouseListener(new MouseHover(buttonSave, Colors.PRIMARY_COLOR, Color.WHITE));
        this.buttonSave.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Button Clear
        this.buttonClear.setContentAreaFilled(true);
        this.buttonClear.setFocusPainted(false);
        this.buttonClear.setRolloverEnabled(false);
        this.buttonClear.setBorderPainted(true);

        this.buttonClear.setModel(new ResetButtonModel());

        this.buttonClear.setBackground(Color.white);
        this.buttonClear.addMouseListener(new MouseHover(buttonClear, Colors.DANGER_COLOR, Color.WHITE));
        this.buttonClear.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

}
