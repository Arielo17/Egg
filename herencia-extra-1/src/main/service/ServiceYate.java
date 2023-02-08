package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Yate;

public final class ServiceYate {
    
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Yate crearYate() {
        Yate yate = new Yate();
        
        yate.crearBarco();
        
        return yate;
    }
}
