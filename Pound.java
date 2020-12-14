package com.company;
import ru.ifmo.se.pokemon.*;

public class Pound extends PhysicalMove {
    private final String description = "deals damage with no additional effect";
    public Pound() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return description;
    }
}
