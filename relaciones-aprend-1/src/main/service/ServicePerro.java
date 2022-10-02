package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Perro;

public class ServicePerro {
    
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Perro crearPerro(){
        Perro perro = new Perro();
        
        System.out.print("Nombre: ");
        perro.setNombre(scanner.next());
        System.out.print("Raza: ");
        perro.setRaza(scanner.next());
        System.out.print("Edad: ");
        perro.setEdad(scanner.nextInt());
        System.out.print("Tamaño: ");
        perro.setTamaño(scanner.next());
        
        return perro;
    }
    
}
