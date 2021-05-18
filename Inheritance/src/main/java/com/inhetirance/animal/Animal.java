package com.inhetirance.animal;

public class Animal {

    private int numZampe;
    private String colore;
    private String taglia;
    private boolean isVegetariano;

    public Animal() {
    }

    public Animal(int numZampe, String colore, String taglia, boolean isVegetariano) {
        this.numZampe = numZampe;
        this.colore = colore;
        this.taglia = taglia;
        this.isVegetariano = isVegetariano;
    }

    protected String mangia() {
       return "Tutti gli animali mangiano";
    }

    protected String dorme() {
        return "Tutti gli animali dormono";
    }
}
