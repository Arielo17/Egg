/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerAprend;

import java.util.Scanner;

/**
 *
 * @author Fátima
 */
public class EjerAprend {
    public static void main(String[] args){
        /*
        //EJER 1
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingrese los dos número enteros a sumar:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("La suma de losnúmeros es: "+ (a+b));
        
        //EJER 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nom = scanner.nextLine();
        System.out.println(nom.toUpperCase());
        
        //EJER 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scanner.nextLine();
        System.out.println(frase.toUpperCase()+"\n"+frase.toLowerCase());
        
        //EJER 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en ºC: ");
        float tem = scanner.nextFloat();
        float f = 32+(9*tem/5);
        System.out.println("La temperatura en ºF es: "+f);
        
        //EJER 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();
        System.out.println("El doble del número es: "+ (num*2));
        System.out.println("El triple del número es: "+ (num*3));
        System.out.println("La raiz cuadrada del número es: "+ Math.sqrt(num));
        
        //EJER 6
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para saber si es par o impar: ");
        int num = scanner.nextInt();
        if (num%2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
        //EJER 7
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la contraseña: ");
        String cont = scanner.nextLine();
        if (cont.equals("eureka")){
            System.out.println("Correcto!!");
        } else{
            System.out.println("INCORRECTO...");
        }
        
        //EJER 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase de 8 caracteres");
        String pal = scanner.nextLine();
        if (pal.length()==8){
            System.out.println("Correcto!!");
        } else{
            System.out.println("Incorrecto...");
        }
        
        //EJER 9
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        String pal = scanner.nextLine();
        if (pal.substring(0, 1).equals("A")){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto...");
        }
        
        //EJER 10
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor limite positivo");
        int lim = scanner.nextInt();
        int sum = 0;
        do {
            System.out.println("Ingrese un valor entero positivo");
            int val = scanner.nextInt();
            sum += val;
        } while (sum<lim);
        System.out.println("La suma acumulada es: "+sum);
        
        //EJER 11
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros seguidos de Enter");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String sOn = "n";
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            int opc = scanner.nextInt();
            switch (opc){
                case 1:
                    System.out.println("La suma de ambos números es: "+(a+b));
                    break;
                case 2:
                    System.out.println("La resta de "+a+"-"+b+" es: "+(a-b));
                    break;
                case 3:
                    System.out.println("La multiplicación de ambos número es: "+(a*b));
                    break;
                case 4:
                    System.out.println("La división de "+a+"/"+b+" es: "+(a/b));
                    break;
                case 5:
                    do{
                        System.out.println("¿Está seguro que salir del programa (S/N)?");
                        scanner.nextLine();
                        sOn = scanner.nextLine();
                    } while (!(sOn.equalsIgnoreCase("s") || sOn.equalsIgnoreCase("n")));
                    break;
                default:
                    System.out.println("El valor ingresado es incorrecto");
            }
        } while (sOn.equalsIgnoreCase("n"));
        
        //EJER 12
        System.out.println("RS232");
        Scanner scanner = new Scanner(System.in);
        String ingreso;
        int corr = 0;
        int inc = 0;
        do {
            System.out.print("Ingrese la cadena: ");
            ingreso = scanner.nextLine();
            if (ingreso.substring(0, 1).equals("X") && ingreso.substring(ingreso.length()-1, ingreso.length()).equals("O") && ingreso.length()<=5) {
                System.out.println("Correcto");
                corr++;
            } else {
                System.out.println("Incorrecto");
                inc++;
            }
        } while (!(ingreso.equals("&&&&&")));
        System.out.println("Correctos: "+corr);
        System.out.println("Incorrectos: "+(inc-1));
        System.out.println("Fin del programa...");
        */
        //EJER 13
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado del cuadrado: ");
        int lado = scanner.nextInt();
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i==0 || i==lado-1) {
                    System.out.print("*");
                } else if(j==0 || j==lado-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
