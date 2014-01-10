package gui.zestawienie1.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class Zestawienie1TableModel extends AbstractTableModel {
    private String[] columns = {"Numer karty", "data dodania", "kod", "nr klienta", "masa", "jedn", "firma", "typ", "nazwa skrocona", "nr mag", "opis"};
    private List<Zestawienie1> zestawienia1;

    public Zestawienie1TableModel(List<Zestawienie1> zestawienia1) {
        if (zestawienia1 != null) {
            this.zestawienia1 = zestawienia1;
        } else {
            this.zestawienia1 = new ArrayList<Zestawienie1>();
        }
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public int getRowCount() {
        return zestawienia1.size();
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return zestawienia1.get(rowIndex).getNrKarty();
            case 1:
                return zestawienia1.get(rowIndex).getDataD();
            case 2:
                return zestawienia1.get(rowIndex).getKod();
            case 3:
                return zestawienia1.get(rowIndex).getNrKlienta();
            case 4:
                return zestawienia1.get(rowIndex).getMasa();
            case 5:
                return zestawienia1.get(rowIndex).getJedn();
            case 6:
                return zestawienia1.get(rowIndex).getFirma();
            case 7:
                return zestawienia1.get(rowIndex).getTyp();
            case 8:
                return zestawienia1.get(rowIndex).getNazwaSkrocona();
            case 9:
                return zestawienia1.get(rowIndex).getNrMag();
            case 10:
                return zestawienia1.get(rowIndex).getOpis();
            default:
                return "";
        }
    }
}
