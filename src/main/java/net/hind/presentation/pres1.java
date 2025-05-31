package net.hind.presentation;

import net.hind.dao.DaoImpl;
import net.hind.metier.MetierImpl;

public class pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();            // instanciation manuelle
        MetierImpl metier = new MetierImpl();   // instanciation manuelle
        metier.setDao(dao);                     // injection via setter
        System.out.println("Result=" + metier.calcul());
    }
}
