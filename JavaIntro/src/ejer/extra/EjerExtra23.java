
package ejer.extra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjerExtra23 {
    
    public static void buscarFila(int[] rand){
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            rand[i] = rd.nextInt(19);
        }
        Arrays.sort(rand);
        for (int i = 0; i < 4; i++) {
            if(rand[i]==rand[i+1]){
                rand[i+1]++;
            }
        }
    }
    
    public static void main(String[] args){
        
        String[][] sopa = new String[20][20];
        Scanner sc = new Scanner(System.in);
        
        int[] rand = new int[5]; // aqui guardo los random para ver q no se repitan
        buscarFila(rand);
        
        for (int i = 0; i < 5; i++) {
            String pal;
            do{
                System.out.println("Ingrese la palabra a agregar (3 a 5 caracteres): ");
                pal = sc.nextLine();
            } while (pal.length()<3 || pal.length()>5);
            
            for (int j = 0; j < pal.length(); j++) {
                
            }
        }
        
    }
    
}
