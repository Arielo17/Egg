
package principal;

import java.util.Scanner;
import principal.entidades.Mes;
import principal.servicios.ServicioMes;


public class Principal {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        ServicioMes sm = new ServicioMes();
        Mes m = sm.crearMes();
        System.out.println("----- ADIVINE EL MES! -----");
        System.out.print("Ingrese un mes del año para adivinar: ");
        sm.adivinaMesSecreto(m, sc.next());
    }
}
