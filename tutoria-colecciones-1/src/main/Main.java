package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    
    public static void main(String[] args) {
        
        // Creamos una ArrayList denominado "Alfabeto" que contendra datos del tipo String
        ArrayList<String> alfabeto = new ArrayList();
        
        // Ingreso de datos
        // Ingresamos los datos con add()
        alfabeto.add("a");
        alfabeto.add("b");
        alfabeto.add("b");
        alfabeto.add("e");
        alfabeto.add("c");
        
        System.out.println("Datos ingresados:");
        
        // Recorrer un ArrayList
        // forEach
        for (String aux : alfabeto){
            System.out.print(aux + " ");
        }
        System.out.println("\n-----");
        
        // otra forma de ingresar un dato es a traves de la posición
        alfabeto.add(2,"g");
        
        for (String aux : alfabeto){
            System.out.print(aux + " ");
        }
        System.out.println("\n-----");
        
        // Eliminar elementos
        // Por medio del índice
        alfabeto.remove(5);
        
        System.out.println("Removemos por índice:");
        for (String aux : alfabeto){
            System.out.print(aux + " ");
        }
        System.out.println("\n-----");
        
        // Por elemento
        alfabeto.remove("b");
        
        System.out.println("Removemos por elemento:");
        for (String aux : alfabeto){
            System.out.print(aux + " ");
        }
        System.out.println("\n-----");
        
        // Iterator
        Iterator<String> itAlfabeto = alfabeto.iterator();
        while(itAlfabeto.hasNext()){
            if(itAlfabeto.next().equals("e")){
                itAlfabeto.remove();
            }
        }
        
        System.out.println("Iterator:");
        for (String aux : alfabeto){
            System.out.print(aux + " ");
        }
        System.out.println("\n-----");
        
        //Ordenar lista
        Collections.sort(alfabeto);
        
        System.out.println("Lista ordenada");
        for (String aux : alfabeto){
            System.out.print(aux + " ");
        }
        System.out.println("\n-----");
    }
}
