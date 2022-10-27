package com.gwfernandez.openbootcamp;

/**
 * Crea una clase Persona con las siguientes variables:
 *
 * La edad
 * El nombre
 * El teléfono
 *
 * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
 * esta nueva clase tendrá la variable credito solo para esa clase.
 *
 * Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono,
 * el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
 *
 * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
 * y con una variable salario que solo tenga la clase Trabajador.
 */
public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Gustavo");
        cliente.setEdad(43);
        cliente.setTelefono("11-306477821");
        cliente.setCredito(30000);

        System.out.println("Datos cliente");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Joaquin");
        trabajador.setEdad(42);
        trabajador.setTelefono("11-5564778");
        trabajador.setSalario(2500);

        System.out.println("Datos trabajador");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());

    }
}
