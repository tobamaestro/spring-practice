package com.oreilly.exercise.springessentials.entities;

/**
 * Created by toba on 22-Jan-17.
 */
public interface Game {

    String playGame();

    Team getHome();
    void setHome(Team home);

    Team getAway();
    void setAway(Team away);

}
