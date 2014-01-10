package gui.loading;

import javax.swing.*;
import java.awt.*;


public class LoadingPanel extends JPanel {

    public LoadingPanel() {
        setUpPanel();
        initializeComponents();
    }

    private void setUpPanel() {
        setLayout(new BorderLayout());
    }

    private void initializeComponents() {
        JButton loadingBtn = new JButton("Ładowanie...");
        loadingBtn.setEnabled(false);
        add(loadingBtn);
    }
}
