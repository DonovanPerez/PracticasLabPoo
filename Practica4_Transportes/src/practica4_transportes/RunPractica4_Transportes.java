/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4_transportes;
import java.util.Scanner;
/**
 *
 * @author donov
 */
public class RunPractica4_Transportes {
   static Scanner Obj = new Scanner(System.in);
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce la gasolina y nivel de carga electrica que tiene su automovil:");
        int v1 = Obj.nextInt();
        double v2 = Obj.nextDouble();
        Automovil bmw = new Automovil(v1);
        Automovil bmwE = new Automovil((double)v2);
        bmw.setColor("Azul");
        bmw.setMarca("BMW");
        bmw.setModelo("BMW i8");
        System.out.println("Automovil Marca: "+bmw.getMarca()+", Modelo: "+bmw.getModelo()+", Color: "+bmw.getColor());
        
        
        
        System.out.println("\nIntroduce la gasolina y nivel de carga electrica que tiene su Avion:");
        int v3 = Obj.nextInt();
        double v4 = Obj.nextDouble();
        Avion interjet = new Avion(v3);
        Avion interjetE =  new Avion((double)v4);
        interjet.setColor("Blanco");
        interjet.setMarca("Interjet");
        interjet.setModelo("Airbus A320-214 ");
        System.out.println("Avion Marca: "+interjet.getMarca()+", Modelo: "+interjet.getModelo()+", Color: "+interjet.getColor());
        
        System.out.println("\nIntroduce la gasolina y nivel de carga electrica que tiene su Tren:");
        int v5 = Obj.nextInt();
        double v6 = Obj.nextDouble();
        Tren Kansas = new Tren(v5);
        Tren KansasE = new Tren(v6);
        Kansas.setColor("Cafe");
        Kansas.setMarca("Kansas city");
        Kansas.setModelo(" Venice Simplon-Orient-Express (VSOE)");
        System.out.println("Tren Marca: "+Kansas.getMarca()+", Modelo: "+Kansas.getModelo()+", Color: "+Kansas.getColor()); 
        
    }
    
}
