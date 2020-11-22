package metodos;

import java.util.Arrays;
import java.util.ArrayList;


public class Invertir
{
    private String output = "";
    public Invertir(ArrayList<Integer> input)
    {
        reverseArray(input);
        output +=  input.toString();
    }
    
    public String getOutput(){
        return output;
    }
       
    public  void reverseArray(ArrayList<Integer> arr){
        reverse(arr, 0, arr.size() -1);  //Valores de inicialización para las condicionales
    }

    public void reverse(ArrayList<Integer> x, int i, int j){ 
        if(i<j){//Cambio
           int tmp = x.get(i);
           x.set(i, x.get(j));
           x.set(j, tmp);
           reverse(x, ++i, --j);//Recursivo
        }   
    }

    
    
}
