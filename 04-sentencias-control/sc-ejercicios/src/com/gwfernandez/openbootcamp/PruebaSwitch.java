package com.gwfernandez.openbootcamp;

/**
 * Por último, para el Switch, deberás crear la variable estacion,
 * y distintos case para las cuatro estaciones del año.
 * Dependiendo del valor de la variable estacion se deberá mandar un mensaje
 * por consola informando de la estación en la que está.
 * También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */
public class PruebaSwitch {

    public static void main(String[] args) {
        String estacion = "marzo";
        switch (estacion){
            case "verano":
            case "otoño":
            case "invierno":
            case "primavera":
                System.out.println("la estacion es " + estacion);
                break;
            default:
                System.out.println("No es una estacion del año");
        }
    }
}
