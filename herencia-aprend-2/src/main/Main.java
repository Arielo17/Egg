package main;

import main.entity.Electrodomestico;
import main.entity.Lavadora;
import main.entity.Televisor;

public class Main {
    
    public static void main(String[] args) {
        
        Electrodomestico lavadora = new Lavadora();
        lavadora.crearElectrodomestico();
        lavadora.precioFinal();
        
        Televisor tv = new Televisor();
        tv.craerTelevisor();
        tv.precioFinal();
    }
}
