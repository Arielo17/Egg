
package pooejerextra2.servicios;

import java.util.Scanner;
import pooejerextra2.entidades.Punto;

public class ServicioPunto {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Punto crearPunto(){
        System.out.println("A continuacion se le pediran las coordenadas de los dos puntos");
        System.out.print("X-1: ");
        int x1 = sc.nextInt();
        System.out.print("Y-1: ");
        int y1 = sc.nextInt();
        System.out.println("Punto 1: (" + x1 + "," + y1 + ")");
        System.out.print("X-2: ");
        int x2 = sc.nextInt();
        System.out.print("Y-2: ");
        int y2 = sc.nextInt();
        System.out.println("Punto 2: (" + x2 + "," + y2 + ")");
        Punto pto = new Punto(x1, y1, x2, y2);
        return pto;
    }
    
    public double calcularDistancia(Punto pto){
        double dist = Math.sqrt(Math.pow(pto.getX2()-pto.getX1(), 2)+Math.pow(pto.getY2()-pto.getY1(), 2));
        return dist;
    }
    
}
