package main;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Baraja;
import main.entity.Carta;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        Baraja baraja = new Baraja();
        baraja.mostrarBaraja();
        System.out.println("-----");
        baraja.barajar();
        baraja.mostrarBaraja();
        System.out.println("-----");
        System.out.print("Ingrese la cantidad de cartas que quiere: ");
        int cant = scanner.nextInt();
        for (int i = 0; i < cant; i++) {
            baraja.siguienteCarta();
        }
        System.out.println("-----");
        baraja.cartasDisponibles();
        baraja.darCartas();
        baraja.cartasMonton();
        baraja.mostrarBaraja();
    }
}
