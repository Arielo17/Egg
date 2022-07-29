
package pooejerapren2.entidades;


public class Circunferencia {
    
    private double radio;
    
    public Circunferencia(){
       
    }
    
    public Circunferencia(double radio){
        this.radio = radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}
