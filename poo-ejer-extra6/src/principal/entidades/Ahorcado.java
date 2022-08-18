
package principal.entidades;


public class Ahorcado {
    
    private String[] palabra;
    private char[] palabraEncontrada;
    private int letrasEncontradas = 0;
    private int jugadas = 8;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, char[] palabraEncontrada) {
        this.palabra = palabra;
        this.palabraEncontrada = palabraEncontrada;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setPalabraEncontrada(char[] palabraEncontrada) {
        this.palabraEncontrada = palabraEncontrada;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public char[] getPalabraEncontrada() {
        return palabraEncontrada;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", palabraEncontrada=" + palabraEncontrada + ", letrasEncontradas=" + letrasEncontradas + ", jugadas=" + jugadas + '}';
    }

}
