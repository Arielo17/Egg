package main;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import main.service.ServiceMarket;

public class Main {
    
    public static Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public static void main(String[] args) {
        
        ServiceMarket sm = new ServiceMarket();
        HashMap<String,Double> market = new HashMap<>();
        
        menu(sm, market);
    }
    
    public static void menu(ServiceMarket sm, HashMap<String, Double> market){
        int opc;
        String confirma = "n";
        do{
            System.out.println("----- SUPERMERCADO LA LATA DE PVC -----");
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ingresar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar lista de prodcutos");
            System.out.println("5. Salir");

            switch (opc = scanner.nextInt()) {
                case 1:
                    sm.createProduct(market);
                    break;
                case 2:
                    sm.modifiPrice(market);
                    break;
                case 3:
                    sm.deleteProduct(market);
                    break;
                case 4:
                    sm.showProduct(market);
                    break;
                case 5:
                    do {
                        System.out.print("Está seguro que quiere salir? (s/n): ");
                        confirma = scanner.next();
                    } while (!(confirma.equalsIgnoreCase("s") || confirma.equalsIgnoreCase("n")));
                    break;
                default:
                    System.out.println("Ingreso incorrecto...\n");
                    menu(sm,market);
            }
            System.out.println("");
        } while(opc != 5 || confirma.equalsIgnoreCase("n"));
        
    }
    
}
