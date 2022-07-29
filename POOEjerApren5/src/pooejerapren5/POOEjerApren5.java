
package pooejerapren5;

import java.util.Scanner;
import pooejerapren5.entidades.Cuenta;


public class POOEjerApren5 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int op1;
        
        do {
            System.out.println("--- BANCO MIENDO ---");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Extracción rápida");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Consultar dato");
            System.out.println("7. Salir");
            System.out.print("Opcion: ");
            op1 = sc.nextInt();
            
            switch (op1) {
                case 1:
                    Cuenta cta = new Cuenta();
                    cta.crearCuenta();
                    break;
                case 2:
                    System.out.println("Ingrese el monto a depositar: ");
                    cta.ingresar(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Ingrese el monto a retirar: ");
                    cta.retirar(sc.nextDouble());
                    break;
                case 4:
                    cta.extraccionRapida();
                    break;
                case 5: 
                    System.out.println("Saldo: "+cta.consultarSaldo());
                    break;
                case 6:
                    cta.consultarDatos();
                    break;
            }
        } while (op1!=7);
        
    }
    
}
