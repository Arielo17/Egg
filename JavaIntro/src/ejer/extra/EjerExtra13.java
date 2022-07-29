
package ejer.extra;

import java.util.Scanner;


public class EjerExtra13 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera: ");
        int alt = scanner.nextInt();
        int x=1;
        do {
            for (int i = 1; i <= x; i++) {
                System.out.print(i);
            }
            System.out.println("");
            x++;
        } while (x<=alt);   
    }
    
}
