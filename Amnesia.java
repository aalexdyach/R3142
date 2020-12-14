package com.company;
import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove {
    private final String description = "deals damage with no additional effect";
    public Amnesia(){
        super(Type.PSYCHIC, 0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if(Math.random() <= 0.3) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, 2);
        }
    }
    @Override
    protected String describe() {
        return description;
    }
}