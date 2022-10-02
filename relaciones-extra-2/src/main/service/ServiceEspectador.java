package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Espectador;

public class ServiceEspectador {
    
    public Espectador crearEspectador(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        Espectador espectador = new Espectador();
        
        System.out.print("Nombre: ");
        espectador.setNombre(scanner.next());
        System.out.print("Edad: ");
        espectador.setEdad(scanner.nextInt());
        System.out.print("Dinero que dispone: ");
        espectador.setDinero(scanner.nextDouble());
        
        return espectador;
    }
    
}
