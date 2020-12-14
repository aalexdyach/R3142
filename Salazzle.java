package com.company;
import ru.ifmo.se.pokemon.*;

public class Salazzle extends Pokemon {

    public Salazzle(String name, int level) {
        super(name, 2);
        setStats(48, 44, 40, 71, 40, 77);
        setType(Type.POISON, Type.FIRE);
        setMove(new FireBlast(), new VenomDrench(){} , new PoisonJab(), new Pound());

    }
}

