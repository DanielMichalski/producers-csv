package util;

import javax.swing.*;
import java.io.File;

public class FileUtils {
    private static String dostawcyFilePath;
    private static String magazynPFilePath;
    private static String magazynWFilePath;
    private static String slownikFilePath;

    public static void setDostawcyFilePath() {
        JOptionPane.showMessageDialog(null, "Wczytaj plik Dostawcy.csv", "Informacja", JOptionPane.INFORMATION_MESSAGE);

        JFileChooser jFileChooser = new JFileChooser("csv" + File.separator);
        jFileChooser.setFileFilter(new CSVFileFilter());
        int result = jFileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            dostawcyFilePath = jFileChooser.getSelectedFile().getPath();
        } else {
            showErrorMessageAndExit();
        }
    }

    public static void setMagazynPFilePath() {
        JOptionPane.showMessageDialog(null, "Wczytaj plik Magazynp.csv", "Informacja", JOptionPane.INFORMATION_MESSAGE);

        JFileChooser jFileChooser = new JFileChooser("csv" + File.separator);
        jFileChooser.setFileFilter(new CSVFileFilter());
        int result = jFileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            magazynPFilePath = jFileChooser.getSelectedFile().getPath();
        } else {
            showErrorMessageAndExit();
        }
    }

    public static void setMagazynWFilePath() {
        JOptionPane.showMessageDialog(null, "Wczytaj plik Magazynw.csv", "Informacja", JOptionPane.INFORMATION_MESSAGE);

        JFileChooser jFileChooser = new JFileChooser("csv" + File.separator);
        jFileChooser.setFileFilter(new CSVFileFilter());
        int result = jFileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            magazynWFilePath = jFileChooser.getSelectedFile().getPath();
        } else {
            showErrorMessageAndExit();
        }
    }

    public static void setSlownikFilePath() {
        JOptionPane.showMessageDialog(null, "Wczytaj plik Slownik.csv", "Informacja", JOptionPane.INFORMATION_MESSAGE);

        JFileChooser jFileChooser = new JFileChooser("csv" + File.separator);
        jFileChooser.setFileFilter(new CSVFileFilter());
        int result = jFileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            slownikFilePath = jFileChooser.getSelectedFile().getPath();
        } else {
            showErrorMessageAndExit();
        }
    }

    private static void showErrorMessageAndExit() {
        JOptionPane.showMessageDialog(
                null,
                "Aplikacja do poprawnego działania wymaga tego pliku.",
                "Informacja",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(1);
    }

    public static String getDostawcyFilePath() {
        return dostawcyFilePath;
    }

    public static String getMagazynPFilePath() {
        return magazynPFilePath;
    }

    public static String getMagazynWFilePath() {
        return magazynWFilePath;
    }

    public static String getSlownikFilePath() {
        return slownikFilePath;
    }
}
