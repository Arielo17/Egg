
package pooejerapren3;

import java.util.Scanner;
import pooejerapren3.entidades.Operacion;


public class POOEjerApren3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        System.out.println("Bienvenido");
        do {
            Operacion op = new Operacion();
            op.crearOperacion();
            System.out.println("Ingrese la opción deseada");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma es: "+op.sumar());
                    break;
                case 2:
                    System.out.println("La resta es: "+op.restar());
                    break;
                case 3:
                    System.out.println("La multiplicacion es: "+op.multiplicar());
                    break;
                case 4:
                    System.out.println("La division es: "+op.dividir());
                    break;    
            }
        } while (opc!=5);
        
    }
    
}
