package com.mbougar;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.mbougar.Ejercicio2.pedirEntero;

public class Ejercicio3 {
    public static void main(String[] args) {
        int radio = pedirEntero("Introduzca el radio de un círculo: ", 1, 100000);
        double area = Math.PI * Math.pow(radio, 2);

        System.out.printf("El área del círculo especificado es %.2f unidades%n", area);
    }
}