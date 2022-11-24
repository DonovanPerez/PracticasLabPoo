/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author donov
 */
public class Telefono extends ComponentesE implements IcomponentesE, IComponentesTelefono{
    
    

    @Override
    public String encender() {
        return "Telefono Encendido";
    }

    @Override
    public String hacerLlamada(String nomcontacto) {
       return "Llamando a " +nomcontacto;
    }

    @Override
    public String hacerLlamada(int numContacto) {
         return "Llamando a"+Integer.toString(numContacto);
    }

    @Override
    public String apagar() {
        return "Telefono Apagado";
    }
    
}
