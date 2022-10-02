package main.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Baraja {
    
    private ArrayList<Carta> cartas;
    
    private int cartasDadas;
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Baraja() {
        this.cartas = new ArrayList<Carta>(40);
        String[] palos = {"E", "B", "C", "O"};
        for (String aux : palos){
            for (int i = 1; i < 13; i++) {
                if (i!=8 && i!=9) {
                    Carta carta = new Carta(i, aux);
                    this.cartas.add(carta);
                }
            }
        }
        this.cartasDadas = 0;
    }
    
    public void barajar(){
        Collections.shuffle(cartas);
    }
    
    public void siguienteCarta(){
        if(cartasDadas<40){
            System.out.print(cartas.get(cartasDadas).toString() + "\t");
            cartasDadas++;
        } else{
            System.out.println("No hay más cartas...!");
        }
    }
    
    public void cartasDisponibles(){
        System.out.println("\nQuedan " + (40 - cartasDadas) + " cartas");
    }
    
    public void darCartas(){
        int cartasPedidas; 
        do{
            System.out.print("\nIngrese la cantidad de cartas a pedir: ");
            cartasPedidas = scanner.nextInt();
        }while(cartasPedidas<1 || cartasPedidas>40);
        if(cartasPedidas<(40 - cartasDadas)){
            for (int i = 0; i < cartasPedidas; i++) {
                siguienteCarta();
            }
        }else{
            System.out.println("La cantidad de cartas pedidas es mayor a las que hay en la baraja");
        }
    }
    
    public void cartasMonton(){
        if(cartasDadas>0){
            System.out.println("\nLas cartas que salieron son: ");
            for (int i = 0; i < cartasDadas; i++) {
                System.out.print(cartas.get(i).toString() + "\t");
                if(i%10 == 9){
                    System.out.println("");
                }
            }
        } else{
            System.out.println("\nAún no ha salido ninguna carta");
        }
    } 
    
    public void mostrarBaraja(){
        System.out.println("\nLas cartas que quedan en la baraja son: ");
        for (int i = cartasDadas; i < cartas.size(); i++) {
            System.out.print(cartas.get(i).toString() + "\t");
            if(i%10 == 9){
                System.out.println("");
            }
        }
    }
}
