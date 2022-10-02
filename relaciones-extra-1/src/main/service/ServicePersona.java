package main.service;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import main.entity.Perro;
import main.entity.Persona;

public class ServicePersona {

    private Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public ArrayList<Persona> crearListaPersonas() {
        ArrayList<Persona> personas = new ArrayList<>();
        String seguir = "s";
        do {
            System.out.println("Ingrese los datos de la persona...");
            personas.add(crearPersona());
            do {
                System.out.print("Desea ingresar otra persona? (s/n): ");
                seguir = scanner.next();
                System.out.println("");
            } while (!(seguir.equalsIgnoreCase("s") || seguir.equalsIgnoreCase("n")));

        } while (seguir.equalsIgnoreCase("s"));
        return personas;
    }

    public Persona crearPersona() {
        Persona persona = new Persona();

        System.out.print("Nombre: ");
        persona.setNombre(scanner.next());
        System.out.print("Apellido: ");
        persona.setApellido(scanner.next());
        System.out.print("Edad: ");
        persona.setEdad(scanner.nextInt());
        System.out.print("DNI: ");
        persona.setDocumento(scanner.nextDouble());

        return persona;
    }

    public void elegirPerro(ArrayList<Persona> listaPersonas, ArrayList<Perro> jauria) {
        
        int i = 0;
        while (jauria.size() > 0 && listaPersonas.size() > i) {
            

            System.out.println("\nLista de perros a elegir: ");
            for (Perro aux : jauria) {
                System.out.println(aux.toString());
            }
            boolean encontro = false;
            do {
                System.out.print("\n" + listaPersonas.get(i).getNombre() + " "
                        + listaPersonas.get(i).getApellido() + ", ingrese el nombre del perro que quisiera: ");
                String nombrePerro = scanner.next();

                for (int j = 0; j < jauria.size(); j++) {
                    if (jauria.get(j).getNombre().equalsIgnoreCase(nombrePerro)) {
                        listaPersonas.get(i).setPerro(jauria.get(j));
                        jauria.remove(j);
                        encontro = true;
                    }
                }
                if (!encontro) {
                    System.out.println("La mascota no se encuentra en la lista");
                }
            } while (!encontro);

            i++;
        }
        if(jauria.isEmpty()){
            System.out.println("\nNo quedan perros para elegir..!!");
        } else{
            System.out.println("\nNo quedan más personas en la lista :(");
        }
    }

    public void mostrarPersonaPerro(ArrayList<Persona> listaPersonas) {
        for (Persona aux : listaPersonas) {
            System.out.println(aux.toString() + "\n");
        }
    }
}
