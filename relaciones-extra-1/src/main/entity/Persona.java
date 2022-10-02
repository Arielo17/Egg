package main.entity;

import java.util.Objects;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double documento;
    private Perro perro = null;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, double documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDocumento() {
        return documento;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", " + edad + " años, DNI: " + String.format("%.0f", documento) 
                + "\n\tMascota -> " + Objects.toString(perro, " "); //lo uso porque puede ser nulo en valor
    }
}
