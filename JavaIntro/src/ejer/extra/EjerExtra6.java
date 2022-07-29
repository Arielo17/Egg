
package ejer.extra;

import java.util.Scanner;


public class EjerExtra6 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas a tener en cuenta: ");
        int cant = scanner.nextInt();
        
        double sumMenor = 0;
        double sumTotal = 0;
        int contMenor = 0;
        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese la altura de la persona "+(i+1)+": ");
            double alt = scanner.nextDouble();
            sumTotal += alt;
            if (alt<1.60) {
                sumMenor += alt;
                contMenor++;
            }
        }
        System.out.println("El promedio de altura de las personas menores a 1,60 m es: "+sumMenor/contMenor);
        System.out.println("El promedio de altura de todas las personas es: "+sumTotal/cant);
    }
}
