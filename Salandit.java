package com.company;
import ru.ifmo.se.pokemon.Type;

public class Salandit extends Salazzle {
    public Salandit(String name, int level){
        super(name, 1);
        setStats(48,44,40,71,40,77);
        setType(Type.POISON, Type.FIRE);
        setMove(new FireBlast(), new VenomDrench(), new PoisonJab());
    }
}
