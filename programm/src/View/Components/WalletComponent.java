package View.Components;

import Utils.Constants;

import javax.swing.*;
import java.awt.*;

public class WalletComponent extends AbstractComponent {

    private JTable walletTable;

    String [] collums = {"NOME", "QUANTIDADE", "TOTAL"};
    Object [][] data = {
            {"ITSA4", "20", "R$ 340,00"},
            {"ABC3", "10", "R$ 340,00"},
            {"CCS3", "30", "R$ 340,00"},
            {"ITSA4", "20", "R$ 340,00"},
            {"ABC3", "10", "R$ 340,00"},
            {"CCS3", "30", "R$ 340,00"},
            {"ITSA4", "20", "R$ 340,00"},
            {"ABC3", "10", "R$ 340,00"},
            {"CCS3", "30", "R$ 340,00"},
            {"ITSA4", "20", "R$ 340,00"},
            {"ABC3", "10", "R$ 340,00"},
            {"CCS3", "30", "R$ 340,00"},
            {"ITSA4", "20", "R$ 340,00"},
            {"ABC3", "10", "R$ 340,00"},
            {"CCS3", "30", "R$ 340,00"},
            {"ITSA4", "20", "R$ 340,00"},
            {"ABC3", "10", "R$ 340,00"},
            {"CCS3", "30", "R$ 340,00"},
            {"ITSA4", "20", "R$ 340,00"},
            {"ABC3", "10", "R$ 340,00"},
            {"CCS3", "30", "R$ 340,00"},
            {"ITSA4", "20", "R$ 340,00"},
            {"ABC3", "10", "R$ 340,00"},
            {"CCS3", "30", "R$ 340,00"},
            {"ITSA4", "20", "R$ 340,00"},
            {"ABC3", "10", "R$ 340,00"},
            {"CCS3", "30", "R$ 340,00"}
    };


    public WalletComponent() {

        this.dropShadow(6);

        int width = (int) (Constants.SCREEN_SIZE.getWidth() * 0.5);
        int height = (int) (Constants.SCREEN_SIZE.getHeight() * 0.3);

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(width, height));

        walletTable = new JTable(data, collums);


        JScrollPane scroll = new JScrollPane(walletTable);

        this.add(scroll);
    }
}
