package gui.zestawienie2.controller;

import gui.zestawienie2.model.Zestawienie2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Zestawienie2Controller {
    private JComboBox<String> kodCB;
    private JComboBox<Integer> klientCB;
    private JLabel wynikLbl;

    private List<Zestawienie2> zestawienie2;

    public Zestawienie2Controller(List<Zestawienie2> zestawienie2) {
        this.zestawienie2 = zestawienie2;
    }

    class SluchaczPrzyciskuOblicz implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double suma = obliczSume();
            wynikLbl.setText("Suma wynosi " + suma);
        }
    }

    private double obliczSume() {
        double suma = 0;
        String kod = String.valueOf(kodCB.getSelectedItem());
        int nrKlienta = Integer.parseInt(String.valueOf(klientCB.getSelectedItem()));

        for (Zestawienie2 zestawienie2Zlisty : zestawienie2) {
            if (kod.equals(zestawienie2Zlisty.getKod()) &&
                    nrKlienta == zestawienie2Zlisty.getNrKlienta()) {
                suma += zestawienie2Zlisty.getMasa();
            }
        }

        return suma;
    }

    public void setKodCB(JComboBox<String> kodCB) {
        this.kodCB = kodCB;
    }

    public void setKlientCB(JComboBox<Integer> klientCB) {
        this.klientCB = klientCB;
    }

    public void setObliczBtn(JButton obliczBtn) {
        obliczBtn.addActionListener(new SluchaczPrzyciskuOblicz());
    }

    public void setWynikLbl(JLabel wynikLbl) {
        this.wynikLbl = wynikLbl;
    }
}
