package com.company;

import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle battle = new Battle();
      battle.addAlly(new Registeel("Regi",24));
      battle.addAlly(new Salandit("Sala",45));
        battle.addAlly(new Charjabug("Char",64));
        battle.addFoe(new Salazzle("Sala",51));
        battle.addFoe(new Vikavolt("Vika", 1));
        battle.addFoe(new Grubbin("Grubb",20));
        battle.go();
    }
}

