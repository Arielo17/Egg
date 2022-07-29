
package Servicio;

import Entidad.Persona;
import java.util.Scanner;


public class PersonaService {
    
    public Persona crearPersona(){
        
        Scanner leer = new Scanner(System.in);
        Persona ps = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        ps.setNombre(leer.next());
        return ps;
    }
    
}
