package net.hind.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Base de données ");
        double t = 85;
        return t;
    }
}
