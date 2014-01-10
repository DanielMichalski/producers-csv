package gui.loading;

import database.dao.Zestawienie1Dao;
import database.dao.Zestawienie2Dao;
import gui.zestawienie1.model.Zestawienie1;
import gui.zestawienie1.view.Zestawienie1Frame;
import gui.zestawienie2.model.Zestawienie2;
import gui.zestawienie2.view.Zestawienie2Frame;
import gui.zestawienie_sumaryczne.model.ZestawienieSumaryczne;
import gui.zestawienie_sumaryczne.widok.ZestawienieSumaryczneFrame;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class LoadingFrame extends JDialog {
    private int i;

    public LoadingFrame(int i) {
        this.i = i;

        setUpFrame();
        initializeComponents();
    }

    private void setUpFrame() {
        setSize(new Dimension(200, 200));
        setTitle("Ładowanie");
        setLocationRelativeTo(null);
        setModal(true);
    }

    private void initializeComponents() {
        LoadingPanel loadingPanel = new LoadingPanel();
        add(loadingPanel);

        new Thread(new Runnable() {
            @Override
            public void run() {
                if (i == 1) {
                    List<Zestawienie1> zestawienie1 = Zestawienie1Dao.pobierzZestawienie1();

                    dispose();

                    Zestawienie1Frame frame1 = new Zestawienie1Frame(zestawienie1);
                    frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    frame1.setVisible(true);

                } else if (i == 2) {
                    List<Zestawienie2> zestawienie2 = Zestawienie2Dao.pobierzZestawienie2();

                    dispose();

                    Zestawienie2Frame frame2 = new Zestawienie2Frame(zestawienie2);
                    frame2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    frame2.setVisible(true);

                } else if (i == 3) {
                    List<ZestawienieSumaryczne> zestawienieSumaryczne = Zestawienie2Dao.pobierzZestawienieSumaryczne();

                    dispose();

                    ZestawienieSumaryczneFrame frame2 = new ZestawienieSumaryczneFrame(zestawienieSumaryczne);
                    frame2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    frame2.setVisible(true);
                }
            }
        }).start();

        setVisible(true);
    }
}
