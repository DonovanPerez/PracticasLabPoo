/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8;

/**
 *
 * @author donov
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {
    
    public Utils(String fileN){
        this.wfiles(fileN);
    }
    
    private void wfiles(String fileN){
        
        try
        {
            FileWriter fw = new FileWriter(fileN);
            fw.write("El archivo se escribio exitosamente\n");
            fw.write(fileN);
            fw.close();
            
            FileReader fr = new FileReader(fileN);
            int valor = fr.read();
            while(valor!=-1){
                System.out.println((char)valor);
                valor= fr.read();
            }
                fr.close();
        }
            catch(IOException ex){
                    }
        }
    }

