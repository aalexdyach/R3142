package com.company;
import ru.ifmo.se.pokemon.*;

public class Registeel extends Pokemon {

    public Registeel(String name, int level) {
        super(name, 1);
        setStats(80, 75, 150,75, 150,50);
        setType(Type.STEEL);
        setMove(new FlashCannon(), new FocusBlast(), new AncientPower(), new Amnesia());
    }
}
