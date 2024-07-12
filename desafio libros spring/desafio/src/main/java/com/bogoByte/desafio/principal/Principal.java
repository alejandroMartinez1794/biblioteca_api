package com.bogoByte.desafio.principal;

import com.bogoByte.desafio.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Principal {

    @Autowired
    private LibroRepository libroRepository;

    private Scanner teclado = new Scanner(System.in);

    public void muestraElMenu() {
        mostrarMensajeBienvenida();
        boolean salir = false;
        while (!salir) {
            System.out.println("\uD83D\uDCD6 1. Buscar libro por título");
            System.out.println("\uD83D\uDCC3 2. Listar libros registrados");
            System.out.println("\uD83D\uDC68\u200D\uD83C\uDFEB 3. Listar autores vivos en un determinado año");
            System.out.println("\uD83D\uDD27 4. Listar libros por idioma");
            System.out.println("\uD83D\uDEAA 5. Salir");
            System.out.println("Seleccione una opción: ");
            int opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    buscarLibroPorTitulo();
                    break;
                case 2:
                    listarLibrosRegistrados();
                    break;
                case 3:
                    listarAutoresVivos();
                    break;
                case 4:
                    listarLibrosPorIdioma();
                    break;
                case 5:
                    salir = true;
                    mostrarMensajeDespedida();
                    break;
                default:
                    System.out.println("\uD83D\uDEAB Opción no válida, intenta nuevamente.");
            }
        }
    }

    private void mostrarMensajeBienvenida() {
        System.out.println("\n=========================================");
        System.out.println("\uD83D\uDCDA Bienvenido a la Biblioteca Virtual \uD83D\uDCDA");
        System.out.println("Explora y descubre una gran variedad de libros y autores. \uD83D\uDC68\u200D\uD83D\uDCDA");
        System.out.println("=========================================");
    }

    private void mostrarMensajeDespedida() {
        System.out.println("\n=========================================");
        System.out.println("Gracias por visitar nuestra Biblioteca Virtual. \uD83D\uDE4B\u200D♂️");
        System.out.println("¡Esperamos verte pronto! \uD83D\uDC4B");
        System.out.println("=========================================");
    }

    private void buscarLibroPorTitulo() {
        System.out.println("Ingrese el título del libro:");
        String titulo = teclado.nextLine();
        // Implementación de la búsqueda por título usando libroRepository
    }

    private void listarLibrosRegistrados() {
        // Implementación para listar libros registrados usando libroRepository
    }

    private void listarAutoresVivos() {
        System.out.println("Ingrese el año:");
        int año = teclado.nextInt();
        // Implementación para listar autores vivos en un determinado año usando libroRepository
    }

    private void listarLibrosPorIdioma() {
        System.out.println("Ingrese el idioma:");
        String idioma = teclado.nextLine();
        // Implementación para listar libros por idioma usando libroRepository
    }
}