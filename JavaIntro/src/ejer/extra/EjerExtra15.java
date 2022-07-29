
package ejer.extra;

import java.util.Scanner;


public class EjerExtra15 {
    
    public static double sumar(double x, double y){
        return x+y;
    }
    
    public static double restar(double x, double y){
        return x-y;
    }
    
    public static double multiplicar(double x, double y){
        return x*y;
    }
    
    public static double dividir(double x, double y){
        return x/y;
    }
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        System.out.print("x = ");
        double a = scanner.nextInt();
        System.out.print("y = ");
        double b = scanner.nextInt();
        System.out.println("Decida que operacion matemática desea hacer con ellos");
        int c=0;
        do {
            System.out.println("1. Sumar(x+y)");
            System.out.println("2. Restar (x-y)");
            System.out.println("3. Multiplicar (x*y)");
            if (b!=0) {
                System.out.println("4. Dividir (x/y)");
            } else{
                System.out.println("4. No se puede realizar la división");
            }
            c = scanner.nextInt();
        } while (c<1 || c>4 || (b==0 && c==4));
        
        switch (c) {
            case 1:
                System.out.println(a+"+"+b+"= "+sumar(a,b));
                break;
            case 2:
                System.out.println(a+"-"+b+"= "+restar(a,b));
                break;
            case 3:
                System.out.println(a+"*"+b+"= "+multiplicar(a,b));
                break;
            case 4:
                if (b!=0){
                    System.out.println(a+"/"+b+"= "+dividir(a,b));
                    break;  
                } else{
                    break;
                }
        }
    }
}
