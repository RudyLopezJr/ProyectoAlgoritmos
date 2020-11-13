
package metodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventanas.AlgoritmoR1;


public class Leer {
    String txtArea;
    public Leer(){
        File archivo = new File("./ArchivosGenerados/temp.txt");
        try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String texto="";
            String linea="";
            while((linea=br.readLine())!=null){
                texto+=linea+"\n";
            }
            txtArea+=texto;
            fr.close();
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AlgoritmoR1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AlgoritmoR1.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try{
                archivo.delete();
            }
            catch(Exception e){
                
            }
        }
    }
}
