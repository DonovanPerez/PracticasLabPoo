/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica6;

/**
 *
 * @author donov
 */
public class Telefono extends ComponentesElectronicos implements IOtrosComponentesE {

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
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the TipoCargador
     */
    public String getTipoCargador() {
        return TipoCargador;
    }

    /**
     * @param TipoCargador the TipoCargador to set
     */
    public void setTipoCargador(String TipoCargador) {
        this.TipoCargador = TipoCargador;
    }
    
    private String color;
    private String precio;
    private String TipoCargador;

    @Override
    public String encender() {
        return "Telefono encendido";
    }

    @Override
    public String apagar() {
        return "Telefono Apagado";
    }
    
    
    
}
