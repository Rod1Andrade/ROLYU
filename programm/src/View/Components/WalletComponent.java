package View.Components;

import Utils.Constants;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class WalletComponent extends AbstractComponent {

    private JTable walletTable;
    DefaultTableModel model = new DefaultTableModel();

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

        JScrollPane scroll = new JScrollPane(createTable());

        this.add(scroll);
    }

    private JTable createTable() {
        walletTable = new JTable(model);

        model.addColumn("NOME");
        model.addColumn("QUANTIDADE");
        model.addColumn("TOTAL");
        model.addColumn("OPÇÕES");


        return walletTable;
    }
}
