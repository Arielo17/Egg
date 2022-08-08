
package pooejerapren7;

import pooejerapren7.entidades.Persona;
import pooejerapren7.servicios.ServicioPersona;


public class POOEjerApren7 {

    
    public static void main(String[] args) {
        
        ServicioPersona[] sp = new ServicioPersona[4];
        
        int abajoPeso = 0;
        int bienPeso = 0;
        int arribaPeso = 0;
        int mayEdad = 0;
        for (int i = 0; i < 4; i++) {
            
            sp[i] = new ServicioPersona();
            Persona per = sp[i].crearPersona();
            switch (sp[i].calcularIMC(per)) {
                case -1:
                    System.out.println(per.getNombre()+" esta por debajo de su peso ideal");
                    abajoPeso++;
                    break;
                case 0:
                    System.out.println(per.getNombre()+" esta en su peso ideal");
                    bienPeso++;
                    break;
                case 1:
                    System.out.println(per.getNombre()+" esta por arriba de su peso ideal");
                    arribaPeso++;
                    break;
            }
            if(sp[i].esMayorDeEdad(per)){
                System.out.println(per.getNombre()+ " es mayor de edad");
                mayEdad++;
            } else{
                System.out.println(per.getNombre()+ " es menor de edad");
            }
        }
        System.out.println((abajoPeso)*25+"% se encuentran abajo de su peso ideal");
        System.out.println((bienPeso)*25+"% se encuentran en su peso ideal");
        System.out.println((arribaPeso)*25+"% se encuentran arriba de su peso ideal");
        System.out.println("\n"+mayEdad*25+"% son mayores de edad");
        System.out.println((4-mayEdad)*25+"% son menores de edad");
    }
    
}
