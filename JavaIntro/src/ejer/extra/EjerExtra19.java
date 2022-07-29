
package ejer.extra;

import java.util.Random;
import java.util.Scanner;


public class EjerExtra19 {
    
    public static void verVector(int[] a,int d){
        System.out.print("[ ");
        for (int i = 0; i < d; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("]");
    }
    
    public static void comparaVector(int[] a, int[] b, int d){
        boolean igual = true;
        /* for (int i = 0; i < d; i++) {
           if (a[i] != b[i]){
               igual = false;
               break;
           }
        } */
        int i = 0;
        do {
            if (a[i] != b[i]){
               igual = false;
            }
            i++;
        } while (igual && i<d);
        
        if (igual){
            System.out.println("Los vectores son iguales");
        } else{
            System.out.println("Los vectores son distintos");
        }
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingese la dimension de los vectores: ");
        int dim = sc.nextInt();
        int[] vec1 = new int[dim];
        int[] vec2 = new int[dim];
        Random rd = new Random();
        for (int i = 0; i < dim; i++) {
            vec1[i] = rd.nextInt(20);
            vec2[i] = rd.nextInt(20);
        }
        
        verVector(vec1,dim);
        verVector(vec2,dim);
        
        comparaVector(vec1,vec2,dim);
    }
    
}
