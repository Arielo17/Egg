
package pooejerapren11;

import java.util.Date;
import java.util.Scanner;


public class POOEjerApren11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int dia,mes,anio;
        do {
            System.out.print("Ingrese un dia: ");
            dia = sc.nextInt();
        } while (dia<1 || dia>31);
        do {
            System.out.print("Ingrese un mes: ");
            mes = sc.nextInt();
        } while (mes<1 || mes>12);
        do {
            System.out.print("Ingrese el año: ");
            anio = sc.nextInt();
        } while (anio<0 || anio>9999);
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        System.out.println(fecha);
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        
        System.out.println("De "+fecha+" a la actualidad, pasaron "+(fechaActual.getYear()-fecha.getYear())+" años");
    }
    
}
