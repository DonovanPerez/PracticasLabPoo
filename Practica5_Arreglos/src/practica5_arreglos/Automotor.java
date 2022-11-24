/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5_arreglos;

/**
 *
 * @author donov
 */
public class Automotor {

    /**
     * @return the gas
     */
    public double getGas() {
        return gas;
    }

    /**
     * @param gas the gas to set
     */
    public void setGas(double gas) {
        this.gas = gas;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
     
    private String Modelo;
    private String Marca;
    private double gas;
    
    public String frenar(){
        return "Automovil frenando";
    }
    
   
    
}
