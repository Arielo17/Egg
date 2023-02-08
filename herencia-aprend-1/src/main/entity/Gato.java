package main.entity;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse(){
        System.out.println(nombre + "Se alimenta de: " + alimento);
    }
}
