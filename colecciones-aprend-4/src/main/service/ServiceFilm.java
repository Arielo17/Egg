package main.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
import main.entity.Film;
import main.utility.Comparators;

public class ServiceFilm {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public ArrayList<Film> createFilm(){
        ArrayList<Film> filmList = new ArrayList<>();
        String opc = "s";
        do {
            Film film = new Film();
            System.out.print("Titulo: ");
            film.setTitle(scanner.next());
            System.out.print("Director: ");
            film.setDirector(scanner.next());
            System.out.print("Duración (minutos): ");
            film.setDuration(scanner.nextInt());
            filmList.add(film);
            
            do{
                System.out.print("Desea agregar otra película? (s/n): ");
                opc = scanner.next();
                System.out.println("");
            } while(!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));
        } while (opc.equalsIgnoreCase("s"));
        
        return filmList;
    }
    
    public void displayFilm(Film film){
        System.out.println("Título: " + film.getTitle());
        System.out.println("Director: " + film.getDirector());
        System.out.println("Duración (h): " + film.getDuration() + "\n");
    }
    
    public void displayList(ArrayList<Film> filmList){
        for(Film aux : filmList){
            displayFilm(aux);
        }
    }
    
    public void durationGreaterHour(ArrayList<Film> filmList){
        for(Film aux : filmList){
            if(aux.getDuration() > 60){
                displayFilm(aux);
            }
        }
    }
    
    public void orderDurationDesc(ArrayList<Film> filmList){
        Collections.sort(filmList, Comparators.durationOrderDesc);
        for(Film aux : filmList){
            displayFilm(aux);
        }
    }
    
    public void orderDurationAsc(ArrayList<Film> filmList){
        Collections.sort(filmList, Comparators.durationOrderAsc);
        for(Film aux : filmList){
            displayFilm(aux);
        }
    }
    
    public void orderTitle(ArrayList<Film> filmList){
        Collections.sort(filmList, Comparators.titleOrder);
        for(Film aux : filmList){
            displayFilm(aux);
        }
    }
    
    public void orderDirector(ArrayList<Film> filmList){
        Collections.sort(filmList, Comparators.directorOrder);
        for(Film aux : filmList){
            displayFilm(aux);
        }
    }
}
