/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rudyl
 */
public class Escribir {
    File archivo = new File("./ArchivosGenerados/temp.txt");
    private ArrayList<Integer> eglo = new ArrayList<>();
    
    private String cadena;
    public Escribir(String cadena2){
        cadena = cadena2;
        System.out.println(cadena);
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            if (!archivo.exists()) {
               archivo.createNewFile();
            } 
            fw = new FileWriter(archivo.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(cadena);
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
        
        try{
            Scanner scanner = new Scanner(new File("./ArchivosGenerados/temp.txt"));
            int i = 0;
            while(scanner.hasNextInt()){
               eglo.add(scanner.nextInt());
            }
        }
        catch(FileNotFoundException e){
            
        }
        try{
            BufferedWriter xd = new BufferedWriter(new FileWriter(archivo));
            xd.write("");
            xd.close();
        }
        catch(IOException e){
            
        }
        
        
        
       
        
        
    }
    public ArrayList<Integer> getArray(){
        eglo.forEach((eglo1) -> {
            System.out.println(""+eglo1);
        });
        return eglo;
    }

        
}
