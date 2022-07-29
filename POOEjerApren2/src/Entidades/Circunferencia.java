
package Entidades;

import java.util.Scanner;


public class Circunferencia {
    
    private double radio;
    
    public Circunferencia(double radio){
        this.radio = radio;
    }
    
    public Circunferencia(){
       
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void crearCircunferencia(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        radio = sc.nextDouble();
    }
    
    public double area(double radio){
        double area = Math.PI * radio * radio;
        return area;
    }
    
    public double perimetro(double radio){
        double perim = 2 * Math.PI * radio;
        return perim;
    }
}
