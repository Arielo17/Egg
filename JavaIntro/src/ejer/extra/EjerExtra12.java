
package ejer.extra;


public class EjerExtra12{
    
    public static void main(String[] args){
        
        String[] vec = new String[10];
        for (int i = 0; i < 10; i++) {
            if (i==3){
                vec[i]="E";
            } else{
                vec[i]=String.valueOf(i);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(vec[i]+"-"+vec[j]+"-"+vec[k]);
                }
            }
        }  
    }
}
