package database.dao;

import database.csv.DostawcyDao;
import database.csv.MagazynWDao;
import database.csv.SlownikDao;
import gui.zestawienie2.model.Zestawienie2;
import gui.zestawienie_sumaryczne.model.ZestawienieSumaryczne;
import model.Dostawca;
import model.MagazynW;
import model.Slownik;

import java.util.*;

public class Zestawienie2Dao {
    public static List<Zestawienie2> pobierzZestawienie2() {
        List<Dostawca> dostawcy = DostawcyDao.pobierzWszystkichDostawcow();
        List<MagazynW> magazynyW = MagazynWDao.pobierzWszystkieMagazynyW();
        List<Slownik> slowniki = SlownikDao.pobierzWszystkieSloniwki();

        List<Zestawienie2> zestawienia2 = new ArrayList<Zestawienie2>();

        Dostawca dostawca = null;
        Slownik slownik = null;

        for (MagazynW magazynW : magazynyW) {
            for (Dostawca dostawcaFromList : dostawcy) {
                if (magazynW.getNrKlienta().equalsIgnoreCase(dostawcaFromList.getNrKlienta())) {
                    dostawca = dostawcaFromList;
                    break;
                }
            }

            for (Slownik slwonikFromList : slowniki) {
                if (magazynW.getNrOdpa().equalsIgnoreCase(slwonikFromList.getNrOdpadu())) {
                    slownik = slwonikFromList;
                    break;
                }
            }

            if (dostawca != null && slownik != null) {
                Zestawienie2 zestawienie2 = new Zestawienie2(
                        magazynW.getNrKarty(),
                        magazynW.getDataW(),
                        magazynW.getMasa(),
                        slownik.getGr() + slownik.getPodgr() + slownik.getRodz(),
                        magazynW.getFirma(),
                        dostawca.getNazwaSkrocona(),
                        slownik.getType(),
                        slownik.getOpis(),
                        Integer.parseInt(magazynW.getNrKlienta().replace(" ", "")));

                zestawienia2.add(zestawienie2);
            } else {
                System.out.println("dostawca = " + dostawca);
                System.out.println("slownik = " + slownik);
            }
        }

        return zestawienia2;
    }

    public static List<ZestawienieSumaryczne> pobierzZestawienieSumaryczne() {
        List<Zestawienie2> zestawienie2s = pobierzZestawienie2();
        Map<String, Double> sumyMas = new HashMap<String, Double>();

        for (Zestawienie2 zestawienie2 : zestawienie2s) {
            String typ = zestawienie2.getTyp();
            if (sumyMas.get(typ) == null) {
                sumyMas.put(zestawienie2.getTyp(), zestawienie2.getMasa());
            } else {
                sumyMas.put(typ, sumyMas.get(typ) + zestawienie2.getMasa());
            }
        }

        List<ZestawienieSumaryczne> zestawienieSumaryczne = new ArrayList<ZestawienieSumaryczne>();

        for (String s : sumyMas.keySet()) {
            zestawienieSumaryczne.add(new ZestawienieSumaryczne(s, sumyMas.get(s)));
        }

        return zestawienieSumaryczne;
    }
}
