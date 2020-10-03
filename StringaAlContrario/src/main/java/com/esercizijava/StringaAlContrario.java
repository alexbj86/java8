package com.esercizijava;

import java.util.Scanner;

public class StringaAlContrario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        if(!stringa.isEmpty()) {
           for (int i = stringa.length(); i > 0; i--) {
               System.out.print(stringa.charAt(i-1));
           }
        }

    }
}
