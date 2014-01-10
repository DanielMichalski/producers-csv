import gui.main_frame.view.MainMenuFrame;
import util.FileUtils;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        zmienWygladNaPlatformowy();
        wczytajPliki();
        pokazGlowneOkno();
    }

    private static void zmienWygladNaPlatformowy() {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
    }

    private static void wczytajPliki() {
        FileUtils.setDostawcyFilePath();
        FileUtils.setMagazynPFilePath();
        FileUtils.setMagazynWFilePath();
        FileUtils.setSlownikFilePath();
    }

    private static void pokazGlowneOkno() {
        MainMenuFrame frame = new MainMenuFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
