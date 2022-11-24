/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica8;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author donov
 */

public class RunPractica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Ingrese donde esta su archivo y que desea escribir");
        String ar = Obj.nextLine();
        Utils fl = new Utils(ar);
        
        
    }
    
}
