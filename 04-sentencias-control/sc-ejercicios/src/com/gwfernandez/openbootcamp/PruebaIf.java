package com.gwfernandez.openbootcamp;

/**
 * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
 * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
 */
public class PruebaIf {
    public static void main(String[] args) {
        // genero numeros aleatorios entre -50 y 49
        int numero = (int) (Math.random() * 100 - 50);

        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo");
        } else if (numero < 0){
            System.out.println("El numero " + numero + " es negativo");
        } else {
            System.out.println("El numero es 0");
        }
    }
}
