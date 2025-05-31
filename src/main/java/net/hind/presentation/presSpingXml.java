package net.hind.presentation;

import net.hind.metier.Metier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpingXml {
    public static void main(String[] args) {
        ApplicationContext spring = new ClassPathXmlApplicationContext("config.xml");
        Metier metier = spring.getBean("metier", Metier.class);
        System.out.println("RES = " + metier.calcul());
    }
}
