package main.entity;

public class BarcoMotor extends Barco {

    protected int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void crearBarco() {

        super.crearBarco();
        System.out.print("\tIngrese la potencia del motor: ");
        this.setPotencia(scanner.nextInt());

    }
    
    @Override
    public double costoAlquiler(Barco barco) {
        return super.costoAlquiler(barco) + this.getPotencia();
    }

    @Override
    public String toString() {
        return super.toString() + "\tPotencia Motor: " + potencia;
    }

}
