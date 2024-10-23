package com.mbougar;

import static com.mbougar.Ejercicio2.pedirEntero;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = pedirEntero();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
