
package pooejerapren3.entidades;

import java.util.Scanner;


public class Operacion {
    
    private double numero1;
    private double numero2;
    
    public Operacion(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion(){
        
    }
    
    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }
    
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }
    
    public double getNumero1(){
        return numero1;
    }
    
    public double getNumero2(){
        return numero2;
    }
    
    public void crearOperacion(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del primer número: ");
        this.setNumero1(sc.nextDouble());
        System.out.print("Ingrese el valor del segundo número: ");
        this.setNumero2(sc.nextDouble());
    }
    
    public double sumar(){
        return this.getNumero1()+this.getNumero2();
    }
    
    public double restar(){
        return this.getNumero1()-this.getNumero2();
    }
    
    public double multiplicar(){
        if (this.getNumero1()==0 || this.getNumero2()==0){
            System.out.println("Error");
            return 0;
        } else{
            return this.getNumero1()*this.getNumero2();
        }    
    }
    
    public double dividir(){
        if (this.getNumero2()==0){
            System.out.println("Error");
            return 0;
        } else{
            return this.getNumero1()/this.getNumero2();
        }    
    }
}
