
package principal;

import java.util.Scanner;
import principal.entidades.Ahorcado;
import principal.servicios.ServicioAhorcado;


public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        ServicioAhorcado sa = new ServicioAhorcado();
        Ahorcado ahor = sa.crearJuego();
        System.out.println("----- AHORCADO -----");
        sa.juego(ahor);
    }
}
