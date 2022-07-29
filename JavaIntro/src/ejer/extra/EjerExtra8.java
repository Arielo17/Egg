
package ejer.extra;

import java.util.Scanner;


public class EjerExtra8 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese números enteros, para terminar ingrese un multiplo de 5");
        int num;
        int cont=0;
        int contPar=0;
        int contImpar=0;
        do {
           num = scanner.nextInt();
           if (num>0){
                cont++;
                if (num%2==0){
                contPar++;
                } else{
                    contImpar++;
                }
            }
        } while(num%5!=0);
        System.out.println("La cantidad total de númeor es: "+(cont-1));
        if (num%2==0){
            System.out.println("La cantidad de pares: "+(contPar-1));
            System.out.println("La cantidad de impares: "+contImpar);
        } else{
            System.out.println("La cantidad de pares: "+contPar);
            System.out.println("La cantidad de impares: "+(contImpar-1));
        }
      
    }
}
