package main;

import main.entity.Circulo;
import main.entity.Rectangulo;
import main.service.ServiceCirculo;
import main.service.ServiceRectangulo;

public class Main {
    
    public static void main(String[] args) {
        
        ServiceCirculo servicioCirculo = new ServiceCirculo();
        Circulo circulo = servicioCirculo.crearCirculo();
        servicioCirculo.mostrarPerimetro(circulo);
        servicioCirculo.mostrarArea(circulo);
        
        ServiceRectangulo servicioRectangulo = new ServiceRectangulo();
        Rectangulo rectangulo = servicioRectangulo.crearRectangulo();
        servicioRectangulo.mostrarPerimetro(rectangulo);
        servicioRectangulo.mostrarArea(rectangulo);
    }
}
