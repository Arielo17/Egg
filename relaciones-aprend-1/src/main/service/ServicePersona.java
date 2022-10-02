package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Perro;
import main.entity.Persona;

public class ServicePersona {
    
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        
        System.out.print("Nombre: ");
        persona.setNombre(scanner.next());
        System.out.print("Apellido: ");
        persona.setApellido(scanner.next());
        System.out.print("Edad: ");
        persona.setEdad(scanner.nextInt());
        System.out.print("DNI: ");
        persona.setDocumento(scanner.nextDouble());
          
        return persona;
    }
    
    public void mostrarPersonaPerro (Persona persona){
        System.out.println(persona.toString());
    }
}
