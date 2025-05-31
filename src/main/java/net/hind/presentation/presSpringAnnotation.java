package net.hind.presentation;

import net.hind.metier.Metier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.hind");
        Metier metier = applicationContext.getBean(Metier.class);
        System.out.println("RES="+metier.calcul());
    }

}
