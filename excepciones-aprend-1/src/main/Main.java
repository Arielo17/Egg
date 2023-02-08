package main;

import main.entidades.Persona;
import main.servicios.ServicioPersona;

public class Main {

    public static void main(String[] args) {

        Persona persona = null;
        ServicioPersona servicioPersona = new ServicioPersona();

        try {
            servicioPersona.esMayorDeEdad(persona);
        } catch (NullPointerException e) {
            System.out.println("No se puede calcular la edad de la persona");
        }
    }
}
