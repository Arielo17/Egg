
package pooejerapren2.servicios;

import java.util.Scanner;
import pooejerapren2.entidades.Circunferencia;


public class ServicioCircunferencia {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia cf = new Circunferencia();
        System.out.print("Ingrese el radio: ");
        cf.setRadio(sc.nextDouble());
        return cf;
    }
    
    public void area(Circunferencia cf){
        double area = Math.PI * cf.getRadio() * cf.getRadio();
        System.out.println("El área es: "+area);
    }
    
    public void perimetro(Circunferencia cf){
        double perim = 2 * Math.PI * cf.getRadio();
        System.out.println("El perímetro es: "+perim);
    }
}
