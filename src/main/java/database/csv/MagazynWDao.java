package database.csv;

import com.csvreader.CsvReader;
import model.MagazynW;
import util.FileUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MagazynWDao {
    public static List<MagazynW> pobierzWszystkieMagazynyW() {
        List<MagazynW> listaMagazynowW = new ArrayList<MagazynW>();

        try {
            FileInputStream fileInputStream = new FileInputStream(FileUtils.getMagazynWFilePath());
            CsvReader csvReader = new CsvReader(fileInputStream, '"', Charset.forName("UTF-8"));

            csvReader.readHeaders();

            while (csvReader.readRecord()) {

                try {
                    String data = csvReader.get(0);
                    String nrKarty = csvReader.get(1);
                    String nrMagw = csvReader.get(2);
                    String nrOdpa = csvReader.get(3);
                    String nrKlienta = csvReader.get(4);
                    String firma = csvReader.get(5);
                    String jedn = csvReader.get(6);
                    double masa = Double.parseDouble(csvReader.get(7).replace(" ", ""));

                    MagazynW magazynW = new MagazynW(data, nrKarty, nrMagw, nrOdpa, nrKlienta, firma, jedn, masa);
                    listaMagazynowW.add(magazynW);
                } catch (NumberFormatException e) {
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaMagazynowW;
    }
}
