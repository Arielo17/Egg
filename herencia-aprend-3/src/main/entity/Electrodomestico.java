package main.entity;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    public final Scanner scanner;

    public Electrodomestico() {
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        this.precio = 1000d;
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        precio = 1000d;
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    private char comprobarConsumoEnergetico(char letra) {
        if ((letra >= 'a' && letra <= 'f') || (letra >= 'A' && letra <= 'F')) {
            return letra;
        }
        return 'F';
    }

    private String comprobarColor(String color) {
        String[] colores = new String[]{"blanco", "negro", "rojo", "azul", "gris"};

        for (String aux : colores) {
            if (aux.equalsIgnoreCase(color)) {
                return color;
            }
        }
        return "Blanco";
    }

    public Electrodomestico crearElectrodomestico() {
        
        Electrodomestico electrodomestico = new Electrodomestico();
        System.out.print("Color: ");
        electrodomestico.setColor(comprobarColor(scanner.next()));
        System.out.print("Consumo Energético: ");
        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(scanner.next().charAt(0)));
        System.out.print("Peso: ");
        electrodomestico.setPeso(scanner.nextDouble());
        return electrodomestico;
    }

    public double precioFinal(Electrodomestico electrodomestico) {
        double precioElectro = electrodomestico.getPrecio();

        double precioConsumo = 0;
        String consumo = Character.toString(electrodomestico.getConsumoEnergetico()).toUpperCase();
        switch (consumo) {
            case "A":
                precioConsumo = 1000d;
                break;
            case "B":
                precioConsumo = 800d;
                break;
            case "C":
                precioConsumo = 600d;
                break;
            case "D":
                precioConsumo = 500d;
                break;
            case "E":
                precioConsumo = 300d;
                break;
            case "F":
                precioConsumo = 100d;
                break;
            default:
                System.out.println("Error en precioConsumo");
        }

        double precioPeso;
        double pesoElectro = electrodomestico.getPeso();
        if (pesoElectro > 1 && pesoElectro <= 19) {
            precioPeso = 100d;
        } else if (pesoElectro <= 49) {
            precioPeso = 500d;
        } else if (pesoElectro <= 79) {
            precioPeso = 800d;
        } else {
            precioPeso = 1000d;
        }

        return precioElectro + precioConsumo + precioPeso;
    }

    @Override
    public String toString() {
        return color + "\t" + consumoEnergetico + "\t" + peso;
    }

}
