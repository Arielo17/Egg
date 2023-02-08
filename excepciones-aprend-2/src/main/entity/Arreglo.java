package main.entity;

import java.util.Locale;
import java.util.Scanner;

public class Arreglo {
    private String[] nombres;

    public Arreglo() {
    }

    public Arreglo(String[] nombres) {
        this.nombres = nombres;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
    
    public void llenarNombres() throws ArrayIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        String[] nombres = new String[3];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres[i] = scanner.next();
        }
        this.setNombres(nombres);
    }

    @Override
    public String toString() {
        return "Arreglo{" + "nombres=" + nombres + '}';
    }
}
