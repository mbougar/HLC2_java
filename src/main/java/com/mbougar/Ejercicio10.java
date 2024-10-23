package com.mbougar;

import static com.mbougar.Ejercicio2.pedirEntero;

public class Ejercicio10 {
    public static void main(String[] args) {
        int temperatura = pedirEntero("Introduzca una temperatura: ", -500, 20000);

        int celsius = (temperatura - 32) * 5 / 9;
        int fahrenheit = (temperatura * 9 / 5) + 32;

        System.out.println(temperatura + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");
        System.out.println(temperatura + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
    }
}
