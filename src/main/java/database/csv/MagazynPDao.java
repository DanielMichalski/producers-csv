package database.csv;

import com.csvreader.CsvReader;
import model.MagazynP;
import util.FileUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MagazynPDao {
    public static List<MagazynP> pobierzWszystkieMagazynyP() {
        List<MagazynP> listaMagazynowP = new ArrayList<MagazynP>();

        try {
            FileInputStream fileInputStream = new FileInputStream(FileUtils.getMagazynPFilePath());
            CsvReader csvReader = new CsvReader(fileInputStream, ';', Charset.forName("UTF-8"));

            csvReader.readHeaders();

            while (csvReader.readRecord()) {
                try {
                    String nrMag = csvReader.get(0);
                    String nrKarty = csvReader.get(1);
                    String nrOdpa = csvReader.get(2);
                    String nrKlienta = csvReader.get(3);
                    String firma = csvReader.get(4);
                    String jedn = csvReader.get(5);
                    double masa = Double.valueOf(csvReader.get(6));
                    String dataD = csvReader.get(7);

                    MagazynP magazynP = new MagazynP(nrMag, nrKarty, nrOdpa, nrKlienta, firma, jedn, masa, dataD);
                    listaMagazynowP.add(magazynP);
                } catch (NumberFormatException ignored) {
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaMagazynowP;
    }
}
