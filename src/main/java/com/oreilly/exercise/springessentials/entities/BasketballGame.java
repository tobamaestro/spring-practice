package com.oreilly.exercise.springessentials.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

/**
 * Created by toba on 22-Jan-17.
 */
public class BasketballGame implements Game {

    private Team home;
    private Team away;
    private DataSource dataSource;

    public BasketballGame() {
    }

    public BasketballGame(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    @PostConstruct
    public void startGame() {
        System.out.println("Initializing...");
    }

    @PreDestroy
    public void endGame() {
        System.out.println("Destroying...");
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    @Override
    public String playGame() {
        return Math.random() < 0.5 ? getAway().getName() : getHome().getName();
    }

    @Override
    public String toString() {
        return String.format("Playing game between %s at %s.", getAway().getName(), getHome().getName());
    }
}
