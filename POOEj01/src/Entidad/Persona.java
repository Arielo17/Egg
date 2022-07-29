
package Entidad;


public class Persona {
    
    public String nombre;
    public int dni;
    public int edad;

    public Persona() {
    }
    
    /*public Persona(String nombre){
        this.nombre = nombre;
    }*/
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getDni(){
        return dni;
    }
    
    public int getEdad(){
        return edad;
    }
}
