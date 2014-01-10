package gui.zestawienie2.view;

import gui.zestawienie2.controller.Zestawienie2Controller;
import gui.zestawienie2.model.Zestawienie2;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class Zestawienie2Frame extends JDialog {
    public Zestawienie2Frame(List<Zestawienie2> zestawienie2) {
        setUpFrame();
        initializeComponents(zestawienie2);
    }

    private void setUpFrame() {
        setSize(new Dimension(1000, 500));
        setTitle("Zestawienie2");
        setLocationRelativeTo(null);
        setModal(true);
    }

    private void initializeComponents(List<Zestawienie2> zestawienie2) {
        Zestawienie2Controller zestawienie1Controller = new Zestawienie2Controller(zestawienie2);

        Zestawienie2Panel tablePanel = new Zestawienie2Panel(zestawienie2);
        Zestawienie2BtnPanel btnPanel = new Zestawienie2BtnPanel(getClients(zestawienie2), getKod(zestawienie2));

        add(tablePanel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);

        zestawienie1Controller.setKlientCB(btnPanel.getKlientCB());
        zestawienie1Controller.setKodCB(btnPanel.getKodCB());
        zestawienie1Controller.setObliczBtn(btnPanel.getObliczBtn());
        zestawienie1Controller.setWynikLbl(btnPanel.getWynikLbl());
    }

    private Vector<Integer> getClients(List<Zestawienie2> zestawienie2) {
        HashSet<Integer> clients = new HashSet<Integer>();

        for (Zestawienie2 zestawienie : zestawienie2) {
            clients.add(zestawienie.getNrKlienta());
        }

        Vector<Integer> strings = new Vector<Integer>(clients);
        Collections.sort(strings);

        return strings;
    }

    private Vector<String> getKod(List<Zestawienie2> zestawienie2) {
        HashSet<String> kody = new HashSet<String>();

        for (Zestawienie2 zestawienie : zestawienie2) {
            kody.add(zestawienie.getKod());
        }

        Vector<String> strings = new Vector<String>(kody);
        Collections.sort(strings);

        return strings;
    }
}
