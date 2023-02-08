package main.entity;

import main.interfaces.CalculosFormas;

public class Rectangulo implements CalculosFormas {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "base = " + base + ", altura=" + altura;
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public double calcualarPerimetro() {
        return (getBase() + getAltura()) * 2;
    }
}
