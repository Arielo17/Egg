
package pooejerapren10;

import java.lang.reflect.Array;
import java.util.Arrays;


public class POOEjerApren10 {

    
    public static void main(String[] args) {
        
        double[] a = new double[50];
        double[] b = new double[20];
        System.out.println("A (origina)");
        for (int i = 0; i < 50; i++) {
            a[i] = Math.random()*100;
            System.out.print(String.format("%.2f", a[i])+"  "); //para que me muesstre solo 2 decimales
            if (i%10==9){
                System.out.println("");
            }
        }
        
        Arrays.sort(a);
        
        for (int i = 0; i < 20; i++) {
            if (i<10){
                b[i]=a[i];
            } else{
                b[i] = 0.5;
            }
        }
        
        System.out.println("\nA (ordenado)");
        for (int i = 0; i < 50; i++) {
            System.out.print(String.format("%.2f", a[i])+"  "); //para que me muesstre solo 2 decimales
            if (i%10==9){
                System.out.println("");
            }
        }
        System.out.println("\nB");
        for (int i = 0; i < 20; i++) {
            a[i] = Math.random()*100;
            System.out.print(String.format("%.2f", b[i])+"  "); //para que me muesstre solo 2 decimales
            if (i%10==9){
                System.out.println("");
            }
        }
    }
    
}
