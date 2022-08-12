
package principal.entidades;

public class Raiz {
    
    private double a, b, c;

    public Raiz() {
    }

    public Raiz(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Raiz{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
}
