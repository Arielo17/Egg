package main.entity;

import main.interfaces.CalculosFormas;

public class Circulo implements CalculosFormas {
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "radio = " + radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(getRadio(), 2);
    }

    @Override
    public double calcualarPerimetro() {
        return PI * 2 * getRadio();
    }
}
