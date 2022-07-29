
package pooejerapren1;

import Entidad.Libro;
import java.util.Scanner;


public class POOEjerApren1 {

    public static void cargarLibro(Libro lib){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el ISBN del libro: ");
        int isbn = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el título del libro: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = sc.nextLine();
        System.out.print("Ingrese la cantidad de páginas: ");
        int pag = sc.nextInt();
        lib.setIsbn(isbn);
        lib.setTitulo(titulo);
        lib.setAutor(autor);
        lib.setPaginas(pag);
    }
    
    public static void informeLibro(Libro lib){
        System.out.println("ISBN: "+lib.getIsbn());
        System.out.println("Título: "+lib.getTitulo());
        System.out.println("Autor: "+lib.getAutor());
        System.out.println("Páginas: "+lib.getPaginas());
    }
    
    public static void main(String[] args) {
        Libro lib = new Libro();
        cargarLibro(lib);
        System.out.println("");
        informeLibro(lib);
    }
    
}
