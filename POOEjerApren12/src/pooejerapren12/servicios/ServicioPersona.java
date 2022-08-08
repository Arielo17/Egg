
package pooejerapren12.servicios;

import java.util.Date;
import java.util.Scanner;
import pooejerapren12.entidades.Persona;

public class ServicioPersona {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.print("Ingrese el nombre de la persona: ");
        String nom = sc.nextLine();
        
        int dia,mes,anio;
        do {
            System.out.print("Ingrese un dia: ");
            dia = sc.nextInt();
        } while (dia<1 || dia>31);
        do {
            System.out.print("Ingrese un mes: ");
            mes = sc.nextInt();
        } while (mes<1 || mes>12);
        do {
            System.out.print("Ingrese el año: ");
            anio = sc.nextInt();
        } while (anio<0 || anio>9999);
        Date fecha = new Date(anio-1900,mes-1,dia);
        
        Persona per = new Persona(nom, fecha);
        return per;
    }
    
    public int calcularEdad(Persona per){
        Date fechaActual = new Date();
        return fechaActual.getYear()-per.getFechaNacimiento().getYear();
    }
    
    public boolean menorQue(Persona per, int edad){
        if (calcularEdad(per)>edad){
            return true;
        }
        return false;
    }
    
    public void mostrarPersona(Persona per){
        System.out.println(per.toString());
    }
}
