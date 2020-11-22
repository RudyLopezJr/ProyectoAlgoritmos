package metodos;

import java.util.Arrays;
import java.util.ArrayList;
  
public class SumarDigitos { 
    
    private String output = "";
    public SumarDigitos(ArrayList<Integer> input)
    {
        int resp = calcularSuma(input, input.size());
        output +=  String.valueOf(resp);
    } 
    
    public String getOutput(){
        return output;
    }
    
    // Return sum of elements in A[0..N-1] 
    // using recursion. 
    public int calcularSuma(ArrayList<Integer> A, int N) 
    { 
        if (N <= 0) 
            return 0; 
        return (calcularSuma(A, N - 1) + A.get(N - 1)); 
    } 
  
     
} 
