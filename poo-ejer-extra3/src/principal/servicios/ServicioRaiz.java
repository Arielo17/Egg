
package principal.servicios;

import java.util.Scanner;
import principal.entidades.Raiz;

public class ServicioRaiz {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Raiz crearRaiz(){
        System.out.println("A continuación pediremos los coeficientes de la función A*X^2 + B*X + C\nTener en cuenta que A no puede ser 0");
        double a;
        do {
            System.out.print("Ingrese el primer coeficiente (A*x^2): ");
            a = sc.nextDouble();
        } while (a==0);
        
        System.out.print("Ingrese el segundo coeficiente (B*x): ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el tercer coeficiente (C): ");
        double c = sc.nextDouble();
        Raiz rz = new Raiz(a, b, c);
        return rz;
    }
    
    public double getDiscriminante(Raiz rz){
        double dis = Math.pow(rz.getB(), 2)-4*rz.getA()*rz.getC();
        return dis;
    }
    
    public boolean tieneRaices(Raiz rz){
        if (getDiscriminante(rz)>0){
            return true;
        }
        return false;
    }
    
    public boolean tieneRaiz(Raiz rz){
        if (getDiscriminante(rz) == 0){
            return true;
        }
        return false;
    }
    
    public double[] obtenerRaices(Raiz rz){
        double[] raices = new double[2];
        // (-b±√((b^2)-(4*a*c)))/(2*a)
        raices[0] = (-rz.getB()+Math.sqrt(getDiscriminante(rz)))/(2*rz.getA());
        raices[1] = (-rz.getB()-Math.sqrt(getDiscriminante(rz)))/(2*rz.getA());

        return raices;
    }
    
    public double obtenerRaiz(Raiz rz){
        double raiz = -rz.getB()/(2*rz.getA());
        return raiz;
        
    }
    
    public void calcular(Raiz rz){
        if (tieneRaices(rz)){
            double[] raices = obtenerRaices(rz);
            System.out.println("Las raices son " + String.format("%.3f", raices[0]) + " y " + String.format("%.3f", raices[1]));
        }
        if (tieneRaiz(rz)){
            System.out.println("La raiz es: " + String.format("%.3f", obtenerRaiz(rz)));
        }
        if (getDiscriminante(rz)<0){
            System.out.println("La ecuación no tiene solución real");
        }
    }
}
