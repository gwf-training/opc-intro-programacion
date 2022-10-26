package com.gwfernandez.openbootcamp.introprog.funciones;

/**
 * Primera parte:
 *
 * Crear una función con tres parámetros que sean números que se suman entre sí.
 * Llamar a la función en el main y darle valores.
 */
public class PrimeraParte {

    public static void main(String[] args) {
        int result = suma(10, 15, 30);
        System.out.println("resultado suma: " + result);
    }

    public static int suma(int a, int b, int  c) {
        return a + b+ c;
    }
}
