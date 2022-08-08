
package pooejerapren12;

import java.util.Scanner;
import pooejerapren12.entidades.Persona;
import pooejerapren12.servicios.ServicioPersona;

public class POOEjerApren12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPersona sp = new ServicioPersona();
        Persona per = sp.crearPersona();
        System.out.println("La edad de "+per.getNombre()+" es: "+sp.calcularEdad(per));
        System.out.print("\nIngrese una edad para saber si es menor o mayor a la persona ingresada: ");
        int edad = sc.nextInt();
        if (sp.menorQue(per, edad)) {
            System.out.println("Es menor");
        } else{
            System.out.println("Es mayor");
        }
        System.out.println("\nMostramos la persona");
        sp.mostrarPersona(per);
    }
    
}
