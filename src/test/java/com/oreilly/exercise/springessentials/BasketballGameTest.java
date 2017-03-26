package com.oreilly.exercise.springessentials;

import com.oreilly.exercise.springessentials.config.AppConfig;
import com.oreilly.exercise.springessentials.entities.Game;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

/**
 * Created by toba on 25-Mar-17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class BasketballGameTest {

    @Autowired
    private Game game;

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void testPlayGame() throws Exception {
        String home = game.getHome().getName();
        String away = game.getAway().getName();

        String result = game.playGame();

        System.out.println(result + " won.");
        assertTrue(result.equals(home) || result.equals(away));
    }

}
