package gui.zestawienie2.view;

import gui.zestawienie2.model.Zestawienie2;
import gui.zestawienie2.model.Zestawienie2TableModel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Zestawienie2Panel extends JPanel {
    private List<Zestawienie2> zestawienie2;

    public Zestawienie2Panel(List<Zestawienie2> zestawienie2) {
        this.zestawienie2 = zestawienie2;

        setUpPanel();
        initializeComponents();
    }

    private void setUpPanel() {
        setLayout(new BorderLayout());
    }

    private void initializeComponents() {
        Zestawienie2TableModel zestawienie2TableModel = new Zestawienie2TableModel(zestawienie2);
        JTable jTable = new JTable(zestawienie2TableModel);
        jTable.setAutoCreateRowSorter(true);
        add(new JScrollPane(jTable), BorderLayout.CENTER);
    }
}
