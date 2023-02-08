package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Rectangulo;

public class ServiceRectangulo {
    
    public Rectangulo crearRectangulo() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("\nRECTANGULO");
        System.out.print("Ingrese la altura: ");
        rectangulo.setAltura(scanner.nextDouble());
        System.out.print("Ingrese la base: ");
        rectangulo.setBase(scanner.nextDouble());
        
        return rectangulo;
    }
    
    public void mostrarPerimetro(Rectangulo rectangulo) {
        System.out.printf("\nEl perímetro del rectángulo es: %.4f" , rectangulo.calcualarPerimetro());
    }
    
    public void mostrarArea(Rectangulo rectangulo) {
        System.out.printf("\nEl área del rectángulo es: %.4f\n" , rectangulo.calcularArea());
    }
}
