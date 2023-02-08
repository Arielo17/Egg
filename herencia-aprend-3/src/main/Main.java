package main;

import java.util.ArrayList;
import main.entity.Electrodomestico;
import main.entity.Lavadora;
import main.entity.Televisor;
import main.service.ServiceLavadora;
import main.service.ServiceTelevisor;

public class Main {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>(4);

        electrodomesticos.add(new Lavadora(30, 0d, "Blanco", 'B', 75d));
        electrodomesticos.add(new Televisor(32, true, 0d, "Azul", 'A', 45d));
        electrodomesticos.add(new Lavadora(35, 0d, "Amarillo", 'A', 85d));
        electrodomesticos.add(new Televisor(50, false, 0d, "Negro", 'C', 40d));

        double precioTodasLavadoras = 0d;
        double precioTodosTelevisores = 0d;
        for (Electrodomestico aux : electrodomesticos) {
            if (aux instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) aux;
                ServiceLavadora servicioLavadora = new ServiceLavadora();
                double precioLavadora = servicioLavadora.precioFinal(lavadora);

                System.out.println("El precio de la Lavadora de color " + lavadora.getColor() + " es: " + precioLavadora);
                precioTodasLavadoras += precioLavadora;
            }
            if (aux instanceof Televisor) {
                Televisor televisor = (Televisor) aux;
                ServiceTelevisor servicioTelevisor = new ServiceTelevisor();
                double precioTelevisor = servicioTelevisor.precioFinal(televisor);
                System.out.println("El precio del Televisor de color " + televisor.getColor() + " es: " + precioTelevisor);
                precioTodosTelevisores += precioTelevisor;
            }
        }
        System.out.println("\nEl precio de las lavadoras es: " + precioTodasLavadoras);
        System.out.println("\nEl precio de los televisores es: " + precioTodosTelevisores);
        System.out.println("\nEl precio de todos los electrodomesticos es: " + (precioTodasLavadoras + precioTodosTelevisores));

    }
}
