
package ejer.extra;

import java.util.Random;
import java.util.Scanner;


public class EjerExtra20 {
    
    public static void rellenarVector(int[] a, int d){
        Random rd = new Random();
        for (int i = 0; i < d; i++) {
            a[i] = rd.nextInt(50);
        }
    }
    
    public static void mostrarVector(int[] a, int d){
        System.out.print("[ ");
        for (int i = 0; i < d; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("]");
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la dimension del vector: ");
        int dim = sc.nextInt();
        int[] vec = new int[dim];
        
        rellenarVector(vec,dim);
        mostrarVector(vec,dim);
    }
}
