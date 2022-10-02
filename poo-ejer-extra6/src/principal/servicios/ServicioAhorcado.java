/**
 * Juego de ahorcado, mostrando letras que se dicen, letras que van saliendo
 * y el dibujo del ahorcado
 */
package principal.servicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import principal.entidades.Ahorcado;


public class ServicioAhorcado {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    /**
     * creo un array de string para guardar la palabra seleccionada
     * ademas, creo otro array que ira mostrando las letras que acierta
     * luego envio los parametros al constructor
     * 
     * @return ahor de tipo Ahorcado
     */
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
    
    /**
     * creo un array de palabras que se iran seleccionando con Random para
     * ser enviadas a la funcion crearJuego()
     * 
     * @return palabra[i] -> donde i es elegido aleatoriamente
     */
    public String seleccionarPalabra(){
        String[] palabra = {"pizza","misil","amnesia","lavarropa","muchacho",
                            "numero","recolector","esqueleto","pariente",
                            "octubre","piloto","leyenda","diputados",
                            "espaguetis","casarse","estreno","enchufe","abuelo",
                            "discoteca","bostezar","sofocar"};
   
        Random rd = new Random();
        return palabra[ThreadLocalRandom.current().nextInt(21)];
    }
    
    /**
     * buscamos si la letra ingresada por el usuario se encuentra en la palabra
     * incógnita, si es asi asigna la letra al lugar correspondiente
     * luego ejecuta las funciones mostrarEncontradas() y encontroLetra()
     * 
     * @param ahor -> ahorcado creado en crearJuego()
     * @param letra -> letra que va ingresando el jugador
     */
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
    
    /**
     * mostramos las letras que se van encontrando en la palabra incógnito
     * 
     * @param encontradas 
     */
    public void mostrarEncontradas(char[] encontradas){
        for (int i = 0; i < encontradas.length; i++) {
            System.out.print(Character.toUpperCase(encontradas[i])+ " ");
        }
        System.out.println("\n");
    }
    
    /**
     * en el caso de la letra no se encuentre, escribimos un mensaje y
     * restamos una oportunidad a la cantidad de jugadas
     * a
     * @param ahor
     * @param encontro 
     */
    public void encontroLetra(Ahorcado ahor, boolean encontro){
        if (!encontro){
            System.out.println("La letra no se encuentra");
            ahor.setJugadas(ahor.getJugadas()-1);
        }
    }
    
    public void juego(Ahorcado ahor){
        System.out.println("La palabra tiene " + ahor.getPalabra().length + " letras");
        String salieron = "";
        boolean letraRepetida;
        char[][] dibujo = new char[15][11];
        do {
            letraRepetida = false;
            System.out.println("Tiene "+ ahor.getJugadas()+ " oportunidades");
            dibujoAhorcado(ahor,dibujo);
            char letra;
            do {
                
                System.out.print("Ingrese una letra a buscar: ");
                letra = sc.next().charAt(0);
                for (int i = 0; i < salieron.length(); i++) {
                    if (letra == salieron.charAt(i)){
                        letraRepetida = true;
                        System.out.println("La letra se encuentra repetida\nPerdió una oportunidad\n");
                        ahor.setJugadas(ahor.getJugadas()-1);
                    }
                }
            } while (letra == ' ');
            if (!letraRepetida){
                salieron = salieron + letra + "-";
                System.out.println("Letras dichas: " + salieron.toUpperCase());
                buscarLetra(ahor, letra);
            }
           
        } while (ahor.getJugadas()>0 && ahor.getLetrasEncontradas()<ahor.getPalabra().length || letraRepetida);
        if (ahor.getLetrasEncontradas() == ahor.getPalabra().length){
            System.out.println("HAS GANADO!!!");
        } else{
            dibujoAhorcado(ahor,dibujo);
            System.out.println("HA PERDIDO!!");
            System.out.print("La palabra era: "); 
            for(int i=0; i<ahor.getPalabra().length; i++){
                System.out.print(ahor.getPalabra()[i].toUpperCase());
            }
            System.out.println("");
        } 
    }
    
    public void dibujoAhorcado(Ahorcado ahor, char[][] dibujo){
        
        switch (ahor.getJugadas()) {
            case 8:
                for(char[] row : dibujo){
                Arrays.fill(row, ' ');
                }
                for (int i = 0; i < 15; i++) {
                    if (i<14){
                        dibujo[i][1] = '|';
                    }
                    if(i<11){
                        dibujo[14][i] = '¯';
                    }
                    if(i>1 && i<6 ){
                       dibujo[0][i] = '¯'; 
                    }
                    if(i<2){
                        dibujo[i][6] = '|';
                    }
                }
                break;
            case 7:
                for (int i = 2; i < 9; i++) {
                    if(i>4 && i<8){
                        dibujo[2][i] = '¯';
                        dibujo[6][i] = '_';
                    }
                    if(i>2 && i<6){
                        dibujo[i][4] = '|';
                        dibujo[i][8] = '|';
                    }
                    dibujo[2][4] = '/';
                    dibujo[2][8] = '\\';
                    dibujo[6][4] = '\\';
                    dibujo[6][8] = '/';
                }
                break;
            case 6:
                for (int i = 7; i < 12; i++) {
                    dibujo[i][6] = '|';
                }
                break;
            case 5: 
                dibujo[9][7] = '\\';
                dibujo[10][8]= '\\';
                break;
            case 4:
                dibujo[9][5] = '/';
                dibujo[10][4]= '/';
                break;
            case 3:
                dibujo[12][7] = '\\';
                dibujo[13][8]= '\\';
                break;
            case 2:
                dibujo[12][5] = '/';
                dibujo[13][4]= '/';
                break;
            case 1:
                dibujo[3][5] = 'º';
                dibujo[3][7] = 'º';
                dibujo[4][6] = 'º';
                dibujo[5][6] = '~';
                break;
            case 0:
                dibujo[3][5] = 'x';
                dibujo[3][7] = 'x';
                dibujo[5][6] = '¬';
                dibujo[14][3] = '\\';
                dibujo[14][9] = '/';
                for (int i = 4; i < 9; i++) {
                    dibujo[14][i] = ' ';
                }
                break;
        }
        
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(dibujo[i][j]);
            }
            System.out.println("");
        }
    }
}    
