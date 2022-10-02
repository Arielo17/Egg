package main.service;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import main.entity.Perro;

public class ServicePerro {

    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public ArrayList<Perro> crearJauria() {
        ArrayList<Perro> jauria = new ArrayList<>();
        String seguir = "s";
        do {
            System.out.println("Ingrese los datos del perro...");
            jauria.add(crearPerro());
            do {
                System.out.print("Desea ingresar otro perro? (s/n): ");
                seguir = scanner.next();
                System.out.println("");
            } while (!(seguir.equalsIgnoreCase("s") || seguir.equalsIgnoreCase("n")));
            
        } while (seguir.equalsIgnoreCase("s"));
        return jauria;
    }

    public Perro crearPerro() {
        Perro perro = new Perro();

        System.out.print("Nombre: ");
        perro.setNombre(scanner.next());
        System.out.print("Raza: ");
        perro.setRaza(scanner.next());
        System.out.print("Edad: ");
        perro.setEdad(scanner.nextInt());
        System.out.print("Tamaño: ");
        perro.setTamaño(scanner.next());

        return perro;
    }

}
