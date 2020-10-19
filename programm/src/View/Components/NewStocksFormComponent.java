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
public class NewStocksFormComponent extends AbstractComponent {

    private JTextField nameField;

    private JTextField amountField;

    private JTextField uniquePriceField;

    private ButtonComponent buttonSave;

    private ButtonComponent buttonClear;

    public NewStocksFormComponent() {

        this.dropShadow(6);

        // O NewStocksForm componente ocupa 30% do tamanho da tela na largura e 60% na altura.
        int width = (int) (Constants.SCREEN_SIZE.getWidth() * 0.3);
        int height = (int) (Constants.SCREEN_SIZE.getHeight() * 0.5);

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

        this.buttonSave = new ButtonComponent(Constants.LABEL_SAVE, Color.WHITE, Color.BLACK);
        this.buttonSave.hover(Colors.PRIMARY_COLOR, Color.WHITE);
        this.buttonClear = new ButtonComponent(Constants.LABEL_Clear, Color.WHITE, Color.BLACK);
        this.buttonClear.hover(Colors.DANGER_COLOR, Color.WHITE);

        gridLayout = new GridLayout(1, 2);
        gridLayout.setHgap(10);

        JPanel buttonPanel = new JPanel(gridLayout);
        buttonPanel.add(buttonClear);
        buttonPanel.add(buttonSave);

        actionPanel.add(buttonPanel, BorderLayout.EAST);
        actionPanel.setBackground(Color.white);

        this.add(actionPanel, BorderLayout.SOUTH);
    }
}
