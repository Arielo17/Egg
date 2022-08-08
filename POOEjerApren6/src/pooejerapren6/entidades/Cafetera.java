
package pooejerapren6.entidades;

import java.util.Scanner;

public class Cafetera {
    private int capacidadMaxima = 1000;
    private int cantidadActual;
    
    Scanner sc  = new Scanner(System.in);
    
    public Cafetera(){
    
    }
    
    public Cafetera(int capacidadMaxima, int cantidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public void setCantidadActual(int cantidadActual){
        this.cantidadActual = cantidadActual;
    }
    
    public int getCapacidadMaxima(){
        return this.capacidadMaxima;
    }
    
    public int getCantidadActual(){
        return this.cantidadActual;
    }
    
     public void llenarCafetera(){
        this.setCantidadActual(this.getCapacidadMaxima());
         System.out.println("Cafetera llena");
    }
    
    public void servirTaza(int taza){
        if (this.getCantidadActual()< taza){
            System.out.println("La taza no se llenó. Ingresaron "+this.getCantidadActual()+"cc de café");
            this.setCantidadActual(0);
        } else{
            this.setCantidadActual(this.getCantidadActual()-taza);
            System.out.println("Se llenó la taza. Quedaron "+this.getCantidadActual()+"cc de café");
        }
    }
    
    public void vaciarCafetera(){
        this.setCantidadActual(0);
        System.out.println("Cafetera vacía");
    }
    
    public void agregarCafe(int cantidad){
        while ((this.getCantidadActual()+cantidad)>this.getCapacidadMaxima()) {
            System.out.print("La cantidad de café es mayor al recipiente.\nIngrese otro valor (cc): ");
            cantidad = sc.nextInt();
        }
        this.setCantidadActual(this.getCantidadActual()+cantidad);
        System.out.println("Ahora tiene "+this.getCantidadActual()+"cc de café");
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
}
