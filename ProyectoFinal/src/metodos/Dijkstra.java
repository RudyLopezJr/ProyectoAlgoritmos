package metodos;

import java.util.ArrayList;
        
public class Dijkstra{
    private int contador;
    private int cantidadDeNodos;
    private int cantidadDeAristas;
    private ArrayList<Nodo> grafo = new ArrayList<Nodo>();
    private ArrayList<Integer> distancias = new ArrayList<Integer>();
    private final int INFINITO = 2147483647;
    private ArrayList<Arista> cola = new ArrayList<Arista>();
    private ArrayList<Boolean> procesados = new ArrayList<Boolean>();
    private int nodoInicial;
        
    public Dijkstra(ArrayList<Integer> input){
        nodoInicial = 0;
        contador = 0;
        cantidadDeNodos = input.get(contador++);
        cantidadDeAristas = input.get(contador++);
        
        for(int i = 0; i < cantidadDeNodos ; i++){
            grafo.add(new Nodo());
            distancias.add(INFINITO);
            procesados.add(false);
        }
        
        int nodoA, nodoB, peso;
        
        for(int i = 0; i < cantidadDeAristas ; i++){
            nodoA = input.get(contador++);
            nodoB = input.get(contador++);
            peso = input.get(contador++);
            nodoA--;
            nodoB--;
            
            Arista nuevaArista1 = new Arista();
            nuevaArista1.destino = nodoB;
            nuevaArista1.peso = peso;
            grafo.get(nodoA).aristas.add(nuevaArista1);
            
            Arista nuevaArista2 = new Arista();
            nuevaArista2.destino = nodoA;
            nuevaArista2.peso = peso;
            grafo.get(nodoB).aristas.add(nuevaArista2);
        }
        
        distancias.set(nodoInicial,0);
        cola.add(new Arista(nodoInicial,0));
        int nodoEnProceso;
        
        while(cola.size() != 0){
            nodoEnProceso = obtenerMenor();
            
            if(procesados.get(nodoEnProceso)) continue;
            procesados.set(nodoEnProceso,true);
            
            int b;
            for(int i=0;i<grafo.get(nodoEnProceso).aristas.size();i++){
                b = distancias.get(nodoEnProceso) + grafo.get(nodoEnProceso).aristas.get(i).peso;
                
                if(b < distancias.get(grafo.get(nodoEnProceso).aristas.get(i).destino)){
                    distancias.set(grafo.get(nodoEnProceso).aristas.get(i).destino,b);
                    cola.add(new Arista(grafo.get(nodoEnProceso).aristas.get(i).destino,b));
                }
            }
        }

    }

    public String obtenerGrafo(){
        String output = "";
        
        for(int i=0;i<grafo.size();i++){
            output+=(Integer.toString(i+1) + ": ");
            for(int j=0;j<grafo.get(i).aristas.size();j++){
                output+=("(" + Integer.toString(grafo.get(i).aristas.get(j).destino+1) + "," + Integer.toString(grafo.get(i).aristas.get(j).peso) + ") ");
            }
            output+=("\n");
        }
        
        return output;
    }
    
    public String getOutput(){
        String output = "";
        
        for(int i = 0; i<distancias.size(); i++){
            output+=("Distancia más corta al nodo " + Integer.toString(i+1) + " desde " + Integer.toString(nodoInicial+1) + ": ");
            if(distancias.get(i) == INFINITO){
                output+=("Infinito\n");
            }
            else{
                output+=(Integer.toString(distancias.get(i)) + "\n");
            }
        }
        
        return output;
    }
    
    private int obtenerMenor(){
        int posicion = 0, menor = INFINITO, nodo;
        
        for(int i=0;i<cola.size();i++){
            if(cola.get(i).peso < menor){
                menor = cola.get(i).peso;
                posicion = i;
            }
        }
        nodo = cola.get(posicion).destino;
        cola.remove(posicion);
        return nodo;
    }
}
