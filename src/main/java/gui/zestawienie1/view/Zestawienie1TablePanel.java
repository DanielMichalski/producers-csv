package gui.zestawienie1.view;

import database.dao.Zestawienie1Dao;
import gui.zestawienie1.model.Zestawienie1;
import gui.zestawienie1.model.Zestawienie1TableModel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Zestawienie1TablePanel extends JPanel {
    public Zestawienie1TablePanel() {
        setUpPanel();
        initializeComponents();
    }

    private void setUpPanel() {
        setLayout(new BorderLayout());
    }

    private void initializeComponents() {
        List<Zestawienie1> zestawienia = Zestawienie1Dao.pobierzZestawienie1();
        Zestawienie1TableModel zestawienie1TableModel = new Zestawienie1TableModel(zestawienia);
        JTable jTable = new JTable(zestawienie1TableModel);
        jTable.setAutoCreateRowSorter(true);
        add(new JScrollPane(jTable), BorderLayout.CENTER);
    }
}
