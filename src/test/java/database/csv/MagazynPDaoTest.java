package database.csv;

import model.MagazynP;
import org.junit.Test;

import java.util.List;

public class MagazynPDaoTest {
    @Test
    public void testPobierzWszystkieMagazynyP() throws Exception {
        List<MagazynP> listaMagazynow = MagazynPDao.pobierzWszystkieMagazynyP();

        for (MagazynP magazynP : listaMagazynow) {
            System.out.println(magazynP);
        }
    }
}
