package database.dao;

import database.csv.DostawcyDao;
import database.csv.MagazynPDao;
import database.csv.SlownikDao;
import gui.zestawienie1.model.Zestawienie1;
import model.Dostawca;
import model.MagazynP;
import model.Slownik;

import java.util.ArrayList;
import java.util.List;


public class Zestawienie1Dao {
    public static List<Zestawienie1> pobierzZestawienie1() {
        List<Dostawca> dostawcy = DostawcyDao.pobierzWszystkichDostawcow();
        List<MagazynP> magazynyP = MagazynPDao.pobierzWszystkieMagazynyP();
        List<Slownik> slowniki = SlownikDao.pobierzWszystkieSloniwki();

        List<Zestawienie1> zestawienia1 = new ArrayList<Zestawienie1>();

        Dostawca dostawca = null;
        Slownik slownik = null;

        for (MagazynP magazynP : magazynyP) {
            for (Dostawca dostawcaFromList : dostawcy) {
                if (magazynP.getNrKlienta().equalsIgnoreCase(dostawcaFromList.getNrKlienta())) {
                    dostawca = dostawcaFromList;
                    break;
                }
            }

            for (Slownik slwonikFromList : slowniki) {
                if (magazynP.getNrOdpa().equalsIgnoreCase(slwonikFromList.getNrOdpadu())) {
                    slownik = slwonikFromList;
                    break;
                }
            }

            if (dostawca != null && slownik != null) {
                Zestawienie1 zestawienie1 = new Zestawienie1(
                        magazynP.getNrKarty(),
                        magazynP.getDataD(),
                        slownik.getGr() + slownik.getPodgr() + slownik.getRodz(),
                        magazynP.getMasa(),
                        magazynP.getJedn(),
                        magazynP.getFirma(),
                        slownik.getType(),
                        dostawca.getNazwaSkrocona(),
                        magazynP.getNrMag(),
                        slownik.getOpis(),
                        Integer.parseInt(magazynP.getNrKlienta().replace(" ", "")));

                zestawienia1.add(zestawienie1);
            }
        }

        return zestawienia1;
    }
}
