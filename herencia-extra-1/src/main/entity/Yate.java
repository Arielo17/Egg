package main.entity;

public class Yate extends BarcoMotor {

    private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes, int potencia, String matricula, double eslora, int anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public void crearBarco() {

        super.crearBarco();
        System.out.print("\tIngrese la cantidad de camarotes: ");
        this.setCamarotes(scanner.nextInt());

    }
    
    @Override
    public double costoAlquiler(Barco barco) {
        return super.costoAlquiler(barco) + this.getCamarotes();
    }

    @Override
    public String toString() {
        return super.toString() + "\tCantidad de camarotes: " + camarotes;
    }

}
