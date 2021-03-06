package View.Components;

import Utils.Colors;
import Utils.Constants;
import database.dao.StocksDAO;
import model.Stocks;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseListener;
import java.lang.invoke.ConstantCallSite;
import java.text.DecimalFormat;
import java.util.ArrayList;

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

    DecimalFormat df = new DecimalFormat("#,###.00");

    public BalanceComponent(MouseListener mouseListener) {

        this.dropShadow(6);

        // O Balance componente ocupa 30% do tamanho da tela em ambas as direcoes.
        int width = (int) (Constants.SCREEN_SIZE.getWidth() * 0.3);
        int height = (int) (Constants.SCREEN_SIZE.getHeight() * 0.3);

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(width, height));

        // Componente CENTER
        JPanel centerPanel = new JPanel(new BorderLayout());

        Font font = new Font("Arial", Font.PLAIN, 33);

        this.labelBalance = new JLabel(Constants.LABEL_BALANCE);
        this.labelBalance.setFont(font);
        this.labelBalance.setForeground(Colors.PRIMARY_COLOR);

        this.textValue = new JLabel("R$ "+ df.format(getAllTotalPrice()));
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
        this.textAction.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.textAction.addMouseListener(mouseListener);

        southPanel.add(textAction, BorderLayout.EAST);
        southPanel.setBackground(Color.WHITE);
        southPanel.setBorder(new EmptyBorder(0, 0, 10, 20));

        this.add(southPanel, BorderLayout.SOUTH);
    }

    public Double getAllTotalPrice() {

        StocksDAO stocksDAO = new StocksDAO();

        ArrayList<Stocks> stocks = (ArrayList) stocksDAO.getAll();

        Double totalPriceAll = 0.0;
        for(Stocks stock : stocks) {
            totalPriceAll += stock.getTotalPrice();
        }

        return totalPriceAll;
    }
}
