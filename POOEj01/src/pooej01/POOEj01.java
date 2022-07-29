
package pooej01;

import Entidad.Persona;


public class POOEj01 {

    
    public static void main(String[] args) {
        
        Persona per1 = new Persona();
        
        //Persona per2 = new Persona("Ariel");
        
        per1.setNombre("Ariel");
        per1.setDni(31503569);
        per1.setEdad(37);
        System.out.println(per1.getNombre()+" con DNI "+per1.getDni()+" y edad de "+per1.getEdad()+" años");
    }
    
}
