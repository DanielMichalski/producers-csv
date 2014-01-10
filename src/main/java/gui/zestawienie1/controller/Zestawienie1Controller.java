package gui.zestawienie1.controller;

import gui.zestawienie1.model.Zestawienie1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Zestawienie1Controller {
    private JComboBox<String> kodCB;
    private JComboBox<Integer> klientCB;
    private JLabel wynikLbl;

    private List<Zestawienie1> zestawienie1;

    public Zestawienie1Controller(List<Zestawienie1> zestawienie1) {
        this.zestawienie1 = zestawienie1;
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

        for (Zestawienie1 zestawienie1Zlisty : zestawienie1) {
            if (kod.equals(zestawienie1Zlisty.getKod()) &&
                    nrKlienta == zestawienie1Zlisty.getNrKlienta()) {
                suma += zestawienie1Zlisty.getMasa();
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
