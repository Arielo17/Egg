
package ejer.extra;

import java.util.Scanner;


public class EjerExtra4 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 10: ");
        int num = scanner.nextInt();
        switch(num){
            case 1:
                System.out.println(num+" -> I");
                break;
            case 2:
                System.out.println(num+" -> II");
                break;
            case 3:
                System.out.println(num+" -> III");
                break;
            case 4:
                System.out.println(num+" -> IV");
                break;
            case 5:
                System.out.println(num+" -> V");
                break;
            case 6:
                System.out.println(num+" -> VI");
                break;
            case 7:
                System.out.println(num+" -> VII");
                break;
            case 8:
                System.out.println(num+" -> VIII");
                break;
            case 9:
                System.out.println(num+" -> IX");
                break;
            case 10:
                System.out.println(num+" -> X");
                break;
            default:
                System.out.println("El número ingresado no esta dentro del parametro especificado");
        }
    }
}
