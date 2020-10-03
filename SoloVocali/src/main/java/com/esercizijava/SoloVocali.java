package com.esercizijava;

import java.util.Arrays;
import java.util.Scanner;

public class SoloVocali {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        Character[] vocali = new Character[]{'a','e','i','o','u'};
        stringa.chars().forEach(c -> Arrays.stream(vocali).forEach(character -> {
            if (c == character){
                System.out.print((char)c);
            }
        }));
    }
}
