
package ejerAprend;

import java.util.Scanner;


public class Ejer_Apre_20 {
    
    public static void rellMatr(int[][] mat){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("Ingrese el valor de la posición ["+i+"]["+j+"]: ");
                    mat[i][j]=scanner.nextInt();
                } while (mat[i][j]<1 || mat[i][j]>9);
            }
        }
    }
    
    public static void mostrarMatriz(int[][] a, int dim){
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    
    public static void main(String[] args){
        int[][] mat = new int[3][3];
        //Scanner scanner = new Scanner(System.in);
        System.out.println("A continuacion se le pedirá que ingrese los valores de la matriz");
        rellMatr(mat);
        mostrarMatriz(mat,3);
        
        int[] sumCol = {0,0,0};
        int[] sumFil = {0,0,0};
        int colP = 0;
        int colS = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumCol[j] += mat[i][j];
                sumFil[i] += mat[i][j];
                if (i==j) {
                    colP += mat[i][j];
                    colS += mat[2-i][j];
                }
            }
        }
        
        if (sumCol[0]==sumCol[1]&& sumCol[1]== sumCol[2] && sumCol[2]==sumFil[1] && sumFil[1]==sumFil[2] && sumFil[2]==colP && colP==colS) {
            System.out.println("Es una matriz magica");
        } else{
            System.out.println("No es una matriz magica");
        }
        
    }
}
