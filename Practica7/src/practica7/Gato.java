/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author donov
 */
public class Gato extends Animal{
    public Gato(){
}
    public Gato(String comida){
        this.comer(comida);
    }
    

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    private String raza;
    
    @Override
    public String caminar(double caminar) {
        
        return "El gato camino "+caminar+" pasos";
        
    }
    
    public String maullar(){
        return "Gato maullando *miau*";
    }
    
    private void comer(String comida){
        System.out.println("El gato esta comiendo "+comida);
    } 
}
