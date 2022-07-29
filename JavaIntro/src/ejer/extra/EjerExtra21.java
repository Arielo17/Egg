
package ejer.extra;

import java.util.Scanner;

public class EjerExtra21 {
    
    public static void main(String[] args){
        
        double[][] notas = new double[10][5];
        String[] nom = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("\nIngrese el nombre del alumno: ");
            nom[i] = sc.nextLine();
            
            System.out.print("Ingrese la nota del Primer TPE: ");
            notas[i][0] = sc.nextInt();
            System.out.print("Ingrese la nota del Segundo TPE: ");
            notas[i][1] = sc.nextInt();
            System.out.print("Ingrese la nota del Primer Integrador: ");
            notas[i][2] = sc.nextInt();
            System.out.print("Ingrese la nota del Segundo Itegrador: ");
            notas[i][3] = sc.nextInt();
            sc.nextLine();
            notas[i][4] = 0.1*notas[i][0]+0.15*notas[i][1]+0.25*notas[i][2]+0.5*notas[i][3];
        }
        
        System.out.println("\nALUMNOS APROBADOS");
        for (int i = 0; i < 10; i++) {
            if (notas[i][4]>=7){
                System.out.println(nom[i]+" - Promedio: "+notas[i][4]);
            }
        }
        System.out.println("\nALUMNOS DESAPROBADOS");
        for (int i = 0; i < 10; i++) {
            if (notas[i][4]<7){
                System.out.println(nom[i]+" - Promedio: "+notas[i][4]);
            }
        }
    }
    
}
