
package ejer.extra;

import java.util.Scanner;


public class EjerExtra2 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingese el valor de A, B, C y D seguidos de enter");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("A = "+a+" - B = "+b+" - C = "+c+" - D = "+d);
        int aux = a;
        a = d;
        d = b;
        b = c;
        c = aux;
        System.out.println("INTERCAMBIO -> A = "+a+" - B = "+b+" - C = "+c+" - D = "+d);
    }
}
