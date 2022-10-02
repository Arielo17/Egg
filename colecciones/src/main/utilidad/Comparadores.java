package main.utilidad;

import java.util.Comparator;
import main.entidad.Libro;

public class Comparadores {
    
    // Ordeno por anio ascendente 
    public static Comparator<Libro> ordenarPorAnio = new Comparator<Libro>() {
        @Override
        public int compare(Libro o1, Libro o2) {
            return o1.getAnio().compareTo(o2.getAnio());
        }
    };
    
    
    // Ordeno por titulo descendente 
    public static Comparator<Libro> ordenarPorTitulo = new Comparator<Libro>() {
        @Override
        public int compare(Libro o1, Libro o2) {
            return o2.getTitulo().compareToIgnoreCase(o1.getTitulo());
        }
    };
    
}
