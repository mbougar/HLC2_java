package com.mbougar;

public class Ejercicio6 {
    public static void main(String[] args) {
        int contador = 0;
        for (int numero = 1; numero <= 100; numero++) {
            contador += numero;
        }

        System.out.println("La suma de todos los números del 1 al 100 es: " + contador);
    }
}