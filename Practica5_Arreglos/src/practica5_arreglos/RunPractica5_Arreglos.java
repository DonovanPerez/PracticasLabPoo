/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5_arreglos;

import java.util.Scanner;

/**
 *
 * @author donov
 */
public class RunPractica5_Arreglos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        Scanner Obj = new Scanner(System.in);
        Automovil[] ford = new Automovil[5];
        for (i = 0; i < ford.length; i++) {
            ford[i] = new Automovil();
            System.out.println("Introduce la gasolina "+ Integer.toOctalString(i+1)+ ":");
            double gas= Obj.nextDouble();
            Obj.nextLine();
            System.out.println("Introduce la marca "+ Integer.toOctalString(i+1)+ ":");
            String marca=Obj.nextLine();
            System.out.println("Introduce el modelo "+ Integer.toOctalString(i+1)+ ":");
            String modelo= Obj.nextLine();
            System.out.println("Introduce el color "+ Integer.toOctalString(i+1)+ ":");
            String color= Obj.nextLine();
            System.out.println("Introduce el precio "+ Integer.toOctalString(i+1)+ ":");
            double precio= Obj.nextDouble();
            
            ford[i] = new Automovil(gas);
            ford[i].setGas(gas);
            ford[i].setMarca(marca);
            ford[i].setModelo(modelo);
            ford[i].setColor(color);
            ford[i].setPrecio(precio);
        }
        i=1;
        
        for(Automovil auto: ford){
            System.out.println("---------------------------");
            System.out.println("Gasolina: "+auto.getGas());
            System.out.println("Marca: "+auto.getMarca());
            System.out.println("Modelo: "+auto.getModelo());
            System.out.println("Color: "+auto.getColor());
            System.out.println("Precio: "+auto.getPrecio());
            System.out.println(auto.avanza(i));
            System.out.println(auto.avanzaDerecha(i));
            System.out.println(auto.avanzaIzquierda(i));
            System.out.println(auto.frenar());
            i++;
        }         
}
}