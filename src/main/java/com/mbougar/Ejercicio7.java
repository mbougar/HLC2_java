package com.mbougar;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        String nuevaCadena = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            nuevaCadena += cadena.charAt(i);
        }

        System.out.println(nuevaCadena);
    }
}
