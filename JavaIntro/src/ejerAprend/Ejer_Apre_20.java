
package ejerAprend;

import java.util.Scanner;


public class Ejer_Apre_20 {
    
    public static void rellMatr(int[][] mat, int dim){
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la dimension de la matriz cuadrada: ");
        int dim = scanner.nextInt();
        int[][] mat = new int[dim][dim];
        int[] sumCol = new int[dim];
        int[] sumFil = new int[dim];
        
        System.out.println("A continuacion se le pedirá que ingrese los valores de la matriz");
        rellMatr(mat,dim);
        mostrarMatriz(mat,dim);
        
        for (int i = 0; i < dim; i++) {
            sumCol[i]=0;
            sumFil[i]=0;
        }
        
        int colP = 0;
        int colS = 0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                sumCol[j] += mat[i][j];
                sumFil[i] += mat[i][j];
                if (i==j) {
                    colP += mat[i][j];
                    colS += mat[dim-1-i][j];
                }
            }
        }
        
        boolean conf = true;
        for (int i = 0; i < dim-1; i++) {
            if (sumCol[i]!=sumCol[i+1] || sumFil[i]!=sumFil[i+1]){
                conf = false;
            }
        }
        
        if (sumCol[0]!=sumFil[0] || sumCol[0]!=colP || sumCol[0]!=colS) {
            conf = false;
        }
        
        if (conf){    
            System.out.println("Es una matriz magica");
        } else{
            System.out.println("No es una matriz magica");
        }
        
    }
}
