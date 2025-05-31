package net.hind.ext;

import net.hind.dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("d2") // Pour l'utiliser avec @Qualifier("d2")
public class DaoImplv2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteur");
        return 12;
    }
}
