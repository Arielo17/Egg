
package pooejerapren2;

import Entidades.Circunferencia;
import java.util.Scanner;


public class POOEjerApren2 {

    
    public static void main(String[] args) {
        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Ingrese el radio de la circunferencia: ");
//        double rad = sc.nextDouble();
        Circunferencia circ = new Circunferencia();
        circ.crearCircunferencia();
        System.out.println("El área de la circunferencia es: "+circ.area(circ.getRadio()));
        System.out.println("El perímetro de la circunferencia es: "+circ.perimetro(circ.getRadio()));
        
    }
    
}
