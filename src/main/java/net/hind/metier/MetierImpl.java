package net.hind.metier;

import net.hind.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements Metier {
@Autowired
    private IDao dao;

     // Injection automatique par Spring
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        return t * 4 * Math.PI / 2 * Math.cos(t);
    }
}
