package database.csv;

import com.csvreader.CsvReader;
import model.Dostawca;
import util.FileUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


public class DostawcyDao {
    public static List<Dostawca> pobierzWszystkichDostawcow() {
        List<Dostawca> listaDostawcow = new ArrayList<Dostawca>();

        try {
            FileInputStream fileInputStream = new FileInputStream(FileUtils.getDostawcyFilePath());
            CsvReader csvReader = new CsvReader(fileInputStream, ':', Charset.forName("UTF-8"));

            csvReader.readHeaders();

            while (csvReader.readRecord()) {
                String nazwaSkrocona = csvReader.get(0);
                String nrKlienta = (csvReader.get(1));
                String miejscowosc = csvReader.get(2);
                String ulica = csvReader.get(3);

                Dostawca dostawca = new Dostawca(nazwaSkrocona, nrKlienta, miejscowosc, ulica);
                listaDostawcow.add(dostawca);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaDostawcow;
    }
}
