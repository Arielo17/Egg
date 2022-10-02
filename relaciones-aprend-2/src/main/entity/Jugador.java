package main.entity;

public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.nombre = "Jugador " + String.valueOf(id);
    }
    
    public boolean disparo(Revolver r){
        boolean mojar = r.mojar();
        r.siguienteChorro();
        if(mojar){
            this.mojado = false;
            return true;
        }
        return false;
    }
}
