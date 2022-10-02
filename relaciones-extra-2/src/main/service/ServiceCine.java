package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Cine;
import main.entity.Espectador;

public class ServiceCine {

    private final Scanner scanner;
    public ServiceCine() {
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    }
    
    public Cine crearCine(){
        Cine cine = new Cine();
        
        crearSala(cine);
        System.out.println("\n--- PELICULA ---");
        crearPelicula(cine);
        System.out.print("\nIngrese el precio de la entrada: ");
        cine.setPrecio(scanner.nextDouble());
        
        return cine;
    }
    
    
    public void crearSala(Cine cine){
        String[][] sala = new String[8][6];
        for (int i = 0; i < 8; i++) {
            String asiento = String.valueOf(8-i);
            for (int j = 0; j < 6; j++) {
                switch (j) {
                case 0:
                    asiento = asiento + "A";
                    break;
                case 1:
                    asiento = asiento + "B";
                    break;
                case 2:
                    asiento = asiento + "C";
                    break;
                case 3:
                    asiento = asiento + "D";
                    break;
                case 4:
                    asiento = asiento + "E";
                    break;
                case 5:
                    asiento = asiento + "F";
                    break;
                default:
                    System.out.println("Salió de rango");
                }
                sala[i][j] = asiento;
                asiento = asiento.substring(0, 1);
            }
            asiento = "";
        }
        cine.setSala(sala);
    }
    
    public void crearPelicula(Cine cine){
        ServicePelicula servicioPelicula = new ServicePelicula();
        cine.setPelicula(servicioPelicula.crearPelicula());
    }
    
    public void ubicarEspectador(Cine cine){
        ServiceEspectador servicioEspectador = new ServiceEspectador();
        Espectador espectador = servicioEspectador.crearEspectador();
        int cantEspectadores = 0;
        if(espectador.getDinero() >= cine.getPrecio() && espectador.getEdad() >= cine.getPelicula().getEdadMin() && cantEspectadores < 48){
            int fila;
            int columna;
            do {
                fila = (int)Math.round(Math.random()*7);
                columna = (int)Math.round(Math.random()*5);
            } while (cine.getSala()[fila][columna].contains("X"));
            System.out.println("Asiento asignado: " + cine.getSala()[fila][columna] + "\n");
            cine.getSala()[fila][columna] = cine.getSala()[fila][columna] + "X";
            
        } else{
            System.out.println("El espectador no dispone de suficiente dinero o es menor de edad\n");
        }
    }
    
    public void mostrarSala(Cine cine){
        for (int i = 0; i < cine.getSala().length; i++) {
            for (int j = 0; j < cine.getSala()[i].length; j++) {
                System.out.print(cine.getSala()[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public void generarEspectadoresAleatorios(Cine cine){
        for (int i = 0; i < 20; i++) {
            int fila;
            int columna;
            do {
                fila = (int)Math.round(Math.random()*7);
                columna = (int)Math.round(Math.random()*5);
            } while (cine.getSala()[fila][columna].contains("X"));
            cine.getSala()[fila][columna] = cine.getSala()[fila][columna] + "X"; 
        }
        
    }
    
}
