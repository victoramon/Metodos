package com.generation;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        String mensaje = saludar ("Victor Manuel");
        System.out.println(mensaje);
        int resultado = suma(5, 3);
        System.out.println(resultado);
        alerta("Mensaje de prueba");
        Scanner sc = new Scanner (System.in);



        System.out.println(Math.PI);
        double num1 = 13.75;
        double num2 = 9;
        System.out.println(Math.sqrt(num2));
        */


        String mensaje1 = "Adios!!!";
        String mensaje2 = "adios!!!";
        // lenght nos devuelve el número de caractedes de un string
        System.out.println(mensaje2.length());

        //equals compara dis strings y devuelve verdadero si son iguales
        System.out.println(mensaje1.equals(mensaje2));

        //equalsIgnoreCase compara dos strings sin importar si estan escritas en mayusculas o minusculas
        System.out.println(mensaje1.equalsIgnoreCase(mensaje2));

        //toUpperCase convierte el mensaje a mayusculas
        System.out.println(mensaje1.toUpperCase());
    }



    /*
    public static String saludar(String nombre) {
        return "Hola, como estas " + nombre;
    }

    public static int suma (int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void alerta (String mensaje) {
        System.out.println(mensaje);
    }
     */
}
