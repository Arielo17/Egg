package main;

import main.entity.Arreglo;

public class Main {
    public static void main(String[] args) {
        
        Arreglo arreglo = new Arreglo();
        try {
            arreglo.llenarNombres();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha salido del rango del arreglo\n");
        }
    }
}
