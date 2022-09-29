package main.entity;

public class Jugador {
    
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String nacionalidad;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, double altura, double peso, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

//    @Override
//    public String toString() {
//        return "Player{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", seleccion=" + nacionalidad + '}';
//    }
    
    @Override
    public String toString() {
        return nombre + "\t" + edad + "\t" + altura + "\t" + peso + "\t" + nacionalidad;
    }
}
