package com.oreilly.exercise.springessentials.entities;

import org.springframework.stereotype.Component;

/**
 * Created by toba on 26-Jan-17.
 */
@Component
public class Bulls implements Team {

    @Override
    public String getName() {
        return "Chicago Bulls";
    }
}
