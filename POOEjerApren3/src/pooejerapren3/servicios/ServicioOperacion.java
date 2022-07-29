
package pooejerapren3.servicios;

import java.util.Scanner;
import pooejerapren3.entidades.Operacion;


public class ServicioOperacion {
    
    Scanner sc = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        Operacion op = new Operacion();
        System.out.print("Ingrese el valor del primer número: ");
        op.setNumero1(sc.nextDouble());
        System.out.print("Ingrese el valor del segundo número: ");
        op.setNumero2(sc.nextDouble());
        return op;
    }
    
    public void sumar(Operacion op){
        System.out.println("La suma es: "+(op.getNumero1()+op.getNumero2()));
    }
    
    public void restar(Operacion op){
        System.out.println("La resta es: "+(op.getNumero1()-op.getNumero2()));
    }
    
    public void multiplicar(Operacion op){
        if (op.getNumero1()==0 || op.getNumero2()==0){
            System.out.println("Error");
            System.out.println("La multiplicación es 0");
        } else{
            System.out.println("La multiplicacion es: "+op.getNumero1()*op.getNumero2());
        }    
    }
    
    public void dividir(Operacion op){
        if (op.getNumero2()==0){
            System.out.println("Error");
            System.out.println("No se puede efectuar la division por 0");
        } else{
            System.out.println("La división es: "+op.getNumero1()/op.getNumero2());
        }    
    }
}
