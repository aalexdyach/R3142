package com.company;

import ru.ifmo.se.pokemon.*;
public class FireBlast extends SpecialMove {
    private final String description = "attacks with FireBlast";

    public FireBlast() {
        super(Type.FIRE, 110, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            Effect.paralyze(pokemon);
        }
    }

    @Override
    protected String describe() {
        return description;
    }
}