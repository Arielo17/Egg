
package pooejerapren9;

import java.util.Random;
import pooejerapren9.entidades.Matematica;
import pooejerapren9.servicios.ServicioMatematica;


public class POOEjerApren9 {

    
    public static void main(String[] args) {
        
        Random rd = new Random();
        ServicioMatematica sm = new ServicioMatematica();
        Matematica mat = sm.crearNumeros();
        mat.setNum1(rd.nextDouble()*10);
        mat.setNum2(rd.nextDouble()*10);
        
        System.out.println(mat.getNum1());
        System.out.println(mat.getNum2()+"\n");
        System.out.println("El mayor es: "+sm.devolverMayor(mat));
        sm.calcularPotencia(mat);
        sm.calcularRaiz(mat);
    }
    
}
