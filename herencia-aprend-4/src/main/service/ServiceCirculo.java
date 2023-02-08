package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Circulo;

public class ServiceCirculo extends Circulo {

    public Circulo crearCirculo() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Circulo circulo = null;
        System.out.println("\nCIRCULO");
        System.out.print("Ingrese el radio: ");
        setRadio(scanner.nextDouble());

        return circulo;
    }
    
    public void mostrarPerimetro(Circulo circulo) {
        System.out.printf("\nEl perímetro del círculo es: %.4f", calcualarPerimetro());
    }
    
    public void mostrarArea(Circulo circulo) {
        System.out.printf("\nEl área del círculo es: %.4f\n", calcularArea());
    }
}
