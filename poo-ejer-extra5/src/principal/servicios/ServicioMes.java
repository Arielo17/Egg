
package principal.servicios;

import java.util.Scanner;
import principal.entidades.Mes;

public class ServicioMes {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Mes crearMes(){
        Mes m = new Mes();
        return m;
    }
    
    public String mesSecreto(Mes m){
        return m.getMESES()[9];
    }
    
    public void adivinaMesSecreto(Mes m, String mesIngresado){
        if (mesIngresado.equalsIgnoreCase(mesSecreto(m))){
            System.out.println("Has acertado!!\nEl mes es "+mesSecreto(m));
        } else{
            System.out.print("No has acertado... :(\nInténtalo de nuevo: ");
            String mes = sc.next();
            adivinaMesSecreto(m,mes);
        }
    }
    
}
