package main.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import main.entity.Jugador;
import main.utility.Comparators;

public class ServiceJugador {
    
    private final Scanner scanner;

    public ServiceJugador() {
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    }
    
    /* Creamos una lista de jugadores, los cuales se ingresan en el
     * método crearJugador(), y preguntamos si queremos seguir ingresando
     * más jugadores.*/
    public ArrayList<Jugador> crearListaJugadores(){
        
        ArrayList<Jugador> jugadores = new ArrayList<>();
        String opcion = "s";
        do{
            Jugador jugador = crearJugador();
            jugadores.add(jugador);
            do {
                System.out.print("Desea ingresar otro jugador? (s/n): ");
                opcion = scanner.next();
                System.out.println("");
            } while (!(opcion.equalsIgnoreCase("s") || opcion.equalsIgnoreCase("n")));
        } while(opcion.equalsIgnoreCase("s"));
        return jugadores;
    }
    
    /* Pedimos al usuario que ingrese cada uno de los parámetros que serán 
     * guardados en el objeto 'jugador'.*/
    public Jugador crearJugador(){
        Jugador jugador = new Jugador();
        
        System.out.print("Ingrese el nombre del jugador: ");
        jugador.setNombre(scanner.next());
        System.out.print("Ingrese la edad de " + jugador.getNombre() + ": ");
        jugador.setEdad(scanner.nextInt());
        System.out.print("Ingrese la altura de " + jugador.getNombre() + ": ");
        jugador.setAltura(scanner.nextDouble());
        System.out.print("Ingrese el peso de " + jugador.getNombre() + ": ");
        jugador.setPeso(scanner.nextDouble());
        System.out.print("Ingrese la nacionalidad de " + jugador.getNombre() + ": ");
        jugador.setNacionalidad(scanner.next());
        
        return jugador;
    }
    
    /* Muestra los objetos juardados en la lista.*/
    public void mostrarLista(ArrayList<Jugador> jugadores){
        System.out.println("NOMBRE\tEDAD\tALTURA\tPESO\tNACIONALIDAD");
        for(Jugador aux : jugadores){
            System.out.println(aux.toString());
        }
    }
    
    /* Pide al usuario que ingrese el nombre de un jugador, si está
     * en la lista lo elimina y sino envía un mensaje.*/
    public void eliminarJugador(ArrayList<Jugador> jugadores){
        System.out.print("\nIngrese el nombre del jugador a eliminar: ");
        String eliminar = scanner.next();
        boolean encontro = false;
        Iterator<Jugador> itJugadores = jugadores.iterator();
        while(itJugadores.hasNext()){
            if(itJugadores.next().getNombre().equalsIgnoreCase(eliminar)){
                itJugadores.remove();
                encontro = true;
            }
        }
        if(!encontro){
            System.out.println("El jugador no se encuentra en la lista\n");
        }
    }
    
    /* Ordena la lista alfabeticamente según nacionalidad.*/
    public void ordenarNacionalidad(ArrayList<Jugador> jugadores){
        jugadores.sort(Comparators.compareNacionalidad);
        mostrarLista(jugadores);
    }
    
    /* Ordena la lista de menor edad a mayor edad.*/
    public void ordenarEdad(ArrayList<Jugador> jugadores){
        jugadores.sort(Comparators.comparaEdad);
        mostrarLista(jugadores);
    }
    
    /* Ordena la lista de más alto a más bajo.*/
    public void ordenarAltura(ArrayList<Jugador> jugadores){
        jugadores.sort(Comparators.comparaAltura);
        mostrarLista(jugadores);
    }
}
