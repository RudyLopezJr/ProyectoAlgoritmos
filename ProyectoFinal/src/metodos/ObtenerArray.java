
package metodos;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import static jdk.nashorn.tools.ShellFunctions.input;


public class ObtenerArray {
    
    private ArrayList<Integer> v = new ArrayList<>();
    public String datos;

    public ObtenerArray(String text) {
        datos = text;
    }

    public ArrayList<Integer> getArray(){
        
       String[] strs = datos.trim().split("\\s+");  
       
        return  v;
    }


}
