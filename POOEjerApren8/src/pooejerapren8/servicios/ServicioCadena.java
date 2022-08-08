
package pooejerapren8.servicios;

import java.util.Scanner;
import pooejerapren8.entidades.Cadena;


public class ServicioCadena {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena() {
        Cadena cad = new Cadena();
        return cad;
    }
    
    public int contarVocales(Cadena cad){
        int cont = 0;
        for (int i = 0; i < cad.getLongFrase(); i++) {
            char letra = cad.getFrase().toLowerCase().charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                cont++;
            }
        }
        return cont;
    }
    
    public void invertirFrase(Cadena cad){
        for (int i = 0; i < cad.getLongFrase(); i++) {
            System.out.print(cad.getFrase().substring(cad.getLongFrase()-1-i,cad.getLongFrase()-i));
        }
        System.out.println("");
    }
    
    public int vecesRepetido(Cadena cad, String letra){
        int veces = 0;
        for (int i = 0; i < cad.getLongFrase(); i++) {
            if (cad.getFrase().toLowerCase().charAt(i) == letra.toLowerCase().charAt(0)){
                veces++;
            }
        }
        return veces;
    }
    
    public void compararLongitud(Cadena cad, String frase){
        if (cad.getLongFrase()>frase.length()) {
            System.out.println("La cadena ingresada es mas corta que la original");
        } else if (cad.getLongFrase()<frase.length()){
            System.out.println("Lacadena ingresada es mas larga que la original");
        } else{
            System.out.println("Ambas cadenas tienen la misma longitud");
        }
    }
    
    public void unirFrase(Cadena cad, String frase){
        String conf;
        do {
            System.out.println("Desea dejar un espacio? (s/n): ");
            conf = sc.nextLine();
        } while (!(conf.equalsIgnoreCase("s") || conf.equalsIgnoreCase("n")));
        if (conf.equalsIgnoreCase("s")){
            System.out.println((cad.getFrase().concat(" ")).concat(frase));
        } else{
            System.out.println(cad.getFrase().concat(frase));
        }
    }
    
    public void reemplazar(Cadena cad, String letra){
        System.out.println(cad.getFrase().replace('a', letra.charAt(0)));
    }
    
    public boolean contiene(Cadena cad, String letra){
        return cad.getFrase().contains(letra);
    }
}
