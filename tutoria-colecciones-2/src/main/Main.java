package main;

import java.util.ArrayList;
import main.entity.Jugador;
import main.service.ServiceJugador;

public class Main {
    
    public static void main(String[] args) {
        
        ServiceJugador servicioJugador = new ServiceJugador();
        ArrayList<Jugador> jugadores = servicioJugador.crearListaJugadores();
        servicioJugador.mostrarLista(jugadores);
        
        // Eliminamos un jugador de la lista
        servicioJugador.eliminarJugador(jugadores);
        servicioJugador.mostrarLista(jugadores);
        
        //Ordenar
        System.out.println("\nOrdenamos por Nacionalidad: ");
        servicioJugador.ordenarNacionalidad(jugadores);
        
        System.out.println("\nOrdenamos por Edad: ");
        servicioJugador.ordenarEdad(jugadores);
        
        System.out.println("\nOrdenamos por Altura: ");
        servicioJugador.ordenarAltura(jugadores);
    }
}
