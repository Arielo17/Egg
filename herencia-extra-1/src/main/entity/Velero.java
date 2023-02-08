package main.entity;

public class Velero extends Barco {

    private int numeroMastiles;

    public Velero() {
    }

    public Velero(int numeroMastiles, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public void crearBarco() {

        super.crearBarco();
        System.out.print("Ingrese el número de mástiles: ");
        this.setNumeroMastiles(scanner.nextInt());

    }
    
    @Override
    public double costoAlquiler(Barco barco) {
        return super.costoAlquiler(barco) + this.getNumeroMastiles();
    }

    @Override
    public String toString() {
        return super.toString() + "\tNúmero de Mastiles: " + numeroMastiles;
    }

}
