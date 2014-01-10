package database.csv;

import com.csvreader.CsvReader;
import model.Slownik;
import util.FileUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class SlownikDao {
    public static List<Slownik> pobierzWszystkieSloniwki() {
        List<Slownik> listaSlownikow = new ArrayList<Slownik>();

        try {
            FileInputStream fileInputStream = new FileInputStream(FileUtils.getSlownikFilePath());
            CsvReader csvReader = new CsvReader(fileInputStream, ';', Charset.forName("UTF-8"));

            csvReader.readHeaders();

            while (csvReader.readRecord()) {
                String gr = csvReader.get(0);
                String podgr = csvReader.get(1);
                String rodz = csvReader.get(2);
                String type = csvReader.get(3);
                String opis = csvReader.get(4);
                String nrOdpadu = csvReader.get(5);


                Slownik slownik = new Slownik(gr, podgr, rodz, type, opis, nrOdpadu);
                listaSlownikow.add(slownik);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaSlownikow;
    }
}
