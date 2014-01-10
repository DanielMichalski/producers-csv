package gui.zestawienie_sumaryczne.widok;

import gui.zestawienie_sumaryczne.model.ZestawienieSumaryczne;
import gui.zestawienie_sumaryczne.model.ZestawienieSumaryczneTableModel;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class ZestawienieSumarycznePanel extends JPanel {

    public ZestawienieSumarycznePanel(List<ZestawienieSumaryczne> zestawienieSumaryczne) {
        setUpPanel();
        initializeComponents(zestawienieSumaryczne);
    }

    private void setUpPanel() {
        setLayout(new BorderLayout());
    }

    private void initializeComponents(List<ZestawienieSumaryczne> zestawienieSumaryczne) {
        ZestawienieSumaryczneTableModel zestawienieSumaryczneTableModel = new ZestawienieSumaryczneTableModel(zestawienieSumaryczne);
        JTable jTable = new JTable(zestawienieSumaryczneTableModel);
        jTable.setAutoCreateRowSorter(true);
        add(new JScrollPane(jTable), BorderLayout.CENTER);
    }
}
