package com.gwfernandez.openbootcamp;

/**
 * Para el bucle Do While, deberás crear la misma estructura que en el While,
 * pero solo se debe ejecutar una vez.
 */
public class PruebaDoWhile {
    public static void main(String[] args) {
        int numeroWhile = 2;
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);
    }
}
