package metodos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class AlgoritmoR2A {
    ArrayList<Integer> v = new ArrayList<>();
    int n;
    
    public String nombreArchivo = "AlgoritmoR1.txt";
    File archivo = new File("./ArchivosGenerados/"+nombreArchivo);

    public AlgoritmoR2A(int num) {
       n = num;
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
         BufferedWriter bw = null;
         FileWriter fw = null;
         try {
            if (!archivo.exists()) {
               archivo.createNewFile();
            } 
            
            fw = new FileWriter(archivo.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            if(v.isEmpty()){
                bw.write("Conjunto Vacio");
            }
            for(int i=0 ; i<v.size(); i++){
                bw.write(Integer.toString(v.get(i)) + " " );
            }
            bw.write("\n");
    
        } 
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Un error ha ocurrido");
        }
         finally {
            try {
                        //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            }
            catch (IOException ex) {
            }
        }
    }
    
} 


     



