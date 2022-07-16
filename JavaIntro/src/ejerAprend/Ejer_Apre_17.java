
package ejerAprend;

import java.util.Random;
import java.util.Scanner;

public class Ejer_Apre_17 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la dimension del vector: ");
        int dim = scanner.nextInt();
        int[] vec = new int[dim];
        Random random = new Random();
        int uni = 0;
        int dec = 0;
        int cen = 0;
        int unMil = 0;
        int deMil = 0;
        for (int i = 0; i < dim; i++) {
            vec[i] = random.nextInt(99999); //no me gusta,siempre numeros altos
            System.out.println(vec[i]+" ");
            if (0<vec[i] && vec[i]<10){
                uni++;
            }
            if (10<vec[i] && vec[i]<100){
                dec++;
            }
            if (100<vec[i] && vec[i]<1000){
                cen++;
            }
            if (1000<vec[i] && vec[i]<10000){
                unMil++;
            }
            if (10000<vec[i] && vec[i]<100000){
                deMil++;
            }
        }
        System.out.println("Un digito: "+uni+"\nDos digitos: "+dec+"\nTres digitos: "+cen+"\nCuatro digitos:"+unMil+"\nCinco digitos: "+deMil);
        
    }
}
