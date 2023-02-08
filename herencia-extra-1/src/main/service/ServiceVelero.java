package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Velero;

public final class ServiceVelero {

    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Velero crearVelero() {
        Velero velero = new Velero();
        velero.crearBarco();
        return velero;
    }

}
