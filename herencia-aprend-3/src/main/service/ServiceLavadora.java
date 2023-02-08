package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Lavadora;

public final class ServiceLavadora {

    public Lavadora crearLavadora() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Lavadora lavadora = new Lavadora();
        lavadora.crearElectrodomestico();
        System.out.print("Carga: ");
        lavadora.setCarga(scanner.nextInt());
        System.out.println("\nCOLOR\tCONSUMO\tPESO\tCARGA");
        System.out.println(lavadora.toString());

        return lavadora;
    }

    public double precioFinal(Lavadora lavadora) {
        double precioElectro = lavadora.precioFinal(lavadora);
        double precioCarga = 0;
        if (lavadora.getCarga() > 30) {
            precioCarga = 500d;
        }
        return precioElectro + precioCarga;
    }
}
