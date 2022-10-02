package main.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class ServiceCountry {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public void createHash(HashSet countrys){
        String opc;
        do {
            System.out.print("Ingrese el nombre de un país: ");
            countrys.add(scanner.next());
            do {
                System.out.print("Desea ingresar otro país (s/n): ");
                opc = scanner.next();
            } while (!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));
            System.out.println("");
        } while (opc.equalsIgnoreCase("s"));
    }
    
    public void displayHash (HashSet countrys){
        for(Object aux : countrys){
            System.out.println(aux);
        }
    }
    
    public void alphabeticalOrder(HashSet countrys){
        ArrayList<String> countrysArray = new ArrayList<>(countrys);
        Collections.sort(countrysArray);
        for(String aux : countrysArray){
            System.out.println(aux);
        }
    }
    
    public void deleteCountry(HashSet countrys){
        int dimInicial = countrys.size();
        System.out.print("Ingrese el pais a eliminar: ");
        String eliminar = scanner.next();
        Iterator<String> itCountrys = countrys.iterator();
        while (itCountrys.hasNext()) {
            if(itCountrys.next().equalsIgnoreCase(eliminar)){
                itCountrys.remove();
                System.out.println("Se ha eliminado " + eliminar + "\n");
                displayHash(countrys);
            }
        }
        if (countrys.size() == dimInicial){
            System.out.println("El país no se encuentra en la lista");
        }
        
        String opc;
        do {
            System.out.print("\nDesea eliminar otro país? (s/n): ");
            opc = scanner.next();
        } while (!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));
        if (opc.equalsIgnoreCase("s")){
            deleteCountry(countrys);
        }
    }
}
