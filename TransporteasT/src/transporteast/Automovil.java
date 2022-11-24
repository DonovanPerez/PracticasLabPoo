/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporteast;

/**
 *
 * @author donov
 */
public class Automovil extends Transporte {

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

   @Override
    public String avanzar() {
        return "Automovil Avanzando";
    }
    private String Color;
    
}
