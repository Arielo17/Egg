package main;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import main.entity.Edificio;
import main.entity.EdificioDeOficinas;
import main.entity.Polideportivo;
import main.service.ServiceEdificioDeOficinas;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        ArrayList<Edificio> edificios = new ArrayList<>();
        
        Edificio polideportivo1 = new Polideportivo();
        System.out.println("- POLIDEPORTIVO -");
        polideportivo1.crearEdificio();
        Edificio edificioDeOficinas1 = new EdificioDeOficinas();
        System.out.println("- EDIFICIO DE OFICINAS -");
        edificioDeOficinas1.crearEdificio();
        Edificio polideportivo2 = new Polideportivo();
        System.out.println("- POLIDEPORTIVO -");
        polideportivo2.crearEdificio();
        Edificio edificioDeOficinas2 = new EdificioDeOficinas();
        System.out.println("- EDIFICIO DE OFICINAS -");
        edificioDeOficinas2.crearEdificio();
        
        edificios.add(polideportivo1);
        edificios.add(edificioDeOficinas1);
        edificios.add(polideportivo2);
        edificios.add(edificioDeOficinas2);
        
        int cantTechadas = 0;
        for (Edificio aux : edificios) {
            if (aux instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) aux;
                System.out.printf("\nLa superficie de " + poli.getNombre() + " es: %.2f",poli.calcularSuperficie());
                System.out.printf("\nEl volumen de " + poli.getNombre() + " es: %.2f",poli.calcularVolumen());
                if(poli.isTechada()){
                    cantTechadas++;
                }
            }
            if(aux instanceof EdificioDeOficinas) {
                EdificioDeOficinas edifOfic = (EdificioDeOficinas) aux;
                int i = 1;
                System.out.printf("\n\nLa superficie del edificio " + i + " es: %.2f",edifOfic.calcularSuperficie());
                System.out.printf("\nEl volumen del edificio " + i + " es: %.2f",edifOfic.calcularVolumen());
                i++;
                edifOfic.cantPersonas(edifOfic);
            }
        }
        System.out.println("\nLa cantidad de Polideportivos techados es: " + cantTechadas);
        
    }
}
