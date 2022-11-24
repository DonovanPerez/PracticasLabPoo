/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporteast;

/**
 *
 * @author donov
 */
public class Barco extends Transporte{

    /**
     * @return the tripulacion
     */
    public String getTripulacion() {
        return tripulacion;
    }

    /**
     * @param tripulacion the tripulacion to set
     */
    public void setTripulacion(String tripulacion) {
        this.tripulacion = tripulacion;
    }

     @Override
    public String avanzar() {
        return " Avion Avanzando";
    }
    
    private String tripulacion;
    
}
