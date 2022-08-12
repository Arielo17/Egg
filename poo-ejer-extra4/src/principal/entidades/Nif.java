
package principal.entidades;


public class Nif {
    
    private long dni;
    private char letra;

    public Nif() {
    }

    public Nif(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public char getLetra() {
        return letra;
    }

    @Override
    public String toString() {
        return "Nif{" + "dni=" + dni + ", letra=" + letra + '}';
    }
    
    
    
}
