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
public class Tren extends Vehiculo{
    public Tren(){
    }
     public Tren(int gas){
        this.encenderTren(gas);
        this.avanzaTren(gas);
    }
    
    private void encenderTren(int gas){
        if(gas>1)
            System.out.println("Tren Encendido");
        else
            System.out.println("No hay suficiente gasolina");
    }
    
    private void avanzaTren(int gas){
        
        if(gas>10 && gas<30){
            System.out.println("Nivel bajo de gasolina");
         }else if(gas>30){
            System.out.println("Buen nivel de gasolina");
            } else {
            System.out.println("No hay suficiente gasolina");
        }
    }
     public Tren(double carga){
        this.encenderTren(carga);
        this.avanzaTren(carga);
    }
    
    private void encenderTren(double carga){
        if(carga>1)
            System.out.println("Tren Encendido");
        else
            System.out.println("No hay suficiente carga electrica");
    }
    
    private void avanzaTren(double carga){
        
        if(carga>10 && carga<30){
            System.out.println("Nivel bajo de carga electrica");
         }else if(carga>30){
            System.out.println("Buen nivel de carga electrica");
            } else {
            System.out.println("No hay suficiente carga electrica");
        }
    }
}
