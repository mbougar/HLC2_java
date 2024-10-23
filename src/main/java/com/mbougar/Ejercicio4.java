package com.mbougar;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

import static com.mbougar.Ejercicio2.pedirEntero;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroOculto = random.nextInt(100) + 1;
        int numero;

        do {
            numero = pedirEntero("Introduce un número entre 1 y 100: ", 1, 100);
            if (numero > numeroOculto) {
                System.out.println("El número introducido es mayor que el número oculto.");
            } else if (numero < numeroOculto) {
                System.out.println("El número introducido es menor que el número oculto.");
            }
        } while (numero != numeroOculto);

        System.out.println("¡Enhorabuena, has acertado!");
    }
}