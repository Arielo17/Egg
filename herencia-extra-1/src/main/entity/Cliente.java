package main.entity;

public class Cliente {

    private String nombre;
    private int documento;

    public Cliente() {
    }

    public Cliente(String nombre, int documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return nombre + "\tDNI: " + documento;
    }
}
