/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author donov
 */
public class RunPractica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        // TODO code application logic here
        Telefono tl = new Telefono();
        Computadora cp =  new Computadora();
         ArrayList<Telefono> al = new ArrayList<Telefono>();
         ArrayList<Computadora> ap = new ArrayList<Computadora>();
         al.add(tl);
         ap.add(cp);
         
         System.out.println("Introduce la marca del telefono:");
         String marca = Obj.nextLine();
         System.out.println("Introduce el modelo:");
         String modelo = Obj.nextLine();
         System.out.println("Introduce el color:");
         String color = Obj.nextLine();
         System.out.println("Introduce el precio:");
         String precio = Obj.nextLine();
         System.out.println("Introduce el tipo de cargador que utiliza");
         String tipoCargador = Obj.nextLine();
         tl.setModelo(modelo);
         tl.setMarca(marca);
         tl.setColor(color);
         tl.setPrecio(precio);
         tl.setTipoCargador(tipoCargador);
         
         for(Telefono tf: al){
             System.out.println("-----------Datos del Telefono---------------");
             System.out.println("Marca: "+tf.getMarca());
             System.out.println("Modelo: "+tf.getModelo());
             System.out.println("Color: "+tf.getColor());
             System.out.println("Precio: "+tf.getPrecio());
             System.out.println("Tipo de cargador: "+tf.getTipoCargador());
             System.out.println(tf.encender());
             System.out.println(tf.apagar());
         }
         
         System.out.println("\nIntroduce la marca de la computadora: ");
         String marcaC = Obj.nextLine();
         System.out.println("Introduce el modelo: ");
         String modeloC = Obj.nextLine();
         System.out.println("Introduce el color: ");
         String colorC = Obj.nextLine();
         System.out.println("Introduce el tamaño de la pantalla");
         String pantalla = Obj.nextLine();
         System.out.println("Introduce la cantidad de RAM");
         String ram = Obj.nextLine();
         cp.setColor(colorC);
         cp.setMarca(marcaC);
         cp.setModelo(modeloC);
         cp.setPantalla(pantalla);
         cp.setRam(ram);
         
         for(Computadora c: ap){
             System.out.println("---------Datos de la computadora---------");
             System.out.println("Marca: "+c.getMarca());
             System.out.println("Modelo: "+c.getModelo());
             System.out.println("Color: "+c.getColor());
             System.out.println("Tamaño de pantalla: "+c.getPantalla());
             System.out.println("Cantidad de ram: "+c.getRam());
             System.out.println(c.encender());
             System.out.println(c.apagar());
         }
         
    }
    
}
