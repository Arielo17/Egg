
package ejerAprend;

import java.util.Random;
import java.util.Scanner;




public class Ejer_Apre_21 {
    
    public static void rellMatr(int[][] mat,int c,int f){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print("Ingrese el valor de la posición ["+i+"]["+j+"]: ");
                mat[i][j]=scanner.nextInt();
            }
        }
    }
    
    public static void autoRellenoMatriz(int[][] a,int c,int f){
        Random aleatorio = new Random(System.currentTimeMillis());
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                //mat[i][j]=0;
                a[i][j] = aleatorio.nextInt(50);
            }
        }
    }
    
    public static void mostrarMatriz(int[][] a, int c,int f){
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args){
        int[][] m = new int[10][10];
        int[][] p = new int [3][3];
        autoRellenoMatriz(m,10,10);
        mostrarMatriz(m,10,10);
        rellMatr(p,3,3);
        mostrarMatriz(p,3,3);
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (m[i][j]==p[0][0]){
                    boolean es = true;
                    for (int k = 0; k < 2; k++) {
                        for (int l = 0; l < 2; l++) {
                            if (m[i+k][j+l]!=p[k][l]) {
                                es = false;
                            }
                        }
                    }
                    if (es){
                        System.out.println("La matriz P comienza en la posición: ["+i+"]["+j+"]");
                    }
                    
                }
            }
        }
    }
}