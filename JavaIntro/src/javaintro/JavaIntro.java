/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro;

import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author Fátima
 */
public class JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String nombre = "Ariel";
        short edad = 37;
        System.out.println(nombre + " tiene " + edad + " años.");
        
        //EJERCICIO 5
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese true o false: ");
        boolean sosProgramador = leer.nextBoolean();
        System.out.print("Ingrese su promedio: ");
        double prom = leer.nextDouble();
        System.out.print("Ingrese la incial del apellido: ");
        char inicialApellido = leer.next().charAt(0);
        System.out.println(sosProgramador + " " + prom + " " + inicialApellido);
        
        //EJERCICIO 6
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros seguidos de enter");
        int ent1 = leer.nextInt();
        int ent2 = leer.nextInt();
        if (ent1>25 && ent2>25){
            System.out.println("Los dos numeros son  mayores a 25 ");
        } else if (ent1>25 || ent2>25){
            System.out.println("Almenos uno de los dos es mayor a 25");
        } else {
            System.out.println("Ninguno de los dos es mayor a 25");
        }
        
        //EJERCICIO 7
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de motor: ");
        int tipoMotor = scanner.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        
        //EJERCICIO 8
        Scanner scanner = new Scanner(System.in);
        int nota = -1;
        while (nota<0 || nota>10){
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = scanner.nextInt();
        }
        System.out.println("Gracias! Usted ingreso un: "+nota);
        
        
        //EJERCICIO 9
        Scanner scanner = new Scanner(System.in);
        int cant = 0;
        int suma = 0;
        do{
            System.out.print("Ingrese un número entero: ");
            int num = scanner.nextInt();
            if (num==0){
                System.out.println("Se capturó el número 0");
                break;
            }
            if (num<0){
                continue;
            }
            suma += num;
            cant++;
        } while (cant<20);
        System.out.println("La suma de los número leidos es: "+suma);
        */
        
        //EJERCICIO 10
        Scanner scanner = new Scanner(System.in);
        int num;
        for (int i = 0; i < 4; i++) {
            do{
                System.out.print("Ingrese un número entre 1 y 20: ");
                num = scanner.nextInt();
            } while(num<1 || num>20);
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}
