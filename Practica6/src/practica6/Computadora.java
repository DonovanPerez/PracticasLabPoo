/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author donov
 */
public class Computadora extends ComponentesElectronicos implements IOtrosComponentesE{

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

    /**
     * @return the ram
     */
    public String getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * @return the pantalla
     */
    public String getPantalla() {
        return pantalla;
    }

    /**
     * @param pantalla the pantalla to set
     */
    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }
    
    private String color;
    private String ram;
    private String pantalla;

    @Override
    public String encender() {
        return "Computadora Encendida";
    }

    @Override
    public String apagar() {
        return "Computadora Apagada";
    }
    
}
