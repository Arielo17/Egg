
package pooejerapren4;

import pooejerapren4.entidades.Rectangulo;


public class POOEjerApren4 {

    
    public static void main(String[] args) {
        Rectangulo rg = new Rectangulo();
        rg.crearRectangulo();
        System.out.println("Perímetro: "+rg.perimetroRectangulo());
        System.out.println("Superficie: "+rg.superficieRectangulo());
        System.out.println("");
        rg.dibujarRectangulo();
    }
    
}
