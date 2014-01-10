package database.csv;

import model.Slownik;
import org.junit.Test;

import java.util.List;

public class SlownikDaoTest {
    @Test
    public void testPobierzWszystkieSloniwki() throws Exception {
        List<Slownik> slowniki = SlownikDao.pobierzWszystkieSloniwki();

        for (Slownik slownik : slowniki) {
            System.out.println(slownik);
        }
    }
}
