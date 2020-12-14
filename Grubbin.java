package com.company;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Grubbin extends Charjabug {
    public Grubbin(String name, int level){
        super(name,1);
        setStats(47,62,45,55,45,46);
        setType(Type.BUG);
        setMove(new Facade(), new Swagger());
    }
}