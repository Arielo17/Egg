
package ejer.extra;

import java.util.Scanner;


public class EjerExtra14 {
    
    public static double familias(int f){
        double sumFam = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < f; i++) {
            System.out.println("FAMILIA "+(i+1));
            System.out.print("Ingrese la cantidad de hijos: ");
            int hijos = scanner.nextInt();
            sumFam += edades(hijos);
        }
        System.out.println(sumFam/f);
        return sumFam/f;
    }
    
    public static double edades(int h){
        double sumEdad = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < h; i++) {
            System.out.print("Ingrese la edad del hijo "+(i+1)+": ");
            int edad = scanner.nextInt();
            sumEdad += edad;
        }
        System.out.println(sumEdad/h);
        return sumEdad/h;
    }
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de familias: ");
        int fam = scanner.nextInt();
        System.out.println("El promedio de edades de los hijos es: "+familias(fam));
    }
}
