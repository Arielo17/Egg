package main.utility;

import main.entity.Jugador;
import java.util.Comparator;

public class Comparators {
    
    public static Comparator<Jugador> compareNacionalidad = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador j1, Jugador j2){
            return j1.getNacionalidad().compareTo(j2.getNacionalidad());
        }
    };
    
    public static Comparator<Jugador> comparaEdad = new Comparator<Jugador>(){
        @Override
        public int compare(Jugador j1, Jugador j2){
            return Integer.compare(j1.getEdad(), j2.getEdad());
        }
    };
    
    public static Comparator<Jugador> comparaAltura = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador j1, Jugador j2) {
            return Double.compare(j1.getAltura(), j2.getAltura());
        }
    };
    
}
