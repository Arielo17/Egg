
package main.servicios;

import java.util.Scanner;
import main.entidades.Persona;


public class ServicioPersona {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        String sexo;
        do {
            System.out.print("Sexo (h: hombre - m: mujer - o: otro): ");
            sexo = sc.nextLine();
        } while (!(sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("o")));
        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();
        Persona per = new Persona(nombre, edad, sexo, peso, altura);
        return per;
    }
    
    public int calcularIMC(Persona per){
        double imc = per.getPeso()/Math.pow(per.getAltura(), 2);
        if (imc<20){
            return -1;
        } else if (imc<=25){
            return 0;
        } else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(Persona per){
        if (per.getEdad()<18){
            return false;
        } else{
            return true;
        }
    }
}
