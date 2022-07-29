
package ejer.extra;

import java.util.Scanner;


public class EjerExtra7 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba la cantidad de números a ingresar: ");
        int cant = scanner.nextInt();
        System.out.println("USANDO WHILE");
        int i=1;
        int min=0;
        int max=0;
        int sum=0;
        while (i<=cant) {
            System.out.print("Ingrese el nº"+i+": ");
            int num = scanner.nextInt();
            if (i==1){
                min = num;
                max = num;
            } else{
                if(num<min){
                    min = num;
                }
                if(num>max){
                    max = num;
                }
            }
            sum += num;
            i++;
        }
        System.out.println("Mximo: "+max+" - Mínimo: "+min+" - Promedio: "+((double)sum/cant));
        System.out.println("\nUSANDO DO-WHILE");
        int j=0;
        int min2=0;
        int max2=0;
        int sum2=0;
        do {
            System.out.print("Ingrese el nº"+(j+1)+": ");
            int num = scanner.nextInt();
            if (j==0){
                min2 = num;
                max2 = num;
            } else{
                if(num<min2){
                    min2 = num;
                }
                if(num>max2){
                    max2 = num;
                }
            }
            sum2 += num;
            j++;
        } while (j<cant);
        System.out.println("Mximo: "+max2+" - Mínimo: "+min2+" - Promedio: "+((double)sum2/cant));
    }
}
