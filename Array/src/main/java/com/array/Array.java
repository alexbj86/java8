package com.array;

import java.util.Arrays;

/**
 *
 * Dato un array di numeri interi, restituisci un nuovo array in modo tale che ogni elemento all’indice i del nuovo array sia il prodotto di tutti i numeri nell’array originale tranne quello in i.
 *
 * Per esampio, se il nostro input è [1, 2, 3, 4, 5], ci si aspetterà che l’output sia [120, 60, 40, 30, 24].
 *
 * Se l’input è [3, 2, 1], ci si aspetterà che l’output sia [2, 3, 6].
 */
public class Array {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        Integer[] finalArray = new Integer[array.length];
        int result;

        for (int i = 0; i < array.length; i++) {
            result = 1;
            for (int k = 0; k < array.length; k++) {
                if(i != k)
                    result *= array[k];
            }
            finalArray[i] = result;
        }
        System.out.println(Arrays.toString(finalArray));
    }
}
