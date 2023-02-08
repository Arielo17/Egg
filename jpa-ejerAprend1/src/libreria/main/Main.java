package libreria.main;

import java.util.Locale;
import java.util.Scanner;
import libreria.entidad.Libro;
import libreria.servicio.LibroServicio;

public class Main {
    
    private static final Scanner SCANNER = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public static void main(String[] args) throws Exception {
        /*  8) Búsqueda de un Autor por nombre.
            9) Búsqueda de un libro por ISBN.
            10) Búsqueda de un libro por Título.
            11) Búsqueda de un libro/s por nombre de Autor.
            12) Búsqueda de un libro/s por nombre de Editorial.
            13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:
            • Validar campos obligatorios.
            • No ingresar datos duplicados. */
        try {
            menu();
        } catch (Exception e) {
            throw e;
        }
        
        
        
    }
    
    public static void menu() throws Exception {
        LibroServicio libroServ = new LibroServicio();
        String opcion;
        try {
            System.out.println("1) Ingresar Libro");
            System.out.println("2) Buscar autor por nombre");
            System.out.println("3) Buscar libro por ISBN");
            System.out.println("4) Buscar libro por titulo");
            System.out.println("5) Buscar libro/s por nombre de autor");
            System.out.println("6) buscar libro/s por nombre de editorial");
            System.out.print("OPCION: ");
            opcion = SCANNER.next();
            switch (opcion) {
                case "1":
                    libroServ.guardarLibro(libroServ.crearLibro());
                    break;
                default:
                    throw new AssertionError();
            }
            } catch (Exception e) {
                throw e;
            }
        
    }
}
