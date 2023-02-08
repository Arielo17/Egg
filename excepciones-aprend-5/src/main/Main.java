package main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    
    private final static Scanner SCANNER = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public static void main(String[] args) {
        int cantidadIntentos = 0;
        int numIngresado;
        try {
            int numAleatorio = (int) (Math.random() * 500) + 1;
            do {            
                cantidadIntentos++;
                numIngresado = preguntarNumero(numAleatorio);

            } while (numIngresado != numAleatorio);

        } catch (InputMismatchException ime){
            ime.getMessage();
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println("Intentos realizados: " + cantidadIntentos);
        }
    }

    private static int preguntarNumero(int numAleatorio) throws InputMismatchException {
        int num;
        try {
            System.out.print("Ingrese un número entero a adivinar entre 0 y 500: ");
            num = SCANNER.nextInt();
            if (num == numAleatorio) {
                System.out.println("Ha adivinado!!");
            } else if (num > numAleatorio) {
                System.out.println("El número es menor");
            } else {
                System.out.println("El número es mayor");
            }
            return num;
        } catch (InputMismatchException ime) {
            System.out.println("No ha ingresado un entero!");
            SCANNER.nextLine();
            return 0;
        }
    }
}
