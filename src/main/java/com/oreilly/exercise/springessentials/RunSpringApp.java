package com.oreilly.exercise.springessentials;

import com.oreilly.exercise.springessentials.entities.BasketballGame;
import com.oreilly.exercise.springessentials.entities.Bulls;
import com.oreilly.exercise.springessentials.entities.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Iterator;

/**
 * Created by toba on 22-Jan-17.
 */
public class RunSpringApp {

    public static void main(String args[]) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Bulls bulls = context.getBean("bulls", Bulls.class);

        Game game1 = context.getBean("game", Game.class);
        System.out.println(game1);

        context.close();


//        Game game2 = context.getBean("game", Game.class);
//        ((BasketballGame)game2).setAway(bulls);
//        System.out.println(game2);
//
//        System.out.println(game1);
//
//        NumberFormat nf = context.getBean(NumberFormat.class);
//        System.out.println(nf.format(2234523.423));

//        DocumentBuilderFactory dbFactory = context.getBean("dbFactory", DocumentBuilderFactory.class);
//        System.out.println(dbFactory.toString());
//        DocumentBuilder documentBuilder = context.getBean("docBuilder", DocumentBuilder.class);
//        System.out.println(documentBuilder.toString());
    }

}
