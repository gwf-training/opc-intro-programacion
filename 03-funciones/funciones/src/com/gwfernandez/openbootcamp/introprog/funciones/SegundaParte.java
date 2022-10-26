package com.gwfernandez.openbootcamp.introprog.funciones;

/**
 * Segunda parte:
 *
 * Crear una clase coche.
 * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 * Una función que incremente el número de puertas que tiene el coche.
 * Crear un objeto miCoche en el main y añadirle una puerta.
 * Mostrar el número de puertas que tiene el objeto.
 */
public class SegundaParte {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.println("cantidad puertas: " + miCoche.getCantidadPuertas());
    }
}

