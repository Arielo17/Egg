package main;

import java.util.HashSet;
import main.service.ServiceCountry;

public class Main {
    
    public static void main(String[] args) {
        
        HashSet<String> countrys = new HashSet<>();
        ServiceCountry sc = new ServiceCountry();
        
        // Ingresamos los paises al Hash
        sc.createHash(countrys);
        
        //Mostramos los paises del Hash
        System.out.println("- Paises ingresados -");
        sc.displayHash(countrys);
        
        // Ordenamos alfabeticamente
        System.out.println("\n- Paises ordenados alfabeticamente -");
        sc.alphabeticalOrder(countrys);
        
        // Eliminamos un pais
        System.out.println("\n- Elimina un pais -");
        sc.deleteCountry(countrys);
    }
}
