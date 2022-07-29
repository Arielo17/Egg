
package ejer.extra;

import java.util.Scanner;


public class EjerExtra18 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int dim = sc.nextInt();
        int[] vec = new int[dim];
        int sum = 0;
        for (int i = 0; i < dim; i++) {
            System.out.print("Ingrese el número de la posición ["+i+"]: ");
            vec[i] = sc.nextInt();
            sum += vec[i];
        }
        System.out.println("La suma de todos los elementos es: "+sum);
    }
    
}
