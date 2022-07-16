
package ejerAprend;


public class Ejer_Apre_15 {
    
    public static void main(String[] args){
        int[] vec = new int[100];
        for (int i = 0; i < 100; i++) {
            vec[i]=i;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(vec[99-i]+" ");
            if (i%10==9){
                System.out.println("");
            }
        }
    }
    
}
