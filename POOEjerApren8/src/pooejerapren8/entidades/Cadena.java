
package pooejerapren8.entidades;


public class Cadena {
    private String frase;
    private int longFrase;

    public Cadena() {
    }

    public Cadena(String frase, int longFrase) {
        this.frase = frase;
        this.longFrase = longFrase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongFrase() {
        return longFrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longFrase=" + longFrase + '}';
    }
    
}
