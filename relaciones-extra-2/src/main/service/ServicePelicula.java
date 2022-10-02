package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Pelicula;

public class ServicePelicula {
    
    public Pelicula crearPelicula(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        Pelicula pelicula = new Pelicula();
        
        System.out.print("Titulo: ");
        pelicula.setTitulo(scanner.next());
        System.out.print("Duracion (min): ");
        pelicula.setDuracion(scanner.nextInt());
        System.out.print("Edad minima: ");
        pelicula.setEdadMin(scanner.nextInt());
        System.out.print("Director: ");
        pelicula.setDirector(scanner.next());
        
        return pelicula;
    }
    
}
