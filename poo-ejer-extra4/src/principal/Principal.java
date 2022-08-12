
package principal;

import principal.entidades.Nif;
import principal.servicios.ServicioNif;

public class Principal {

    
    public static void main(String[] args) {
        System.out.println("-----OBTENCION DE NIF-----");
        ServicioNif sn = new ServicioNif();
        Nif nf = sn.crearNif();
        sn.mostrar(nf);
    }
    
}
