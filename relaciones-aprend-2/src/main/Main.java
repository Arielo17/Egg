package main;

import java.util.ArrayList;
import main.entity.Juego;
import main.entity.Jugador;
import main.entity.Revolver;

public class Main {
    
    public static void main(String[] args) {
        
        Juego juego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Revolver r = new Revolver();
        
        juego.llenarJuego(jugadores, r);
        juego.ronda();
    }
}
