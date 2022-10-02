package main;

import main.entity.Cine;
import main.service.ServiceCine;

public class Main {
    
    public static void main(String[] args) {
        ServiceCine servicioCine = new ServiceCine();
        Cine cine = servicioCine.crearCine();
        servicioCine.mostrarSala(cine);
        System.out.println("--------------------");
        servicioCine.generarEspectadoresAleatorios(cine);
        servicioCine.mostrarSala(cine);
        System.out.println("--------------------");
        servicioCine.ubicarEspectador(cine);
        servicioCine.mostrarSala(cine);
    }
}
