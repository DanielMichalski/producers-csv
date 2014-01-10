package gui.zestawienie_sumaryczne.model;

import gui.zestawienie2.model.Zestawienie2;

import javax.swing.table.AbstractTableModel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ZestawienieSumaryczneTableModel extends AbstractTableModel {
    private String[] columns = {"Suma mas", "typ"};
    private List<ZestawienieSumaryczne> zestawienieSumaryczne;

    public ZestawienieSumaryczneTableModel(List<ZestawienieSumaryczne> zestawienieSumaryczne) {
        if (zestawienieSumaryczne != null) {
            this.zestawienieSumaryczne = zestawienieSumaryczne;
        } else {
            this.zestawienieSumaryczne = new ArrayList<ZestawienieSumaryczne>();
        }
    }

    @Override
    public int getRowCount() {
        return zestawienieSumaryczne.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                double sumaMas = zestawienieSumaryczne.get(rowIndex).getSumaMas();
                DecimalFormat df = new DecimalFormat("0.000");
                return df.format(sumaMas);
            case 1:
                return zestawienieSumaryczne.get(rowIndex).getTyp();
            default:
                return "";
        }
    }
}
