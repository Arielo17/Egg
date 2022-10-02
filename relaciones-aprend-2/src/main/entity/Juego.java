package main.entity;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int cantJugadores;
        do{
            System.out.print("Ingrese la cantidad de jugadores (2 a 6): ");
            cantJugadores = scanner.nextInt();
            if(cantJugadores<2 || cantJugadores>6){
                System.out.println("Fuera de rango");
            }
        } while(cantJugadores<2 || cantJugadores>6);
        
        this.jugadores = jugadores;
        for (int i = 0; i < cantJugadores; i++) {
            Jugador jugador = new Jugador(i+1);
            jugadores.add(jugador);
        }
        
        this.revolver = r;
        r.llenarRevolver();
        System.out.println(revolver.toString()+"\n");
    }
    
    public void ronda(){
        int i = 1;
        while(!jugadores.get(i-1).disparo(revolver)){
            if(i==jugadores.size()){
                i=1;
            } else{
                i++;
            }   
        }
        System.out.println("Se ha mojado el jugador " + i);
    }
}
