
package ejer.extra;

import java.util.Scanner;


public class EjerExtra3 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una letra del alfabeto: ");
        String letra = scanner.nextLine();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es una vocal");
        } else{
            System.out.println("La letra ingresada no es una vocal");
        }
    }
}
