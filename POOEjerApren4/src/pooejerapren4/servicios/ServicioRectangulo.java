
package pooejerapren4.servicios;

import java.util.Scanner;
import pooejerapren4.entidades.Rectangulo;


public class ServicioRectangulo {
    
    Scanner sc = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        Rectangulo rg = new Rectangulo();
        System.out.print("Ingrese la base: ");
        rg.setBase(sc.nextInt());
        System.out.print("Ingrese la altura: ");
        rg.setAltura(sc.nextInt());
        return rg;
    }
    
    public void superficieRectangulo(Rectangulo rg){
        System.out.println("La superficie es: "+rg.getBase()*rg.getAltura());
    }
    
    public void perimetroRectangulo(Rectangulo rg){
        System.out.println("El perímetro es: "+2*(rg.getBase()+rg.getAltura()));
    }
    
    public void dibujarRectangulo(Rectangulo rg){
        for (int i = 0; i < rg.getAltura(); i++) {
            for (int j = 0; j < rg.getBase(); j++) {
                if (i==0 || i == rg.getAltura()-1) {
                    System.out.print("* ");
                } else if (j==0 || j==rg.getBase()-1){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
