package com.company;

import ru.ifmo.se.pokemon.*;

public class Vikavolt extends Pokemon {

    public Vikavolt(String name, int level) {
        super(name, 2);
        setStats(77, 70, 90, 145, 75, 43);
        setType(Type.BUG, Type.ELECTRIC);
        setMove(new Facade(), new Swagger(), new Discharge(), new EnergyBall());
    }

//    protected Vikavolt(String name, int level) {
//        super(name, level);
//    }

}
