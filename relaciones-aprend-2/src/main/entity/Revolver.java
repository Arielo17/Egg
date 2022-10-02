package main.entity;

public class Revolver {
    
    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver(){
        this.posicionActual = (int)(Math.random() * 6 + 1); 
        this.posicionAgua = (int)(Math.random() * 6 + 1);
        toString();
    }
    
    public boolean mojar(){
        if(this.posicionActual == this.posicionAgua){
            return true;
        }
        return false;
    }
    
    public void siguienteChorro(){
        if(this.posicionActual == 6){
            this.posicionActual = 1;
        } else{
            this.posicionActual ++;
        }
    }

    @Override
    public String toString() {
        return "Revolver\n\tPosicion Actual= " + posicionActual + "\n\tPosicion Agua= " + posicionAgua;
    }
}
