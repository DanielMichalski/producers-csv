package database.dao;

import gui.zestawienie1.model.Zestawienie1;
import org.junit.Test;

import java.util.List;

public class Zestawienie1DaoTest {
    @Test
    public void testPobierzZestawienie1() throws Exception {
        List<Zestawienie1> zestawienia = Zestawienie1Dao.pobierzZestawienie1();

        for (Zestawienie1 zestawienie1 : zestawienia) {
            System.out.println(zestawienie1);
        }
    }
}
