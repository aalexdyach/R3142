package com.company;
import ru.ifmo.se.pokemon.*;

public class VenomDrench extends StatusMove {
    private final String description = "enrages the foe into confusion";
    public VenomDrench(){
        super(Type.POISON, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.poison(pokemon);
    }

    @Override
    protected String describe(){
        return description;
    }
}