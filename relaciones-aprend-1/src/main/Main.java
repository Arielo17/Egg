package main;

import main.entity.Perro;
import main.entity.Persona;
import main.service.ServicePerro;
import main.service.ServicePersona;

public class Main {
    
    public static void main(String[] args) {
        
        ServicePersona servicioPersona = new ServicePersona();
        ServicePerro servicePerro = new ServicePerro();
        
        System.out.println("Ingrese la primer persona");
        Persona persona1 = servicioPersona.crearPersona();
        System.out.println("\nIngrese la segunda persona");
        Persona persona2 = servicioPersona.crearPersona();
        
        System.out.println("\nIngrese el perro de " + persona1.getNombre() + ": ");
        persona1.setPerro(servicePerro.crearPerro());
        
        System.out.println("\nIngrese el perro de "+ persona2.getNombre() + ": ");
        persona2.setPerro(servicePerro.crearPerro());
        
        servicioPersona.mostrarPersonaPerro(persona1);
        System.out.println("");
        servicioPersona.mostrarPersonaPerro(persona2);
    }
}
