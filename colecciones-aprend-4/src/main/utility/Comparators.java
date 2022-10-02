package main.utility;

import java.util.Comparator;
import main.entity.Film;

public class Comparators {
    
   public static Comparator<Film> durationOrderAsc = new Comparator<Film>(){
       @Override
       public int compare(Film f1, Film f2) {
           return Integer.compare(f1.getDuration(), f2.getDuration());
       }
   };
   
   public static Comparator<Film> durationOrderDesc = new Comparator<Film>(){
       @Override
       public int compare(Film f1, Film f2) {
           return Integer.compare(f2.getDuration(), f1.getDuration());
       }
   };
   
   public static Comparator<Film> titleOrder = new Comparator<Film>(){
       @Override
       public int compare(Film f1, Film f2){
           return f1.getTitle().compareToIgnoreCase(f2.getTitle());
       }
   };
   
   public static Comparator<Film> directorOrder = new Comparator<Film>(){
        @Override
        public int compare(Film f1, Film f2){
            return f1.getDirector().compareToIgnoreCase(f2.getDirector());
        }
   };
}
