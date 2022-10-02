package main;

import java.util.ArrayList;
import main.entity.Perro;
import main.entity.Persona;
import main.service.ServicePerro;
import main.service.ServicePersona;

public class Main {
    
    public static void main(String[] args) {
        
        ServicePersona servicioPersona = new ServicePersona();
        ServicePerro servicioPerro = new ServicePerro();
        
        ArrayList<Persona> listaPersonas = servicioPersona.crearListaPersonas();
        ArrayList<Perro> jauria = servicioPerro.crearJauria();
        
        servicioPersona.elegirPerro(listaPersonas, jauria);
        System.out.println("------------------");
        servicioPersona.mostrarPersonaPerro(listaPersonas);
        
    }
}
