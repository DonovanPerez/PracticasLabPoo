/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author donov
 */
public class Jaguar extends Animal{
    public Jaguar(){
    }
    public Jaguar(String comidaj){
        this.comer(comidaj);
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    

    @Override
    public String caminar(double caminar) {
       return "Su jaguar camino "+caminar+" pasos";
    }
    
    private String sexo;
    
     private void comer(String comidaj){
        System.out.println("El jaguar esta comiendo "+comidaj);
    }
}
