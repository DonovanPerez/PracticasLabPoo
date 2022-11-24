/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporteast;



/**
 *
 * @author Aula 404
 */
public class Avion  extends Transporte{

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
    public String avanzar() {
        return " Avion Avanzando";
    }
    private String tamaño;
}
