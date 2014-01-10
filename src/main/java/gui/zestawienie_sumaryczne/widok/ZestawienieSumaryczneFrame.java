package gui.zestawienie_sumaryczne.widok;

import gui.zestawienie_sumaryczne.model.ZestawienieSumaryczne;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class ZestawienieSumaryczneFrame extends JDialog {
    public ZestawienieSumaryczneFrame(List<ZestawienieSumaryczne> zestawienieSumaryczne) {
        setUpFrame();
        initializeComponents(zestawienieSumaryczne);
    }

    private void setUpFrame() {
        setSize(new Dimension(400, 300));
        setTitle("Zestawienie sumaryczne");
        setLocationRelativeTo(null);
    }

    private void initializeComponents(List<ZestawienieSumaryczne> zestawienieSumaryczne) {
        ZestawienieSumarycznePanel loadingPanel = new ZestawienieSumarycznePanel(zestawienieSumaryczne);
        add(loadingPanel);
    }
}
