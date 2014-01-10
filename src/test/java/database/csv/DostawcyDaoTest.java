package database.csv;

import model.Dostawca;

import java.util.List;

public class DostawcyDaoTest {
    @org.junit.Test
    public void testPobierzWszystkichDostawcow() throws Exception {
        List<Dostawca> dostawcy = DostawcyDao.pobierzWszystkichDostawcow();

        for (Dostawca dostawca : dostawcy) {
            System.out.println(dostawca);
        }
    }
}
