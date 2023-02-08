package main.service;

import java.util.Locale;
import java.util.Scanner;
import main.entity.Cliente;

public class ServiceCliente {

    public Cliente crearCliente() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Cliente cliente = new Cliente();
        System.out.print("\tNombre: ");
        cliente.setNombre(scanner.next());
        System.out.print("\tDNI: ");
        cliente.setDocumento(scanner.nextInt());

        return cliente;
    }
}
