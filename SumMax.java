package ventanas;
import java.util.ArrayList;

public class SumMax {
    private ArrayList arr = new ArrayList();
    private int a, b;
    
    public ArrayList getArr() {
        return arr;
    }

    public void setArr(ArrayList arr) {
        this.arr = arr;
    }
    
    public String getOutput(){  //devulve un String con la suma total y el subarreglo 
        String res = "Suma: ";
        res = res + String.valueOf(subArre(0, arr.size()-1));
        
        res = res + " Subarreglo: " +String.valueOf(getSubArray());
        return res;
    }
    
    private int subArre(int inicio, int fin){
        if(inicio == fin){
            return (int)arr.get(inicio);    //si solo contiene un elemento la suma es ese elemento
        }
        int mitad = (inicio + fin)/2;       //calculamos la mitad para hacer la division del arreglo
        int sumaizq, sumader, sumacent, suma;
        
        int izq = subArre(inicio, mitad);   //realizamos la division recursivamente por la izquierda
        int der = subArre(mitad+1, fin);    //y por la derecha, las variables guardaran la suma del aubarre izq y el derecho
        
        int i_izq, i_der;   //guarda los indices iniciales y finales del subarreglo que se esta sumando
        suma = 0;
        
        //usamos el siguiente codigo para obtener la suma central y despues comparar con las anteriores dos
        sumaizq = (int)arr.get(mitad);  //inicialmente obtiene el valor del elemento mas cercano al centro
        i_izq = mitad;
        for(int i = mitad; i>= inicio; i--){    //va sumando los elementos del lado izquierdo de derecha a izquierda
            suma += (int)arr.get(i);
            if(suma > sumaizq){   //solo cuando la suma acumulada es mayor esta se actualiza en sumaizq 
                sumaizq = suma;
                i_izq = i;
            }
        }
        //de manera similar se realizan los pasos anteriores pero con el subarreglo derecho
        suma = 0;
        sumader = (int)arr.get(mitad+1);
        i_der = mitad+1;
        for(int i = mitad+1; i<= fin; i++){
            suma += (int)arr.get(i);
            if(suma > sumader){
                sumader = suma;
                i_der = i;
            }
        }
        
        sumacent = sumaizq + sumader;   //la suma central total sera las sumas parciales de la izquierda y la derecha
        if(der > izq && der > sumacent){    //comparamos y segun cada caso devuelve la suma y los indices del subarreglo
            a = i_izq;
            b = i_der;
            return der;
        }else if(izq > der && izq > sumacent){
            a = i_izq;
            b = i_der;
            return izq;
        }else{
            a = i_izq;
            b = i_der;
            return sumacent;
        }
    }
    
    public ArrayList getSubArray(){ //obtiene el subarreglo con la mayor suma
        ArrayList sub = new ArrayList();
        for(int i = a; i<=b; i++){
            sub.add(arr.get(i));
        }
        return sub;
    }
}
