package main.entity;

import java.util.Locale;
import java.util.Scanner;
import main.service.ServiceEdificio;

public abstract class Edificio {
    
    protected double alto;
    protected double ancho;
    protected double largo;
    protected Scanner scanner;

    public Edificio() {
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    }

    public Edificio(double alto, double ancho, double largo) {
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public abstract double calcularSuperficie();
    public abstract double calcularVolumen();
    
    public void crearEdificio() {
        System.out.println("Ancho: ");
        this.setAncho(scanner.nextDouble());
        System.out.println("Largo: ");
        this.setLargo(scanner.nextDouble());
        System.out.println("Alto: ");
        this.setAlto(scanner.nextDouble());
    }

    @Override
    public String toString() {
        return "Edificio{" + "alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + '}';
    }
}
