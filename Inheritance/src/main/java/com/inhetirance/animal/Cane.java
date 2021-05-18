package com.inhetirance.animal;

public class Cane extends Animal {

    public Cane() {
        super(4, "nero", "grande", false);
    }

    @Override
    protected String mangia() {
       return "Il cane mangia la carne";
    }

    @Override
    protected String dorme() {
        return "Il cane dorme la notte";
    }
}
