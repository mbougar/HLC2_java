package com.mbougar;

import java.util.Scanner;

import static com.mbougar.Ejercicio2.pedirEntero;

class Anime {
    private String nombre;
    private int episodios;
    private String genero;

    public Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nombre='" + nombre + '\'' +
                ", episodios=" + episodios +
                ", genero='" + genero + '\'' +
                '}';
    }
}

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre de un Anime: ");
        String nombre = scanner.nextLine();

        int episodios = pedirEntero("Introduce el número de episodios: ", 0, 10000000);

        System.out.print("Introduzca el género del anime: ");
        String genero = scanner.nextLine();

        Anime anime = new Anime(nombre, episodios, genero);

        System.out.println(anime);
    }
}
