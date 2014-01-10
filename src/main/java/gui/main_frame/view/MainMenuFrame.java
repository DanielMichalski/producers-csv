package gui.main_frame.view;

import gui.main_frame.controller.MainMenuController;

import javax.swing.*;
import java.awt.*;

public class MainMenuFrame extends JFrame {
    public MainMenuFrame() {
        setUpFrame();
        initializeComponents();
    }

    private void setUpFrame() {
        setSize(new Dimension(400, 400));
        setTitle("Menu Główne");
        setLocationRelativeTo(null);
    }

    private void initializeComponents() {
        MainMenuController mainMenuController = new MainMenuController();

        MainMenuPanel panel = new MainMenuPanel();
        add(panel);

        mainMenuController.setZad1Btn(panel.getZad1Btn());
        mainMenuController.setZad2Btn(panel.getZad2Btn());
        mainMenuController.setZestawDBtn(panel.getZestawDBtn());
    }
}
