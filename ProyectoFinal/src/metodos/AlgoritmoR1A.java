package metodos;

import java.util.ArrayList;

public final class AlgoritmoR1A {
    
    ArrayList<Integer> v = new ArrayList<>();
    int n;
    
    private String cadena = "";

    public AlgoritmoR1A(ArrayList<Integer> vector) {
       n = vector.get(0).intValue();
       System.out.println(""+n);
       gen(1);
    }
   
    
    public void gen(int k) {
        if (k == n+1) {
                escribir();
        } 
        else {
            gen(k+1);
            v.add(k);
            gen(k+1);
            v.remove(v.size()-1);
        }
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
    
    public String getCadena(){
        return cadena;
    }
}

     



