
package pooejerapren8;

import java.util.Scanner;
import pooejerapren8.entidades.Cadena;
import pooejerapren8.servicios.ServicioCadena;


public class POOEjerAprend8 {
    
    public static Scanner scanner(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        return sc;
    }
    
    public static void menu(){
        System.out.println("1. Contar vocales");
        System.out.println("2. Invertir frase");
        System.out.println("3. Cuantas veces se repite");
        System.out.println("4. Comparar longitud");
        System.out.println("5. Unir frase");
        System.out.println("6. Reemplazar 'a' por...");
        System.out.println("7. Contiene la letra...");
        System.out.println("8. Salir");
        System.out.print("Opción: ");
    }
    
    public static void main(String[] args) {
        
        
        System.out.print("Ingrese una frase: ");
        String frase = scanner().nextLine();
        ServicioCadena serCad = new ServicioCadena();
        Cadena cad = serCad.crearCadena();
        cad.setFrase(frase);
        cad.setLongFrase(frase.length());
        
        int opc;
        String conf = "";
        do {
            menu();
            opc = scanner().nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("La frase tiene "+serCad.contarVocales(cad)+" vocales");
                    break;
                case 2:
                    System.out.print("La frase invertida es: ");
                    serCad.invertirFrase(cad);
                    break;
                case 3:
                    System.out.print("Ingrese un caracter para saber cuantas veces se repite: ");
                    System.out.println("La letra se repite "+serCad.vecesRepetido(cad, scanner().nextLine())+" veces");
                    break;
                case 4: 
                    System.out.print("Ingrese una frase para comparar la longitud: ");
                    serCad.compararLongitud(cad, scanner().nextLine());
                    break;
                case 5:
                    System.out.print("Ingrese la frase a unir: ");
                    serCad.unirFrase(cad, scanner().nextLine());
                    break;
                case 6: 
                    System.out.print("Ingrese un caracter para reemplazar por la letra 'a': ");
                    serCad.reemplazar(cad, scanner().nextLine());
                    break;
                case 7:
                    System.out.print("Ingrese la letra a buscar en la frase: ");
                    if (serCad.contiene(cad, scanner().nextLine())){
                        System.out.println("La letra se encuentra en la frase");
                    }else{
                        System.out.println("La letra no se encuentra en la frase");
                    }
                    break;
                case 8: 
                    do {
                        System.out.println("Confirma que desea salir? (s/n)");
                        conf = scanner().nextLine();
                    } while (!(conf.equalsIgnoreCase("s") || conf.equalsIgnoreCase("n")));
                     
            }
        } while (!(conf.equalsIgnoreCase("s")));
        
    }
    
}
