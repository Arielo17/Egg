
package ejerAprend;

import java.util.Random;


public class Ejer_Apre_18 {
    
    public static void mostrarMatriz(int[][] a, int dim){
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args){
        int[][] mat = new int[4][4];
        int[][] tras = new int[4][4];
        Random aleatorio = new Random(System.currentTimeMillis());
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = aleatorio.nextInt(50);
            }
        }
        mostrarMatriz(mat,4);
        
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tras[i][j] = mat[j][i];
            }
        }
        mostrarMatriz(tras,4);
    }
}
