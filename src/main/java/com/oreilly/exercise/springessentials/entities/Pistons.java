package com.oreilly.exercise.springessentials.entities;

import org.springframework.stereotype.Component;

/**
 * Created by toba on 22-Jan-17.
 */
@Component
public class Pistons implements Team {

    @Override
    public String getName() {
        return "Detroit Pistons";
    }
}
