package com.mbougar;

import java.util.Scanner;

import static com.mbougar.Ejercicio2.pedirEntero;

public class Ejercicio9 {
    public static void main(String[] args) {
        int numero = pedirEntero("Introduzca un número entero positivo: ", 0, 1000);
        boolean esPrimo = comprobarPrimo(numero);

        if (esPrimo) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }

    public static boolean comprobarPrimo(int numero) {
        if (numero < 2) return false;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
