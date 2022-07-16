
package ejer.extra;

import java.util.Scanner;


public class EjerExtra1 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en minutos: ");
        double min = scanner.nextInt();
        
        int dias = (int)(min-(min%1440))/1440;
        double horas = (min%1440)/60;
        System.out.println(min+" minutos, son "+dias+" dias y "+horas+" horas");
    }
}
