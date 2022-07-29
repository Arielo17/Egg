
package pooejerapren4;

import pooejerapren4.entidades.Rectangulo;
import pooejerapren4.servicios.ServicioRectangulo;


public class POOEjerApren4 {

    
    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo rg = sr.crearRectangulo();
        
        sr.perimetroRectangulo(rg);
        sr.superficieRectangulo(rg);
        System.out.println("");
        sr.dibujarRectangulo(rg);
    }
    
}
