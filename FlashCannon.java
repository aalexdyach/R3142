package com.company;
import ru.ifmo.se.pokemon.*;

public class FlashCannon extends SpecialMove {
    private final String description = "gathers all its light energy and releases it";
    public FlashCannon(){
        super(Type.STEEL, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if(Math.random() <= 0.1){
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe() {
        return description;
    }
}
