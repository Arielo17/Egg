package main;

import main.entity.Alquiler;

public class Main {

    public static void main(String[] args) {
        Alquiler alquiler = new Alquiler();
        alquiler = alquiler.crearAlquiler();
        System.out.println(alquiler.toString());
        
        System.out.println("Costo Alquiler: " + alquiler.costoAlquiler(alquiler.getBarco()));
    }
}
