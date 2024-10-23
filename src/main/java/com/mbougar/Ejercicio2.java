package com.mbougar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int numero = pedirEntero();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    public static int pedirEntero(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        Integer numero = null;

        System.out.print(message);

        do {
            try {
                numero = scanner.nextInt();

                if (numero < min || numero > max) {
                    throw new NumberFormatException();
                }
            } catch (InputMismatchException e) {
                System.out.print("Error, el número introducido no es válido. " + message);
                scanner.next();
                numero = null;
            } catch (NumberFormatException e) {
                System.out.print("Error, el número está fuera del rango. " + message);
                numero = null;
            } catch (Exception e) {
                System.out.println("Error inesperado.");
                numero = null;
            }
        } while (numero == null);

        return numero;
    }

    public static int pedirEntero() {
        return pedirEntero("Introduzca un número entero: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}