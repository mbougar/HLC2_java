package com.mbougar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.mbougar.Ejercicio2.pedirEntero;

class Videojuego {
    private String titulo;
    private String plataforma;
    private int horasJugadas;

    public Videojuego(String titulo, String plataforma, int horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", horasJugadas=" + horasJugadas +
                '}';
    }
}

class Inventario {
    private List<Videojuego> inventario;

    public Inventario() {
        inventario = new ArrayList<>();
    }

    public void agregarVideojuego() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el titulo del videojuego: ");
        String titulo = scanner.nextLine();

        System.out.print("Introduzca la plataforma: ");
        String plataforma = scanner.nextLine();

        int horasJugadas = pedirEntero("Introduce las horas jugadas: ", 0, 100000000);

        inventario.add(new Videojuego(titulo, plataforma, horasJugadas));
    }

    public void eliminarVideojuego() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el titulo del videojuego: ");
        String tituloVideo = scanner.nextLine();
        Videojuego videojuego = inventario.stream()
                .filter(v -> v.toString().contains(tituloVideo))
                .findFirst()
                .orElse(null);

        if (videojuego != null) {
            inventario.remove(videojuego);
        } else {
            System.out.println("No hay un videojuego con ese nombre");
        }
    }

    public void mostrarVideojuegos() {
        System.out.println("Videojuegos:");
        for (Videojuego videojuego : inventario) {
            System.out.println(" - " + videojuego);
        }
    }
}

public class Ejercicio14 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("4. Cerrar programa");
            opcion = pedirEntero("Introduzca una opcion: ", 1, 4);

            switch (opcion) {
                case 1 -> inventario.agregarVideojuego();
                case 2 -> inventario.eliminarVideojuego();
                case 3 -> inventario.mostrarVideojuegos();
            }
        }
    }
}
