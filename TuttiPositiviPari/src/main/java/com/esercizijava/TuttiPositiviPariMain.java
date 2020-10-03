package com.esercizijava;

import java.util.Scanner;

public class TuttiPositiviPariMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanti numeri vuoi inserire? ");
        int numIns = scanner.nextInt();
        int contaPos = 0;
        int i = 0;
        while(i<numIns) {
            System.out.println("Inserisci un numero: ");
            int num = scanner.nextInt();
            if (num > 0 && num % 2 == 0) {
                contaPos++;
            }
            i++;
        }
        System.out.println(contaPos == numIns ? "Tutti positivi e pari" : "No");
    }
}
