
package ejer.extra;

import java.util.Scanner;

public class EjerExtra17 {
    
    public static boolean esPrimo(int a){
        boolean prim = true;
        int i = 2;
        do {
            if (a==1 || a==2){
            } else if (a%i==0) {
                 prim = false;
            }
            i++;
        } while (prim && i<=a/2);
        
        return prim;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        if (esPrimo(num)){
            System.out.println(num+" es primo");
        } else{
            System.out.println(num+" no es primo");
        }
    }
}
