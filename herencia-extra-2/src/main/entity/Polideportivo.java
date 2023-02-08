package main.entity;

import main.service.ServicePolideportivo;

public class Polideportivo extends Edificio{
    
    private String nombre;
    private boolean techada;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techada, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.techada = techada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechada() {
        return techada;
    }

    public void setTechada(boolean techada) {
        this.techada = techada;
    }
    
    @Override
    public void crearEdificio() {
        System.out.println("Nombre del Polideportivo: ");
        this.setNombre(scanner.next());
        String techo;
        do{
            System.out.println("Techada? (s/n): ");
            techo = scanner.next();
        } while(!(techo.equalsIgnoreCase("s") || techo.equalsIgnoreCase("n")));
        if(techo.equalsIgnoreCase("s")){
            this.setTechada(true);
        } else{
            this.setTechada(false);
        }
        super.crearEdificio();
    }
    
    @Override
    public double calcularSuperficie() {
        return super.getAncho() * super.getLargo();
    }

    @Override
    public double calcularVolumen() {
        return calcularSuperficie() * super.getAlto();
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", techada=" + techada + '}';
    }
}
