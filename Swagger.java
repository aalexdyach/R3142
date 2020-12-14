package com.company;
import ru.ifmo.se.pokemon.*;

class Swagger extends StatusMove {
    private final String description = "enrages the foe into confusion";
    public Swagger(){
        super(Type.NORMAL,0,85);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 2);
        Effect.confuse(pokemon);

    }
    @Override
    protected String describe() {
        return description;
    }
}
