package com.company;

import ru.ifmo.se.pokemon.*;

public class Charjabug extends Vikavolt {
    public Charjabug(String name, int level){
        super(name, 1);
        setStats(57,82,95,55,75,36);
        setType(Type.BUG, Type.ELECTRIC);
        setMove(new Facade(), new Swagger(), new Discharge());
    }
}