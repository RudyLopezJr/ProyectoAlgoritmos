/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;

public class Prim{
    private int cantidadDeNodos,cantidadDeAristas,peso,origen,destino,u,w;
    private int contador = 0;
    private int costoDeMST;
    private ArrayList<Nodo> grafo = new ArrayList<Nodo>();
    private ArrayList<Integer> nodosOcupados = new ArrayList<Integer>();
    private ArrayList<Arista> cola = new ArrayList<Arista>();
    
    public Prim(ArrayList<Integer> input){
        cantidadDeNodos = input.get(contador++);
        cantidadDeAristas = input.get(contador++);
        
        for(int i=0;i<cantidadDeNodos;i++){
            grafo.add(new Nodo());
            nodosOcupados.add(0);
        }
        
        for(int i=0;i<cantidadDeAristas;i++){
            origen = input.get(contador++);
            destino = input.get(contador++);
            peso = input.get(contador++);
            origen--;
            destino--;
            
            Arista nuevaArista1 = new Arista();
            nuevaArista1.destino = destino;
            nuevaArista1.peso = peso;
            grafo.get(origen).aristas.add(nuevaArista1);
            
            Arista nuevaArista2 = new Arista();
            nuevaArista2.destino = origen;
            nuevaArista2.peso = peso;
            grafo.get(destino).aristas.add(nuevaArista2);
        }
        
        procesar(0);
        costoDeMST = 0;
        
        while(cola.size() != 0){
            Arista front = obtenerMenor();
            u = front.peso;
            w = front.destino;
            if(nodosOcupados.get(w) == 0){
                costoDeMST+=u;
                procesar(w);
            }
        }
        
    }
    
    private void procesar(int nodo){
        nodosOcupados.set(nodo,1);
        for(int i=0;i<grafo.get(nodo).aristas.size(); i++){
            Arista v = new Arista();
            v.peso = grafo.get(nodo).aristas.get(i).peso;
            v.destino = grafo.get(nodo).aristas.get(i).destino;
            if(nodosOcupados.get(v.destino) == 0){
                cola.add(v);
            }
        }
    }
    private Arista obtenerMenor(){
        int posicion = 0, menor = 2147483647, nodo;
        Arista nuevaArista = new Arista();
        
        for(int i=0;i<cola.size();i++){
            if(cola.get(i).peso < menor){
                menor = cola.get(i).peso;
                posicion = i;
            }
        }
        nuevaArista.destino = cola.get(posicion).destino;
        nuevaArista.peso = cola.get(posicion).peso;
        cola.remove(posicion);
        return nuevaArista;
    }
    public String getOutput(){
        String output = "Costo de arbol de expancion minimo: " + Integer.toString(costoDeMST);
        return output;
    }
}
