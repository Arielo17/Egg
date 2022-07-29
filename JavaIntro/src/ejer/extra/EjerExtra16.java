
package ejer.extra;

import java.util.Scanner;


public class EjerExtra16 {
    
    public static void ingresoPersonas(String[] nom, int[] edad, int per){
        
        Scanner scanner =new Scanner(System.in);
        for (int i = 0; i < per; i++) {
            System.out.print("Ingrese el nombre de la persona "+(i+1)+": ");
            nom[i]=scanner.nextLine();
            System.out.print("Ingrese la edad de "+nom[i]+": ");
            edad[i]=scanner.nextInt();
            scanner.nextLine();
        }
    }
    
    public static void mayorEdad(String nom, int edad){
        if (edad>18) {
            System.out.println(nom+" es mayor de edad");
        } else{
            System.out.println(nom+" no es mayor de edad");
        }
    }
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas a ingresar: ");
        int per = scanner.nextInt();
        scanner.nextLine();
        String[] nom = new String[per]; 
        int[] edad = new int[per];
        ingresoPersonas(nom,edad,per);
        System.out.println("");
        int i=0;
        String opc;
        do {
            mayorEdad(nom[i], edad[i]);
            do{
                System.out.print("Desea seguir mostrando? (si/no): ");
                opc = scanner.nextLine();
            } while(!(opc.equalsIgnoreCase("si") || opc.equalsIgnoreCase("no")));
            i++;
        } while (i<per && opc.equalsIgnoreCase("si"));
        
    }
}
