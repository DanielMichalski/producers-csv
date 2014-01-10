package database.csv;

import model.MagazynW;
import org.junit.Test;

import java.util.List;

public class MagazynWDaoTest {
    @Test
    public void testPobierzWszystkieMagazynyW() throws Exception {
        List<MagazynW> magazyny = MagazynWDao.pobierzWszystkieMagazynyW();

        for (MagazynW magazynW : magazyny) {
            System.out.println(magazynW);
        }
    }
}
