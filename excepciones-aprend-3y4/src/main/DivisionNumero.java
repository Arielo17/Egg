package main;

public class DivisionNumero {
    private String num1;
    private String num2;
    private int a;
    private int b;

    public DivisionNumero() {
    }

    public DivisionNumero(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }
    
    public void convertirCadena() throws NumberFormatException {
        try{
            this.a = Integer.parseInt(this.getNum1());
            this.b = Integer.parseInt(this.getNum2());
        } catch (NumberFormatException e){
            System.out.println("El/Los número/s no se puede/n convertir a entero");
        }
    }

    public double division() throws ArithmeticException {
        try {
            return this.a / this.b;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0!");
            return -1;
        }
    }
    
    @Override
    public String toString() {
        return "DivisionNumero{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
}
