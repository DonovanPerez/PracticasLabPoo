/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author donov
 */
public class Radio extends ComponentesE implements IcomponentesE, IComponentesRadio{

    @Override
    public String encender() {
        return "Radio Encendido";
    }

    @Override
    public String apagar() {
        return "Radio apagado";
    }

    @Override
    public String subirVolumen() {
        return "Volumen subido";
    }

    @Override
    public String bajarVolumen() {
        return "Volumen bajado";
    }
    
}
