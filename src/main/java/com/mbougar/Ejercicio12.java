package com.mbougar;

import java.util.Scanner;

import static com.mbougar.Ejercicio2.pedirEntero;

public class Ejercicio12 {
    public static void main(String[] args) {
        int numero = pedirEntero("Introduzca un número entero positivo: ", 0, 1000000);

        String nuevaCadena = "";
        String cadena = Integer.toString(numero);

        for (int i = cadena.length() - 1; i >= 0; i--) {
            nuevaCadena += cadena.charAt(i);
        }

        System.out.println(nuevaCadena);
    }
}
