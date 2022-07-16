
package ejerAprend;

import java.util.Random;
import java.util.Scanner;

public class Ejer_Apre_16 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la dimension del vector: ");
        int dim = scanner.nextInt();
        int[] vec = new int[dim];
        Random random = new Random();
        for (int i = 0; i < dim; i++) {
            vec[i] = random.nextInt(10);    //Asi no se excede del 10
            System.out.print(vec[i]+" ");
        }
        System.out.print("\nIngrese el numero a buscar: ");
        int bus = scanner.nextInt();
        int cont = 0;
        for (int i = 0; i < dim; i++) {
            if (bus == vec[i]){
                if (cont == 0){
                    System.out.print("El numero "+bus+" se encuentra en la/s posicion/es: ");
                }
                System.out.print(i+" ");
                cont++;
            }
        }
        System.out.println("");
        if (cont==0) {
            System.out.println("El numero "+bus+" no se encuentra en el vector");
        }
    }
}
