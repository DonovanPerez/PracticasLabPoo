/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transporteast;

import java.util.ArrayList;
/**
 *
 * @author donov
 */
public class RunTransporteasT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Avion t1 = new Avion();
        Tren t2 = new Tren();
        Automovil t3 = new Automovil();
        Barco t4 = new Barco();
        
        ArrayList<Avion> al = new ArrayList<Avion>();
        al.add(t1);
        ArrayList<Tren> ad = new ArrayList<Tren>();
        ad.add(t2);
        ArrayList<Automovil> av = new ArrayList<Automovil>();
        av.add(t3);
        ArrayList<Barco> ab = new ArrayList<Barco>();
        ab.add(t4);
        
        for (Avion myA: al){
            myA.setMarca("Interjet");
            myA.setVelocidad(235);
            myA.setTamaño("Tamaño Grande");
            System.out.println("Avion: ");
            System.out.println(myA.getMarca());
            System.out.println(myA.getTamaño());
            System.out.println(myA.getVelocidad());
        }
        for (Tren myA: ad){
            myA.setMarca("Kansas");
            myA.setVelocidad(180);
            myA.setCarga("Cargamento de carbon");
            System.out.println("Tren: ");
            System.out.println(myA.getMarca());
            System.out.println(myA.getCarga());
            System.out.println(myA.getVelocidad());
        }
        for (Automovil myA: av){
            myA.setMarca("Ford");
            myA.setVelocidad(100);
            myA.setColor("Color roja");
            System.out.println("Automovil: ");
            System.out.println(myA.getMarca());
            System.out.println(myA.getColor());
            System.out.println(myA.getVelocidad());
        }
        for (Barco myA: ab){
            myA.setMarca("Bergatin");
            myA.setVelocidad(200);
            myA.setTripulacion("Hay 5 tripulantes");
            System.out.println("Automovil: ");
            System.out.println(myA.getMarca());
            System.out.println(myA.getTripulacion());
            System.out.println(myA.getVelocidad());
        }
        
        
        double suma=t1.getVelocidad()+t2.getVelocidad()+t3.getVelocidad()+t4.getVelocidad();
        double prom=suma/4;
        System.out.println("\nEl promedio de velocidad de los transportes es de "+prom);
        
        
    }
    
}
