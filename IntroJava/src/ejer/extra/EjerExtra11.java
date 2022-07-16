
package ejer.extra;

import java.util.Scanner;


public class EjerExtra11 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = scanner.nextInt();
        int cont=0;
        do {
            num /=10;
            cont++;
        } while (num>0);
        System.out.println("La cantidad de dígitos es: "+cont);
    }
}
