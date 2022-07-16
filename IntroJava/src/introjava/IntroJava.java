/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class IntroJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        //EJERCICIO 11
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la frase a modificar:");
        String frase = scanner.nextLine();
        System.out.println("");
        System.out.println("La frase modificada es:"+Modificar(frase));
        
        
        //EJERCICIO 12
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos numeros, para saber si el primero es multiplo del segundo:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        EsMultiplo(a,b);
        
        
        //EJERCICIO 13
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de integrantes del equipo: ");
        int integ = scanner.nextInt();
        scanner.nextLine(); //Ponemos esta linea por https://es.stackoverflow.com/questions/229152/scanner-nextline-error-salta-una-linea
        String[] equipo = new String[integ];
        
        //Pido que ingrese los nombres del quipo
        for (int i = 0; i < integ; i++) {
            System.out.print("Ingesa el nombre del jugador "+i+": ");
            String nom = scanner.nextLine();
            equipo[i] = nom;
        }
        //Muestro el vector
        for (int i = 0; i < integ; i++) {
            System.out.print(equipo[i]+"  ");
        }
        System.out.println("");
        */
    }
    
    //EJERCICIO 11
    public static String Modificar(String fra){
        String modif;
        modif = fra.toLowerCase().replace("a", "@");
        modif = modif.replace("e", "#");
        modif = modif.replace("i","$");
        modif = modif.replace("o","%");
        modif = modif.replace("u","*");
        return modif;
    }
    
    //EJERCICIO 12
    public static void EsMultiplo(int x, int y){
        if (x % y == 0){
            System.out.println("El numero "+x+" es múltiplo de "+y);
        } else {
            System.out.println("El numero "+x+" no es múltiplo de "+y);
        }
    }
    
}
