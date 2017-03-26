package com.oreilly.exercise.springessentials;

import com.oreilly.exercise.springessentials.config.AppConfig;
import com.oreilly.exercise.springessentials.entities.BasketballGame;
import com.oreilly.exercise.springessentials.entities.Bulls;
import com.oreilly.exercise.springessentials.entities.Game;
import com.oreilly.exercise.springessentials.entities.Pistons;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by toba on 22-Jan-17.
 */
public class RunSpringApp {

    public static void main(String args[]) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Bulls bulls = context.getBean("bulls", Bulls.class);
        Pistons pistons = context.getBean("pistons", Pistons.class);

        Game game1 = context.getBean("game", Game.class);
        game1.setHome(bulls);
        game1.setAway(pistons);

        game1.playGame();
        game1.playGame();

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
