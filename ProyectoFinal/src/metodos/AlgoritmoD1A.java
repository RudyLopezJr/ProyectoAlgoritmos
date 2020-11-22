package metodos;

import java.util.ArrayList;

public final class AlgoritmoD1A {
    
    ArrayList<Integer> v = new ArrayList<>();
    int n;
    
    private String cadena = "";

    public AlgoritmoD1A(ArrayList<Integer> vector) {

        int n = vector.size(); 
        
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]= vector.get(i);
        }
        sort(arr, 0, n-1); 

        System.out.println("sorted array"); 
        printArray(arr); 
    }
   
    
    int partition(int arr[], int low, int high) 
    { 
            int pivot = arr[high]; 
            int i = (low-1); 
            for (int j=low; j<high; j++) 
            { 
                   
                    if (arr[j] < pivot) 
                    { 
                            i++; 

                            
                            int temp = arr[i]; 
                            arr[i] = arr[j]; 
                            arr[j] = temp; 
                    } 
            } 

          
            int temp = arr[i+1]; 
            arr[i+1] = arr[high]; 
            arr[high] = temp; 

            return i+1; 
    } 


   
    void sort(int arr[], int low, int high) 
    { 
            if (low < high) 
            { 
                   
                    int pi = partition(arr, low, high);
                    sort(arr, low, pi-1); 
                    sort(arr, pi+1, high); 
            } 
    } 

    /* A utility function to print array of size n */
    void printArray(int arr[]) 
    { 
            int n = arr.length; 
            for (int i=0; i<n; ++i)
                    cadena+=arr[i]+" ";
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

     



