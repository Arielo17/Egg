
package pooejerapren4.entidades;

import java.util.Scanner;


public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public int getBase(){
        return base;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void crearRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        this.setBase(sc.nextInt());
        System.out.print("Ingrese la altura: ");
        this.setAltura(sc.nextInt());
    }
    
    public int superficieRectangulo(){
        return this.getBase()*this.getAltura();
    }
    
    public int perimetroRectangulo(){
        return 2*this.getBase()+2*this.getAltura();
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < this.getAltura(); i++) {
            for (int j = 0; j < this.getBase(); j++) {
                if (i==0 || i == this.getAltura()-1) {
                    System.out.print("* ");
                } else if (j==0 || j==this.getBase()-1){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
