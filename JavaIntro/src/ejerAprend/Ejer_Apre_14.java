
package ejerAprend;

import java.util.Scanner;


public class Ejer_Apre_14 {
    
    public static void moneda(double conv){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la divisa a la que quiere convertir");
        System.out.println("Libras\nDolares\nYenes\n");
        String opc = scanner.nextLine();
        cambiar(conv,opc);
    }
    
    public static void cambiar(double a, String b){
        switch (b.toLowerCase()){
            case "libras":
                System.out.println(a+" Euros -> "+(0.86*a)+" Libras");
                break;
            case "dolares":
                System.out.println(a+" Euros -> "+(1.28611*a)+" Dólares");
                break;
            case "yenes":
                System.out.println(a+" Euros -> "+(129.852*a)+" Yenes");
                break;
            default:
                System.out.println("Por favor, ingrese correctamente la moneda a convertir");
                moneda(a);
                break;
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("CONVERSOR EUROS");
        System.out.print("Ingrese la cantidad de Euros a convertir: ");
        double euro = scanner.nextDouble();
        moneda(euro);
    }
}
