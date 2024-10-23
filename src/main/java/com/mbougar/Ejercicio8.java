package com.mbougar;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = scanner.nextLine().toLowerCase();
        List<Character> vocales = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int contador = 0;

        for (char c : frase.toCharArray()) {
            if (vocales.contains(c)) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " vocales en la frase.");
    }
}