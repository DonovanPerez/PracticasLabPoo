/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author donov
 */
public class Gorrion extends Animal {
    public Gorrion(){
    }
    public Gorrion(String comidag){
        this.comer(comidag);
    }
    

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String caminar(double caminar) {
       return "El gorrion camino "+caminar+" pasos";
    }
    
    private String color;
    
   private void comer(String comidag){
        System.out.println("El gorrion esta comiendo "+comidag);
    }
}
