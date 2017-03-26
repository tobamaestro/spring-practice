package com.oreilly.exercise.springessentials.config;

import com.oreilly.exercise.springessentials.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.text.NumberFormat;
import java.util.List;

/**
 * Created by toba on 22-Jan-17.
 */
@Configuration
@Import(InfrastructureConfig.class)
@ComponentScan(basePackages = "com.oreilly.exercise.springessentials")
@EnableAspectJAutoProxy
public class AppConfig {

    @Autowired
    private DataSource dataSource;

//    @Resource
//    private Team pistons;
//
//    @Resource
//    private Team knicks;

//    @Autowired @Qualifier("knicks")
//    private Team home;
//
//    @Autowired @Qualifier("pistons")
//    private Team away;

    @Autowired
    private List<Team> teams;

//    @Bean(initMethod = "startGame", destroyMethod = "endGame")
//    @Scope("prototype")
    @Bean
    public Game game() {
        BasketballGame basketballGame = new BasketballGame(teams.get(0), teams.get(1));
        basketballGame.setDataSource(dataSource);
        return basketballGame;
    }

    @Bean
    public NumberFormat nf() {
        return NumberFormat.getInstance();
    }

//    @Bean
//    public Team knicks() {
//        return new Knicks();
//    }
//
//    @Bean
//    public Team pistons() {
//        return new Pistons();
//    }
}
