
package pooejerapren9.servicios;

import pooejerapren9.entidades.Matematica;


public class ServicioMatematica {
    
    public Matematica crearNumeros(){
        Matematica mat = new Matematica();
        return mat;
    }
    
    public double devolverMayor(Matematica mat){
        if (mat.getNum1()>=mat.getNum2()){
            return mat.getNum1();
        }
        return mat.getNum2();
    }
    
    public void calcularPotencia(Matematica mat){
        if (mat.getNum1()>=mat.getNum2()){
            System.out.println(Math.round(mat.getNum1())+" elevado a "+Math.round(mat.getNum2())+" es: "+Math.pow(Math.round(mat.getNum1()), Math.round(mat.getNum2())));
        } else{
            System.out.println(Math.round(mat.getNum2())+" elevado a "+Math.round(mat.getNum1())+" es: "+Math.pow(Math.round(mat.getNum2()), Math.round(mat.getNum1())));
        }
    }
    
    public void calcularRaiz(Matematica mat){
        if (mat.getNum1()>=mat.getNum2()){
            System.out.println("La raiz cuadrada de "+Math.round(mat.getNum2())+" es: "+Math.sqrt(Math.round(mat.getNum2())));
        } else{
            System.out.println("La raiz cuadrada de "+Math.round(mat.getNum1())+" es: "+Math.sqrt(Math.round(mat.getNum1())));
        }
    }
}
