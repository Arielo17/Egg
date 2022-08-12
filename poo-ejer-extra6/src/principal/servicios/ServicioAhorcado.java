
package principal.servicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import principal.entidades.Ahorcado;


public class ServicioAhorcado {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego(){
       
        String pal = seleccionarPalabra();
        String[] palabra = new String[pal.length()];
        for (int i = 0; i < pal.length(); i++) {
            palabra[i] = pal.substring(i, i+1);
        }
        char[] palabraEncontrada = new char[pal.length()];
        Arrays.fill(palabraEncontrada, '_');
        Ahorcado ahor = new Ahorcado(palabra, palabraEncontrada);
        return ahor;
    }
    
    public String seleccionarPalabra(){
        String[] palabra = {"pizza","misil","amnesia","lavarropa","muchacho",
                            "numero","recolector","esqueleto","pariente",
                            "octubre","piloto","leyenda","diputados",
                            "espaguetis","casarse","estreno","enchufe","abuelo",
                            "discoteca","bostezar","sofocar"};
   
        Random rd = new Random();
        return palabra[ThreadLocalRandom.current().nextInt(21)];
    }
    
    public void buscarLetra(Ahorcado ahor, char letra){
        boolean encontro = false;
        for (int i = 0; i < ahor.getPalabra().length; i++) {
            if (ahor.getPalabra()[i].charAt(0)==letra){
                Arrays.fill(ahor.getPalabraEncontrada(), i, i+1, letra);
                encontro = true;
                ahor.setLetrasEncontradas(ahor.getLetrasEncontradas()+1);
            }
        }
        mostrarEncontradas(ahor.getPalabraEncontrada());
        encontroLetra(ahor, encontro);
    }
    
    public void mostrarEncontradas(char[] encontradas){
        for (int i = 0; i < encontradas.length; i++) {
            System.out.print(Character.toUpperCase(encontradas[i])+ " ");
        }
        System.out.println("\n");
    }
    
    public void encontroLetra(Ahorcado ahor, boolean encontro){
        if (!encontro){
            System.out.println("La letra no se encuentra");
            ahor.setJugadas(ahor.getJugadas()-1);
        }
    }
    
    public void juego(Ahorcado ahor){
        System.out.println("La palabra tiene " + ahor.getPalabra().length + " letras");
        String salieron = "";
        do {
            System.out.println("Tiene "+ ahor.getJugadas()+ " oportunidades");
            char letra;
            do {
                System.out.print("Ingrese una letra a buscar: ");
                letra = sc.next().charAt(0);
            } while (letra == ' ');
            salieron = salieron + letra + "-";
            System.out.println("Letras dichas: " + salieron.toUpperCase());
            buscarLetra(ahor, letra);
            
        } while (ahor.getJugadas()>0 && ahor.getLetrasEncontradas()<ahor.getPalabra().length);
        if (ahor.getLetrasEncontradas() == ahor.getPalabra().length){
            System.out.println("HAS GANADO!!!");
        } else{
            System.out.println("HA PERDIDO!!");
            System.out.print("La palabra era: "); 
            for(int i=0; i<ahor.getPalabra().length; i++){
                System.out.print(ahor.getPalabra()[i].toUpperCase());
            }
            System.out.println("");
        } 
    }
}    
