
package pooejerapren2;

import pooejerapren2.entidades.Circunferencia;
import pooejerapren2.servicios.ServicioCircunferencia;


public class POOEjerApren2 {

    
    public static void main(String[] args) {
        
        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia cf = sc.crearCircunferencia();
        sc.area(cf);
        sc.perimetro(cf);
    }
    
}
