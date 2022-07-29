
package ejer.extra;

import java.util.Scanner;


public class EjerExtra5 {
    
    public static void importe(char s, double c){
        switch (s) {
            case 'A':
                System.out.println("El costo es de "+(0.5*c));
                break;
            case 'B':
                System.out.println("El costo es de "+(0.65*c));
                break;
            case 'C':
                System.out.println("El costo es de "+c);
                break;
            default:
                System.out.println("Opcion inválida, vuelva a comenzar");;
        }
    }
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de socio que representa (A, B o C): ");
        char socio = scanner.next().charAt(0);
        System.out.print("Ingrese el costo del tratamiento: ");
        double costo = scanner.nextDouble();
        importe(socio, costo);
    }       
}