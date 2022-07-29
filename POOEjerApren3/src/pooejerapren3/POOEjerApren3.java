
package pooejerapren3;

import java.util.Scanner;
import pooejerapren3.entidades.Operacion;
import pooejerapren3.servicios.ServicioOperacion;


public class POOEjerApren3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        System.out.println("Bienvenido");
        ServicioOperacion so = new ServicioOperacion();
        Operacion op = so.crearOperacion();
        do {
            
            
            System.out.println("Ingrese la opción deseada");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    so.sumar(op);
                    break;
                case 2:
                    so.restar(op);
                    break;
                case 3:
                    so.multiplicar(op);
                    break;
                case 4:
                    so.dividir(op);
                    break;    
            }
        } while (opc!=5);
        
    }
    
}
