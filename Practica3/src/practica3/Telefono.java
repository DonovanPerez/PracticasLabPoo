/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;


/**
 *
 * @author donov
 */
public class Telefono extends DispositivosElectronicos implements OperacionesAritmeticas {

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    private String modelo;
    

     @Override
    public String encender() {
        return "Telefono Encendido";
    }
    
    public String hacerLlamadaN(String num){
        return ( num);
    }
    
     public String hacerLlamada(String contacto){
         return "Llamando a "+ contacto ;
     }
     public String terminaLlamada(){
         return "Llamada terminada";
     }
     public String buscarContacto(String Contacto){
         return "Contacto "+ Contacto+" encontrado";
     }
    @Override
    public String apagar(){
        return ("Dispositivo Apagado");
    }
           
    @Override
    public double suma(double a, double b) {
         return a+b;
    }

    @Override
    public double resta(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplicacion(double a, double b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        return a/b;
    }

    
    
}
