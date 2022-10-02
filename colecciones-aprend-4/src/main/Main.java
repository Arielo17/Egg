package main;

import java.util.ArrayList;
import main.entity.Film;
import main.service.ServiceFilm;

public class Main {
    
    public static void main(String[] args) {
        
        ServiceFilm sf = new ServiceFilm();
        
        // Ingresamos los datos de cada película y guardamos en ArrayList
        System.out.println("Empecemos a guardar las películas...");
        ArrayList<Film> filmList = sf.createFilm();
        
        // Mostramos la lista de películas
        System.out.println("Estas son las películas guardadas:");
        sf.displayList(filmList);
        
        // Mostramos las películas con duracion menor a 1 hora
        System.out.println("Lista de películas con duración mayor a 1 hora:");
        sf.durationGreaterHour(filmList);
        
        // Mostramos las peliculas en orden descendente en cuanto a la duración
        System.out.println("Películas ordenadas de mayor duración a menor duración:");
        sf.orderDurationDesc(filmList);
        
        // Mostramos las peliculas en orden ascendente en cuanto a la duración
        System.out.println("Películas ordenadas de menor duración a mayor duración:");
        sf.orderDurationAsc(filmList);
        
        // Ordenamos las películas alfabeticamente según el título
        System.out.println("Películas ordenadas según el título:");
        sf.orderTitle(filmList);
        
        // Ordenamos las películas alfabeticamente según el director
        System.out.println("Películas ordenadas según el director de la película:");
        sf.orderDirector(filmList);
    }
}
