package com.inhetirance.animal;

public class Gatto extends Animal {

    public Gatto() {
        super(4, "arancione", "piccola", false);
    }

    @Override
    protected String mangia() {
        return "Il gatto mangia il pesce";
    }

    @Override
    protected String dorme() {
        return "Il gatto dorme 16h al giorno";
    }
}
