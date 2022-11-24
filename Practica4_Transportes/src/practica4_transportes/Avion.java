/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4_transportes;
import Vehiculos.Vehiculo;
/**
 *
 * @author donov
 */
public class Avion extends Vehiculo {
    public Avion(){
    }
    
     public Avion(int gas){
        this.encenderAvion(gas);
        this.avanzaAvion(gas);
    }
    
    private void encenderAvion(int gas){
        if(gas>1)
            System.out.println("Avion Encendido");
        else
            System.out.println("No hay suficiente gasolina");
    }
    
    private void avanzaAvion(int gas){
        
        if(gas>10 && gas<30){
            System.out.println("Nivel bajo de gasolina");
         }else if(gas>30){
            System.out.println("Buen nivel de gasolina");
            } else {
            System.out.println("No hay suficiente gasolina");
        }
    }
     public Avion(double carga){
        this.encenderAvion(carga);
        this.avanzaAvion(carga);
    }
    
    private void encenderAvion(double carga){
        if(carga>1)
            System.out.println("Avion Encendido");
        else
            System.out.println("No hay suficiente carga electrica");
    }
    
    private void avanzaAvion(double carga){
        
        if(carga>10 && carga<30){
            System.out.println("Nivel bajo de carga electrica");
         }else if(carga>30){
            System.out.println("Buen nivel de carga electrica");
            } else {
            System.out.println("No hay suficiente carga electrica");
        }
    }
    
}
