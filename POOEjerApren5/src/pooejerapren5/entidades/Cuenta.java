
package pooejerapren5.entidades;

import java.util.Scanner;


public class Cuenta {
    
    Scanner sc = new Scanner(System.in);
    
    private int numCuenta = 0;
    private long dniCliente;
    private double saldoActual = 0;
    
    public Cuenta(){
        
    }
    
    public Cuenta(int numCuenta, long dniCliente, double saldoActual){
        this.numCuenta = numCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    public void setNumCuenta(int numCuenta){
        this.numCuenta = numCuenta;
    }
    
    public void setDniCliente(long dniCliente){
        this.dniCliente = dniCliente;
    }
    
    public void setSaldoActual(double saldoActual){
        this.saldoActual = saldoActual;
    }
    
    public int getNumCuenta(){
        return numCuenta;
    }
    
    public long getDniCliente(){
        return dniCliente;
    }
    
    public double getSaldoActual(){
        return saldoActual;
    }
    
    public void crearCuenta(){
        
        System.out.println("Ingrese su DNI para crear una cuenta: ");
        this.setDniCliente(sc.nextLong());
        numCuenta++;
    }
    
    public void ingresar(double ingreso){
        this.setSaldoActual(this.getSaldoActual()+ingreso);
    }
    
    public void retirar(double retiro){
        if (this.getSaldoActual()<retiro) {
            System.out.println("Su saldo es insificiente");
            System.out.println("Se debitara "+ this.getSaldoActual());
            this.setSaldoActual(0);
        } else{
            this.setSaldoActual(this.getSaldoActual()-retiro);
            System.out.println("Se debitó con exito");
        }
    }
    
    public void extraccionRapida(){
        System.out.println("Se le debitara el 20% de su saldo ("+ this.getSaldoActual()*0.2+")");
        this.setSaldoActual(this.getSaldoActual()*0.8);
    }
    
    public double consultarSaldo(){
        return this.getSaldoActual();
    }
    
    public void consultarDatos(){
        System.out.println("Número de cuenta: "+this.getNumCuenta());
        System.out.println("DNI cliente: "+this.getDniCliente());
        System.out.println("Saldo actual: "+this.getSaldoActual());
    }
}
