package com.company;

import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove {
    private final String description = "attacks with a prehistoric power";
//    private Pokemon def;

    public AncientPower(){
        super(Type.ROCK, 60,100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            pokemon.setCondition(new Effect().condition(Status.BURN).turns(3));
        }
    }
    @Override
    protected String describe() {
        return description;
    }
}
