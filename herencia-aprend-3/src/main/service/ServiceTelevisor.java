package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Televisor;

public class ServiceTelevisor {

    public Televisor crearTelevisor() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        Televisor televisor = new Televisor();
        
        televisor.crearElectrodomestico();
        System.out.print("Pulgadas: ");
        televisor.setPulgadas(scanner.nextInt());
        System.out.print("TDT (true/false): ");
        televisor.setTdt(scanner.nextBoolean());
        System.out.println("\nCOLOR\tCONSUMO\tPESO\tPULGADAS\tTDT");
        System.out.println(this.toString());
        
        return televisor;
    }

    public double precioFinal(Televisor televisor) {
        double precioPulgadas = televisor.precioFinal(televisor);
        if (televisor.getPulgadas() > 40) {
            precioPulgadas *= 1.3;
        }
        double precioTdt = 0;
        if (televisor.isTdt()) {
            precioTdt = 500d;
        }
        
        return precioPulgadas + precioTdt;
    }
}
