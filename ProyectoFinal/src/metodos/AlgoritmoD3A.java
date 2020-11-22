package metodos;

import java.util.ArrayList;
import static java.util.Arrays.sort;

public final class AlgoritmoD3A {
    
    ArrayList<Integer> v = new ArrayList<>();
    int n;
    
    private String cadena = "";

    public AlgoritmoD3A(ArrayList<Integer> vector, int x) {

        int n = vector.size(); 
        
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]= vector.get(i);
        }
        sort(arr, 0, n); 

        cadena+= "Arreglo Ordenado: \n"; 
        mostrarArray(arr); 
        
        int result = binarySearch(arr, x); 
        if (result == -1) 
            cadena+="El elemento no se ha encontrado\n"; 
        else
            cadena+="Elemento encontrado al index " + result; 
       
    }
 
    int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    }
    
    void mostrarArray(int arr[]){
        for(int i=0 ; i<arr.length;i++){
            cadena+=arr[i]+" ";
        }
        cadena+="\n";
    }
  
   

    


    public void escribir(){
        if(v.isEmpty()){
            cadena+="Conjunto Vacio";
        }
        for(int i=0 ; i<v.size(); i++){
            cadena+=(Integer.toString(v.get(i)) + " " );
        }
       cadena+=("\n");
    }
    
    public String getOutput(){
        return cadena;
    }
    
}

     



