package com.company;
import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    private final String description = "heightens its mental focus and unleashes its power";
    public FocusBlast(){
        super(Type.FIGHTING, 120, 70);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() <= 0.1){
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe() {
        return description;
    }
}