package main.entity;

import java.util.Locale;
import java.util.Scanner;

public class Barco {

    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;
    protected Scanner scanner;

    public Barco() {
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    }

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void crearBarco() {
        System.out.println("\nDatos del barco:");
        System.out.print("\tMatrícula: ");
        this.setMatricula(scanner.next());
        System.out.print("\tEslora: ");
        this.setEslora(scanner.nextDouble());
        System.out.print("\tAño de fabricación: ");
        this.setAnioFabricacion(scanner.nextInt());
    }

    public double costoAlquiler(Barco barco) {
        return barco.getEslora() * 10;  
    }
    
    @Override
    public String toString() {
        return "Matricula: " + matricula + "\tEslora: " + eslora + "\tAño de Fabricación: " + anioFabricacion;
    }

}
