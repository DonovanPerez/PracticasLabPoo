/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5_arreglos;

/**
 *
 * @author donov
 */
public class Automovil extends Automotor{
    public Automovil(){
}
    public Automovil(double gas){
        this.avanza(gas);
        this.avanzaDerecha(gas);
        this.avanzaIzquierda(gas);
    }
    

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    private String Color;
    private double Precio;
    
     public String avanza(double gas){
        
        return "Automovil Avanzando";
    }
    public String avanzaDerecha(double gas){
       
        return "Avanzando hacia la derecha";
    }
    public String avanzaIzquierda(double gas){
        
        return "Avanzando hacia la Izquierda";
    } 
}
