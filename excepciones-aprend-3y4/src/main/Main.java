package main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese dos números enteros:");
        String a = "", b = "";
        try {
            a = scanner.next();
            b = scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Los numeros ingresados son incorectos");
        }

        DivisionNumero divNum = new DivisionNumero(a, b);

        try {
            divNum.convertirCadena();
            try {
                System.out.printf("La división entre ambos numeros es: %.2f\n", divNum.division());
            } catch (ArithmeticException e) {
                e.getMessage();
            }
        } catch (NumberFormatException e) {
            e.getMessage();
        }
    }
}
