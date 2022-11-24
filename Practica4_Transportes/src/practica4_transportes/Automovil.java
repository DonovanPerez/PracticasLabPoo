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
public class Automovil extends Vehiculo {
    public Automovil(){
    }
     public Automovil(int gas){
        this.encenderAutomovil(gas);
        this.avanzaAutomovil(gas);
    }
    
    private void encenderAutomovil(int gas){
        if(gas>1)
            System.out.println("Automovil Encendido");
        else
            System.out.println("No hay suficiente gasolina");
    }
    
    private void avanzaAutomovil(int gas){
        
        if(gas>10 && gas<30){
            System.out.println("Nivel bajo de gasolina");
         }else if(gas>30){
            System.out.println("Buen nivel de gasolina");
            } else {
            System.out.println("No hay suficiente gasolina");
        }
    }
    public Automovil(double carga){
        this.encenderAutomovil(carga);
        this.avanzaAutomovil(carga);
    }
    
    private void encenderAutomovil(double carga){
        if(carga>1)
            System.out.println("Automovil Encendido");
        else
            System.out.println("No hay suficiente carga electrica");
    }
    
    private void avanzaAutomovil(double carga){
        
        if(carga>10 && carga<30){
            System.out.println("Nivel bajo de carga electrica");
         }else if(carga>30){
            System.out.println("Buen nivel de carga electrica");
            } else {
            System.out.println("No hay suficiente carga electrica");
        }
    }
   
}
