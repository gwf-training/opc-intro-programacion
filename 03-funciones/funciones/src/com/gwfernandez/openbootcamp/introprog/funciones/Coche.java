package com.gwfernandez.openbootcamp.introprog.funciones;

/**
 * Crear una clase coche.
 * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 * Una función que incremente el número de puertas que tiene el coche.
 * Crear un objeto miCoche en el main y añadirle una puerta.
 * Mostrar el número de puertas que tiene el objeto.
 */

public class Coche {

    private int cantidadPuertas;

    public Coche() {
        this.cantidadPuertas = 0;
    }


    public void addPuerta() {
        this.cantidadPuertas++;
    }

    public int getCantidadPuertas() {
        return this.cantidadPuertas;
    }
}
