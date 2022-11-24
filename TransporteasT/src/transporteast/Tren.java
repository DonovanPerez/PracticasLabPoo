/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporteast;



/**
 *
 * @author Aula 404
 */
public class Tren extends Transporte{

    /**
     * @return the carga
     */
    public String getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(String carga) {
        this.carga = carga;
    }

    @Override
    public String avanzar() {
        return "Tren Avanzando";
    }
    private String carga;
}
