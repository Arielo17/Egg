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
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
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
    
    private char comprobarConsumoEnergetico(char letra){
        if ((letra>='a' && letra<='f') || (letra>='A' && letra<='F')){
            return letra;
        }
        return 'F';
    }
    
    private String comprobarColor(String color){
       String[] colores = new String[]{"blanco", "negro", "rojo", "azul", "gris"};
       
       for(String aux: colores){
           if(aux.equalsIgnoreCase(color)){
               return color;
           }
       }
       return "Blanco";
    }
    
    public void crearElectrodomestico(){
        this.setPrecio(1000d);
        System.out.print("Color: ");
        this.setColor(comprobarColor(scanner.next()));
        System.out.print("Consumo Energético: ");
        this.setConsumoEnergetico(comprobarConsumoEnergetico(scanner.next().charAt(0)));
        System.out.print("Peso: ");
        this.setPeso(scanner.nextDouble());
    }
    
    public void precioFinal(){
        String consumo = Character.toString(this.getConsumoEnergetico()).toUpperCase();
        switch (consumo) {
            case "A":
                this.setPrecio(this.getPrecio() + 1000d);
                break;
            case "B":
                this.setPrecio(this.getPrecio() + 800d);
                break;
            case "C":
                this.setPrecio(this.getPrecio() + 600d);
                break;
            case "D":
                this.setPrecio(this.getPrecio() + 500d);
                break;
            case "E":
                this.setPrecio(this.getPrecio() + 300d);
                break;
            case "F":
                this.setPrecio(this.getPrecio() + 100d);
                break;
            default:
                System.out.println("Error en precioConsumo");
        }
        
        if(this.getPeso()>1 && this.getPeso()<=19){
            this.setPrecio(this.getPrecio() + 100d);
        } else if(this.getPeso()<=49){
            this.setPrecio(this.getPrecio() + 500d);
        } else if(this.getPeso()<=79){
            this.setPrecio(this.getPrecio() + 800d);
        } else{
            this.setPrecio(this.getPrecio() + 1000d);
        }
    }

    @Override
    public String toString() {
        return color + "\t" + consumoEnergetico + "\t" + peso;
    }
    
    
}
