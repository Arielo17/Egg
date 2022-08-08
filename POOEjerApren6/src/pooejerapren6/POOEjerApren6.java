
package pooejerapren6;

import java.util.Scanner;
import pooejerapren6.entidades.Cafetera;


public class POOEjerApren6 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Cafetera cf = new Cafetera();
        
        int opc;
        do {
            System.out.println("Ingrese la opción");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir una taza de café");
            System.out.println("3. Vaciar la cafetera");
            System.out.println("4. Agregar café a la cafetera");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opc = sc.nextInt();
            System.out.println("");
            switch (opc) {
                case 1:
                    cf.llenarCafetera();
                    break;
                case 2:
                    System.out.print("Ingrese la capacidad de la taza (cc): ");
                    cf.servirTaza(sc.nextInt());
                    break;
                case 3:
                    cf.vaciarCafetera();
                    break;
                case 4: 
                    System.out.print("Ingrese la cantidad de cafe a agregar (cc): ");
                    cf.agregarCafe(sc.nextInt());
            }
        } while (opc!=5);
        
    }
    
}
