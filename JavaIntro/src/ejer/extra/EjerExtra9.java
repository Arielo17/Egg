
package ejer.extra;

import java.util.Scanner;


public class EjerExtra9 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int divdo = scanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divsor = scanner.nextInt();
        int cont=0;
        do {
            divdo = divdo - divsor;
            cont++;
        } while(divdo>=divsor);
        System.out.println("El cociente es "+cont+" y el residuo es "+divdo);
        
    }
}
