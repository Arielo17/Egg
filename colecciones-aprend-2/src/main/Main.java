package main;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import main.entidad.Alumno;
import main.servicio.ServicioAlumno;

public class Main {
    
    static Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public static void main(String[] args) {
        
        ServicioAlumno sa = new ServicioAlumno();
        ArrayList<Alumno> alumnos = sa.crearAlumno();
        
        for(Alumno aux : alumnos){
            System.out.println(aux);
        }
        String opc = "s";
        do{
            System.out.print("\nIngrese el nombre del alumno que quiere saber la nota final: ");
            String nombre = scanner.next();
            boolean encontro = false;
            for(Alumno aux : alumnos){
                if(aux.getNombre().equalsIgnoreCase(nombre)){
                    encontro = true;
                    System.out.println("La nota final de " + aux.getNombre() + " es: " +sa.notaFinal(aux));
                    opc = "n";
                }
            }
            if (!encontro){
                System.out.println("El alumno no se encuentra en la lista");
                
                do{
                    System.out.print("Desea buscar otro alumno? (s/n): ");
                    opc= scanner.next();
                } while(!(opc.equalsIgnoreCase("s") || opc.equalsIgnoreCase("n")));
            }
        } while(opc.equalsIgnoreCase("s"));
            
    }
    
}
