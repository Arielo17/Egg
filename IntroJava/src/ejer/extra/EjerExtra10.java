
package ejer.extra;

import java.util.Random;
import java.util.Scanner;


public class EjerExtra10 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        System.out.println("Adivine la multiplicación entre dos numeros entre 0 y 10");
        boolean adiv = false;
        int cont=0;
        do {
            System.out.print("Respuesta: ");
            int res = scanner.nextInt();
            if (res==num1*num2){
                adiv = true;
            } else if(res<num1*num2){
                System.out.println("El número es mayor");
            } else{
                System.out.println("El número es menor");
            }
            cont++;
        } while (!adiv);
        System.out.println("\nCORRECTO!!!\nCantidad de intentos: "+cont);
    }
}
