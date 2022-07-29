
package ejer.extra;

import java.util.Random;
import java.util.Scanner;

public class EjerExtra22 {
    
    public static void mostrarMatriz(int[][] a, int f, int c){
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas: ");
        int fil = sc.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int col = sc.nextInt();
        int[][] matriz = new int[fil][col];
        Random rd = new Random();
        int sum = 0;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = rd.nextInt(20);
                sum += matriz[i][j];
            }
        }
        mostrarMatriz(matriz,fil,col);
        System.out.println("La suma de los elementos de la matriz es: "+sum);
    }
    
}
