package gui.zestawienie2.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class Zestawienie2TableModel extends AbstractTableModel {
    private String[] columns = {"Numer karty", "data wydania", "masa", "kod", "nr klienta", "firma", "nazwa skrocona", "typ", "opis"};
    private List<Zestawienie2> zestawienia2;

    public Zestawienie2TableModel(List<Zestawienie2> zestawienia2) {
        if (zestawienia2 != null) {
            this.zestawienia2 = zestawienia2;
        } else {
            this.zestawienia2 = new ArrayList<Zestawienie2>();
        }
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public int getRowCount() {
        return zestawienia2.size();
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return zestawienia2.get(rowIndex).getNrKarty();
            case 1:
                return zestawienia2.get(rowIndex).getDataW();
            case 2:
                return zestawienia2.get(rowIndex).getMasa();
            case 3:
                return zestawienia2.get(rowIndex).getKod();
            case 4:
                return zestawienia2.get(rowIndex).getNrKlienta();
            case 5:
                return zestawienia2.get(rowIndex).getFirma();
            case 6:
                return zestawienia2.get(rowIndex).getNazwaSkrocona();
            case 7:
                return zestawienia2.get(rowIndex).getTyp();
            case 8:
                return zestawienia2.get(rowIndex).getOpis();
            default:
                return "";
        }
    }
}
