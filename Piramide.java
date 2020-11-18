package ventanas;

public class Piramide {
   private int fila;
   
   public void setFila(int fila){
       this.fila = fila;
   }
   
   public int getFila(){
       return fila;
   }
   
   public String Pascal(){
       String respuesta = "";
       for(int i = 0; i<=fila; i++){
           respuesta = respuesta + " " + String.valueOf(recPascal(getFila(), i)) + " ";
       }
       return respuesta;
   }
   
   private int recPascal(int fila, int columna){
       if(fila == columna || columna == 0 ){
           return 1;
       }else{
           return recPascal(fila-1, columna-1) + recPascal(fila-1, columna);
       }
   }
}

