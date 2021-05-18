package com.inhetirance.animal;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Gatto();
        System.out.println(animal.mangia());

        Animal animal1 = new Cane();
        System.out.println(animal1.mangia());

        Animal animal2 = new Animal();
        if(animal1 instanceof Cane) {
            Cane cane = (Cane) animal1;
            System.out.println("animal1 è instanza di cane");
        }
    }
}
