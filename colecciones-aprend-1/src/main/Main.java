package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // 1
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razaPerro = new ArrayList();
        
        String opc;
        do {
            System.out.print("Ingrese una raza de perro: ");
            razaPerro.add(scanner.next());
            do {
                System.out.print("Quiere ingresar otra raza? (s/n): ");
                opc = scanner.next();
            } while (!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));
        } while (opc.equalsIgnoreCase("s"));
        
        System.out.println("\nRazas ingresadas: ");
        for (String aux : razaPerro){
            System.out.println(aux + " ");
        }
        
        //2
        System.out.print("\nIngrese una raza de perro para ver si está en la lista y eliminarla: ");
        String buscaRaza = scanner.next();
        int cantRazas = razaPerro.size();
        Iterator itRazaPerro = razaPerro.iterator();
        while (itRazaPerro.hasNext()) {
            if (itRazaPerro.next().equals(buscaRaza)) {
                itRazaPerro.remove();
            } 
        }
        if (cantRazas == razaPerro.size()) {
            System.out.println("La raza ingresada no se encuentra en la lista");
        }
        
        Collections.sort(razaPerro);
        System.out.println("\nRazas ordenadas: ");
        for (String aux : razaPerro){
            System.out.println(aux + " ");
        }
    }
    
}
