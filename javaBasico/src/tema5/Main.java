
package tema5;

import java.util.ArrayList;


public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> vector = new ArrayList(); 
        vector.add(4);
        vector.add(456);
        vector.add(0);
        System.out.println(vector);
        vector.remove(1);
        System.out.println(vector);
        System.out.println("tamaño: " + vector.size());
        
        ArrayList<Integer> vector2 = new ArrayList();
        vector2.add(4);
        vector2.add(0);
        
        System.out.println(vector.equals(vector2));
    }
}
