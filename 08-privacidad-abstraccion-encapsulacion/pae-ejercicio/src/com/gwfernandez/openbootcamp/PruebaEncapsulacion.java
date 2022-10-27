package com.gwfernandez.openbootcamp;

/**
 * Para practicar la encapsulación:
 *
 * Crear clase Persona.
 * Crear variables las privadas edad, nombre y telefono de la clase Persona.
 * Crear gets y sets de cada propiedad.
 * Crear un objeto persona en el main.
 * Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
 * por último muéstralas por consola.
 */
public class PruebaEncapsulacion {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Gustavo");
        persona.setEdad(43);
        persona.setTelefono("11-3064781");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad:" + persona.getEdad() );
        System.out.println("telefono: " + persona.getTelefono());
    }
}
