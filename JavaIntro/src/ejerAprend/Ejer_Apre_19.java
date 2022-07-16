
package ejerAprend;

import static ejerAprend.Ejer_Apre_18.mostrarMatriz;
import java.util.Random;


public class Ejer_Apre_19 {
    
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
                //mat[i][j]=0;
                mat[i][j] = aleatorio.nextInt(50);
            }
        }
        mostrarMatriz(mat,4);
        
        boolean antis = true;
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tras[i][j] = mat[j][i];
                if (mat[i][j]!=(-tras[i][j])) {
                    antis = false;
                }
            }
        }
        mostrarMatriz(tras,4);
        
        if (antis){   //porque la matriz tiene 16 elementos
            System.out.println("La matriz es antisimétrica");
        } else{
            System.out.println("La matriz no es antisimétrica");
        }
    }
}
