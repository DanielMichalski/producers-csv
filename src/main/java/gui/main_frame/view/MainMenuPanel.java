package gui.main_frame.view;

import javax.swing.*;
import java.awt.*;

public class MainMenuPanel extends JPanel {
    private JButton zad1Btn;
    private JButton zad2Btn;
    private JButton zestawDBtn;

    public MainMenuPanel() {
        setUpPanel();
        initializeComponents();
    }

    private void setUpPanel() {
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new GridLayout(3, 1, 10, 30));
    }

    private void initializeComponents() {
        zad1Btn = createJButton("Zestawienie1 (długie wczytywanie)");
        zad2Btn = createJButton("Zestawienie2");
        zestawDBtn = createJButton("ZestawD");

        add(zad1Btn);
        add(zad2Btn);
        add(zestawDBtn);
    }

    private JButton createJButton(String btnLabel) {
        return new JButton(btnLabel);
    }

    public JButton getZad1Btn() {
        return zad1Btn;
    }

    public JButton getZad2Btn() {
        return zad2Btn;
    }

    public JButton getZestawDBtn() {
        return zestawDBtn;
    }
}
