
package principal;

import pooejerextra2.entidades.Punto;
import pooejerextra2.servicios.ServicioPunto;

public class Principal {

    
    public static void main(String[] args) {
        
        ServicioPunto sp = new ServicioPunto();
        Punto pto = sp.crearPunto();
        System.out.println("La distancia entre los puntos es: " + sp.calcularDistancia(pto));
        
    }
    
}
