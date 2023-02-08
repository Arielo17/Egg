package main.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;;
import java.util.Locale;
import java.util.Scanner;
import main.service.ServiceCliente;
import main.service.ServiceVelero;
import main.service.ServiceYate;

public class Alquiler {

    private Cliente cliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Alquiler() {

    }

    public Alquiler(Cliente cliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {

        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    /**
     * Creamos el alquiler de un barco en particular
     *
     * @return alquiler
     */
    public Alquiler crearAlquiler() {

        Alquiler alquiler = new Alquiler();
        System.out.println("--- INGRESO DE ALQUILER ---");

        // Creamos un Cliente
        ServiceCliente servicioCliente = new ServiceCliente();
        System.out.println("Datos del cliente: ");
        alquiler.setCliente(servicioCliente.crearCliente());

        // Pedimos día salida, día devolución y la posición de amarre
        alquiler.setFechaAlquiler(fechaAlquiler());
        alquiler.setFechaDevolucion(fechaDevolucion());
        System.out.print("Posicion de amarre: ");
        alquiler.setPosicionAmarre(scanner.nextInt());

        // Creamos el Barco que se alquiló en el método barcoAlquilado()
        alquiler.setBarco(barcoAlquilado());

        return alquiler;
    }

    /**
     * Ingresamos los datos de la fecha en que se comenzó a alquilar el barco
     *
     * @return diaAlquiler
     */
    private LocalDate fechaAlquiler() {

        System.out.println("Fecha de alquiler:");
        System.out.print("\tDia: ");
        int dia = scanner.nextInt();
        System.out.print("\tMes: ");
        int mes = scanner.nextInt();
        System.out.print("\tAño: ");
        int anio = scanner.nextInt();

        LocalDate diaAlquiler =LocalDate.of(anio, mes, dia);
        return diaAlquiler;
    }

    /**
     * Ingresamos los datos de la fecha en que se devolvió el barco
     *
     * @return diaDevolucion
     */
    private LocalDate fechaDevolucion() {

        System.out.println("Fecha de devolución:");
        System.out.print("\tDia: ");
        int dia = scanner.nextInt();
        System.out.print("\tMes: ");
        int mes = scanner.nextInt();
        System.out.print("\tAño: ");
        int anio = scanner.nextInt();

        LocalDate diaDevolucion = LocalDate.of(anio, mes, dia);
        return diaDevolucion;
    }

    /**
     *
     * @return
     */
    private Barco barcoAlquilado() {

        int opcion;
        do {
            System.out.println("\nElija la opción del barco alquilado");
            System.out.println("1. Barco sin motor ni velas");
            System.out.println("2. Barco a vela");
            System.out.println("3. Barco con motor");
            System.out.println("4. Yate");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 4);
        
        switch (opcion) {
            case 1:
                Barco barcoAlq = new Barco();
                barcoAlq.crearBarco();
                return barcoAlq;
            case 2:
                ServiceVelero servicioVelero = new ServiceVelero();
                Velero velero = servicioVelero.crearVelero();
                return velero;
            case 3:
                BarcoMotor barcoMotor = new BarcoMotor();
                barcoMotor.crearBarco();
                return barcoMotor;
            case 4:
                ServiceYate servicioYate = new ServiceYate();
                Yate yate = servicioYate.crearYate();
                return yate;
        }
        return null;
    }
    
    public double costoAlquiler(Barco barco) {
        if(barco instanceof Barco){
            return diasAlquilado(this.getFechaAlquiler(), this.getFechaDevolucion()) * barco.costoAlquiler(barco);
        }else if(barco instanceof Velero){
            Velero velero = (Velero) barco;
            return diasAlquilado(this.getFechaAlquiler(), this.getFechaDevolucion()) * velero.costoAlquiler(barco);
        }else if(barco instanceof BarcoMotor){
            BarcoMotor barcoMotor = (BarcoMotor) barco;
            return diasAlquilado(this.getFechaAlquiler(), this.getFechaDevolucion()) * barcoMotor.costoAlquiler(barco);
        }else if(barco instanceof Yate){
            Yate yate = (Yate) barco;
            return diasAlquilado(this.getFechaAlquiler(), this.getFechaDevolucion()) * yate.costoAlquiler(barco);
        }
        return 0;
    }

    private long diasAlquilado(LocalDate diaInicio, LocalDate diaFin) {
        return ChronoUnit.DAYS.between(diaInicio, diaFin);
    }
    
    @Override
    public String toString() {
        return "\nCliente: " + cliente.toString() + "\n\tFecha de Alquiler: " + fechaAlquiler.toString()
                + "\n\tFecha de Devolucion: " + fechaDevolucion.toString() + "\n\tPosicion de Amarre: " + posicionAmarre
                + "\n\tBarco: \n\t\t" + barco.toString();

    }

    
}
