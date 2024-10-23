package com.mbougar;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        String nombre = scanner.nextLine().trim();

        System.out.println("¡Hola, " + nombre + "!");
    }
}
