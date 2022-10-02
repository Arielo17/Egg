package main.service;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ServiceMarket {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public void createProduct(HashMap<String,Double> market){
        String opc;
        do {
            System.out.print("Ingrese el producto: ");
            String producto = scanner.next();
            System.out.print("Ingrese el valor de " + producto + ": ");
            Double valor = scanner.nextDouble();
            market.put(producto, valor);
            do {
                System.out.print("\nDesea ingresar otro producto? (s/n): ");
                opc = scanner.next();
            } while (!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));
            
        } while (opc.equalsIgnoreCase("s"));
    }
    
    public void modifiPrice(HashMap<String,Double> market){
        String opc="s";
        do{
            boolean encontro = false;
            System.out.print("Ingrese el producto a modificar el precio: ");
            String modificar = scanner.next();
            for(String producto : market.keySet()){
                if(producto.equalsIgnoreCase(modificar)){
                    System.out.println("Ingrese el nuevo precio: ");
                    market.replace(producto, scanner.nextDouble());
                    encontro = true;
                }
            }
            if (encontro){
                System.out.println("Precio modificado con éxito");
            } else {
                System.out.println("El producto no se encuentra");
            }
            do {
                System.out.print("Desea modificar otro producto? (s/n): ");
                opc = scanner.next();
            } while (!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));
        } while(opc.equalsIgnoreCase("s"));
    }
    
    public void deleteProduct(HashMap<String,Double> market){
        boolean encontro = false;
        String opc="s";
        do{
            String claveEliminar = "";
            System.out.print("Ingrese el producto a eliminar: ");
            String eliminar = scanner.next();
            for(String producto : market.keySet()){
                if(producto.equalsIgnoreCase(eliminar)){
                    claveEliminar = producto;
                    encontro = true;
                }
            }
            market.remove(claveEliminar);
            if (!encontro){
                System.out.println("El producto no se encuentra");
            }
            do {
                System.out.print("Desea eliminar otro producto? (s/n): ");
                opc = scanner.next();
            } while (!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));
        } while(opc.equalsIgnoreCase("s"));
        System.out.println("Producto eliminado\n");
    }
    
    public void showProduct(HashMap<String,Double> market){
        for (Map.Entry<String,Double> aux : market.entrySet()) {
            System.out.println(aux.getKey() + "\t" + aux.getValue()); 
        }
    }
}