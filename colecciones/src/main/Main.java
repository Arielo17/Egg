
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import main.entidad.Libro;
import main.utilidad.Comparadores;


public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> listado = new ArrayList<>();
        TreeSet<String> palabras = new TreeSet<>();
        HashMap<Integer, String> personas = new HashMap<>();
        
        listado.add(50);
        listado.add(40);
        listado.add(30);
        listado.add(20);
        listado.add(10);
        
        palabras.add("Hola");
        palabras.add("cómo");
        palabras.add("estás");
        palabras.add("hoy");
        palabras.add("?");
        
        personas.put(1, "Ariel");
        personas.put(2, "Lucas");
        personas.put(3, "Gonzalo");
        personas.put(4, "Matías");
        personas.put(5, "Germán");
        
        listado.remove(3); //uso el indice -> elimino el número 40
        listado.remove(Integer.valueOf(10)); //uso el objeto -> elimino el número 10
        
        palabras.remove("hoy"); // sólo puedo remover por objeto
        
        personas.remove(5); //uso la clave solamente -> elimino "Germán"
        
        //mostramos los elementos que quedaron el el ArrayList
        for (Integer aux : listado){
            System.out.print(aux + " ");
        }
        System.out.println("");
        //mostramos los elementos que quedaron en el TreeSet
        for (String aux : palabras){
            System.out.print(aux + " ");
        }
        System.out.println("");
        //mostramos los elementos que quedaron en el HashMap
        for (Map.Entry <Integer,String> aux : personas.entrySet()){
            System.out.println(aux.getKey()+ "->" + aux.getValue());
        }
        
        //Imprimir en pantalla con "Iterator"
            //ArrayList
        Iterator itArrayList = listado.iterator();
        while (itArrayList.hasNext()) {
            System.out.print(itArrayList.next()+ " ");
        }
        System.out.println("");
        
            //TreeSet
        Iterator itTreeSet = palabras.iterator();
        while (itTreeSet.hasNext()) {
            System.out.print(itTreeSet.next()+ " ");
        }
        System.out.println("");
        
            //HashMap
        mostrarMap(personas);
        System.out.println("");
        
        //borrar elementos con "Iterator"
            //ArrayList
        //Iterator itArrayList = listado.iterator();  -> ya lo tenemos más arriba
        while (itArrayList.hasNext()) {
            if (itArrayList.next() == Integer.valueOf(30)) { //eliminamos el numero 30
                itArrayList.remove();
            }
        }
        
            //TreeSet
        //Iterator itTreeSet = palabras.iterator();  -> definido mas arriba
        while (itTreeSet.hasNext()) {
            if (itTreeSet.next().equals("Hola")) {
                itTreeSet.remove();
            }
        }
        
        mostrarMap(personas);
        
        //ordenar
            //ArrayList
        Collections.sort(listado);
        
            //TreeSet
            // debo convertirlo a ArrayList
        ArrayList<String> palabrasLista = new ArrayList<>(palabras);
        Collections.sort(palabrasLista);
        
        System.out.println("");
        ArrayList<Libro> biblioteca = new ArrayList<>();
        Libro book1 = new Libro("Hola1", 1985);
        Libro book2 = new Libro("Hola2", 1989);
        Libro book3 = new Libro("Hola3", 1987);
        biblioteca.add(book1);
        biblioteca.add(book2);
        biblioteca.add(book3);
        
        Collections.sort(biblioteca, Comparadores.ordenarPorAnio);
        for (Libro aux : biblioteca){
            System.out.println(aux);
        }
        
        Collections.sort(biblioteca, Comparadores.ordenarPorTitulo);
        for (Libro aux : biblioteca){
            System.out.println(aux);
        }
    }
    
    public static void mostrarMap(HashMap<Integer, String> personas){
        Iterator<Entry<Integer,String>> itHashMap = personas.entrySet().iterator();
        while (itHashMap.hasNext()) {
            Map.Entry<Integer,String> sigMap = (Map.Entry<Integer,String>)itHashMap.next();
            System.out.println(sigMap.getKey() + "->" + sigMap.getValue());
        }
    }
    
    
}
