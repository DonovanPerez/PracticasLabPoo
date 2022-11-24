/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author donov
 */
public class Cocodrilo extends Animal{
    public Cocodrilo(){
    }
    public Cocodrilo(String comidac){
        this.comer(comidac);
    }


    /**
     * @return the tamaño
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String caminar(double caminar) {
        return "El cocodrilo camino "+caminar+" pasos";
    }
    
    private String tamaño;
    
    private void comer(String comidac){
        System.out.println("El cocodrilo esta comiendo "+comidac);
    }
}
