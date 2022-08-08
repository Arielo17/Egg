
package pooejerextra1;

import java.util.Scanner;
import pooejerextra1.entidades.Cancion;


public class POOEjerExtra1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Ingrese el título de la canción: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese el autor de dicha canción: ");
        String autor = sc.nextLine();
        Cancion cancion = new Cancion(titulo, autor);
        System.out.println("");
        
    }
    
}
