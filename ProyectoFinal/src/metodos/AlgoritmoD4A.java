package metodos;

import java.util.ArrayList;
import static java.util.Arrays.sort;

public final class AlgoritmoD4A {
    
    
    long n;
    
    private String cadena = "";

    public AlgoritmoD4A(ArrayList<Integer> vector) {

        int n = vector.size(); 
        
        long[] array = new long[n];
        for(int i=0 ; i<n ; i++){
            array[i]= vector.get(i);
        }
        sort(array, 0, n-1); 
        

        cadena+= multip_array(0, array.length -1, array);
       
    }
   
    long multip_array(int inicio, int fin, long[] array){

        if (inicio==fin){
            return array[inicio];
        }else{

            int mit = (inicio+fin)/2;

            long x = multip_array(inicio, mit, array);
            long y= multip_array(mit+1, fin, array);

            return x * y;
        }
    }
   
    public String getOutput(){
        return cadena;
    }
}
    

     



