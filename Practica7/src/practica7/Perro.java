/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7;

/**
 *
 * @author donov
 */
public class Perro extends Animal {
    public Perro(){
    }
    public Perro(String comidap){
        this.comer(comidap);
    }
    

    @Override
    public String caminar(double caminar) {
        return "El perro a caminado "+ caminar+ " pasos";
    }
    
   
    
    public String ladrar(){
        return "Perro ladrando *guaf*";
    }
    
     private void comer(String comidap){
        System.out.println("El perro esta comiendo "+comidap);
    }

    public String color(String color) {
        return "El perro es de color "+color;
       
    }
}
