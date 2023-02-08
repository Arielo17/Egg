package main.entity;

public class Televisor extends Electrodomestico {

    private int pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tdt, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + pulgadas + "\t" + tdt;
    }
}
