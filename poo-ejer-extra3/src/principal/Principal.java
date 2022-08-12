
package principal;

import principal.entidades.Raiz;
import principal.servicios.ServicioRaiz;


public class Principal {

    
    public static void main(String[] args) {
        
        ServicioRaiz sr = new ServicioRaiz();
        Raiz rz = sr.crearRaiz();
        sr.calcular(rz);
        
    }
    
}
