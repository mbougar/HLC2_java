package com.mbougar;

import java.util.Scanner;

import static com.mbougar.Ejercicio2.pedirEntero;

public class Ejercicio11 {
    public static void main(String[] args) {
        int numero = pedirEntero("Introduzca un número entero: ", 0, 100000);

        System.out.println("Secuencia Fibonacci hasta el número " + numero + ":");
        printFibonacci(numero);
    }

    public static void printFibonacci(int n) {
        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + ", " + num2);

        while (num2 <= n) {
            int nextNum = num1 + num2;
            if (nextNum <= n) {
                System.out.print(", " + nextNum);
            }
            num1 = num2;
            num2 = nextNum;
        }
    }
}
