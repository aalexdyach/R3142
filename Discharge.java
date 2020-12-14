package com.company;
import ru.ifmo.se.pokemon.*;

public class Discharge extends SpecialMove {
    private final String description = "strikes everything around it by letting loose a flare of electricity";
    public Discharge() {
        super(Type.ELECTRIC, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() <= 0.3)
            Effect.paralyze(pokemon);
    }

    @Override
    protected String describe() {
        return description;
    }
}
