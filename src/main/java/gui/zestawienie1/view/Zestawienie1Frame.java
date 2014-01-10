package gui.zestawienie1.view;

import database.dao.Zestawienie1Dao;
import gui.zestawienie1.controller.Zestawienie1Controller;
import gui.zestawienie1.model.Zestawienie1;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class Zestawienie1Frame extends JDialog {
    public Zestawienie1Frame(List<Zestawienie1> zestawienie1) {
        setUpFrame();
        initializeComponents(zestawienie1);
    }

    private void setUpFrame() {
        setSize(new Dimension(1000, 500));
        setTitle("Zestawienie1");
        setLocationRelativeTo(null);
        setModal(true);
    }

    private void initializeComponents(List<Zestawienie1> zestawienie1) {

        Zestawienie1Controller zestawienie1Controller = new Zestawienie1Controller(zestawienie1);

        Zestawienie1TablePanel tablePanel = new Zestawienie1TablePanel();
        Zestawienie1BtnPanel btnPanel = new Zestawienie1BtnPanel(getClients(zestawienie1), getKod(zestawienie1));

        add(tablePanel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);

        zestawienie1Controller.setKlientCB(btnPanel.getKlientCB());
        zestawienie1Controller.setWynikLbl(btnPanel.getWynikLbl());
        zestawienie1Controller.setObliczBtn(btnPanel.getObliczBtn());
        zestawienie1Controller.setKodCB(btnPanel.getKodCB());
    }

    private Vector<Integer> getClients(List<Zestawienie1> zestawienie1) {
        HashSet<Integer> clients = new HashSet<Integer>();

        for (Zestawienie1 zestawienie : zestawienie1) {
            clients.add(zestawienie.getNrKlienta());
        }

        Vector<Integer> strings = new Vector<Integer>(clients);
        Collections.sort(strings);

        return strings;
    }

    private Vector<String> getKod(java.util.List<Zestawienie1> zestawienie1) {
        HashSet<String> kody = new HashSet<String>();

        for (Zestawienie1 zestawienie : zestawienie1) {
            kody.add(zestawienie.getKod());
        }

        Vector<String> strings = new Vector<String>(kody);
        Collections.sort(strings);

        return strings;
    }
}
