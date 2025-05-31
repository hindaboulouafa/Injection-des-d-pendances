package net.hind.presentation;

import net.hind.dao.IDao;
import net.hind.metier.Metier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        // Lecture et instanciation DAO
        String daoClassName = scanner.nextLine();
        Class<?> cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();

        // Lecture et instanciation METIER
        String metierClassName = scanner.nextLine();
        Class<?> cMetier = Class.forName(metierClassName);
        Metier metier = (Metier) cMetier.getDeclaredConstructor().newInstance();

        // Injection de DAO via setter
        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        setDao.invoke(metier, dao);

        System.out.println("RES = " + metier.calcul());
    }
}
