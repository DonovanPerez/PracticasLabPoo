/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial1;

/**
 *
 * @author donov
 */
public class Computadora extends ComponentesE implements IcomponentesE, IComponentesCompu, IComponentesTelefono, IComponentesRadio{

    @Override
    public String encender() {
        return "Computadora Encendida";
    }

    @Override
    public String apagar() {
        return "Computadora Apagada";
    }

    @Override
    public String AbrirBuscador() {
        return "Abriendo el bsucador";
    }

    @Override
    public String DescargarArchivo() {
        return "Descargando Archivo";
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
    public String subirVolumen() {
     return "Subiendo Volumen";   
    }

    @Override
    public String bajarVolumen() {
        return "Bajando Volumen";
    }
    
}
