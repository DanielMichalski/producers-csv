package gui.zestawienie1.view;

import javax.swing.*;
import java.util.Vector;

public class Zestawienie1BtnPanel extends JPanel {
    private JComboBox<String> kodCB;
    private JComboBox<Integer> klientCB;
    private JButton obliczBtn;
    private JLabel wynikLbl;

    public Zestawienie1BtnPanel(Vector<Integer> clients, Vector<String> kod) {
        initializeComponents(clients, kod);
    }

    private void initializeComponents(Vector<Integer> clients, Vector<String> kod) {
        JLabel kodLbl = new JLabel("Kod:");
        kodCB = new JComboBox<String>(kod);
        JLabel klientLbl = new JLabel("Klient:");
        klientCB = new JComboBox<Integer>(clients);
        obliczBtn = new JButton("Oblicz sumę");
        wynikLbl = new JLabel();

        add(kodLbl);
        add(kodCB);
        add(klientLbl);
        add(klientCB);
        add(obliczBtn);
        add(wynikLbl);
    }

    public JComboBox<String> getKodCB() {
        return kodCB;
    }

    public JComboBox<Integer> getKlientCB() {
        return klientCB;
    }

    public JButton getObliczBtn() {
        return obliczBtn;
    }

    public JLabel getWynikLbl() {
        return wynikLbl;
    }
}
