package util;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class CSVFileFilter extends FileFilter {
    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(".csv");
    }

    @Override
    public String getDescription() {
        return "Pliki CSV";
    }
}
