package bibliotecavirtual;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro biblioteca = new Libro();

        System.out.println("1. AGREGAR LIBROS");
        biblioteca.agregarLibro("El código Da Vinci", "Dan Brown", 2003, "Misterio");
        biblioteca.agregarLibro("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico");
        biblioteca.agregarLibro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, "Fantasía");
        biblioteca.mostrarLibrosDisponibles();

        System.out.println("\n");
        System.out.println("2. BUSCAR LIBROS");
        System.out.print("Ingrese el título: ");
        String busqueda = scanner.nextLine();
        biblioteca.buscarLibro(scanner, "cien");
        
        System.out.println("\n");
        System.out.println("3. PRESTAR LIBROS");
        biblioteca.prestarLibro(scanner, "Cien años de soledad");

        System.out.println("\n");
        System.out.println("4. DEVOLVER LIBROS");
        biblioteca.devolverLibro(scanner, "Cien años de soledad");

        System.out.println("\n");
        System.out.println("5. MOSTRAR LIBROS");
        biblioteca.mostrarLibrosDisponibles();
    }

}
