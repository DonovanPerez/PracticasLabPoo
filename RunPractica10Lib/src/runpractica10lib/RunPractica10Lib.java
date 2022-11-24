/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runpractica10lib;

/**
 *
 * @author donov
 */
public class RunPractica10Lib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculador casio = new Calculador();
        System.out.println("El resultado de la suma es: "+casio.suma(11, 11));
        System.out.println("El resultado de la resta es: "+casio.resta(10, 8));
        System.out.println("El resultado de la multipicacion es: "+casio.multiplicacion(4, 3));
        System.out.println("El resultado de la division es: "+casio.division(39, 3));
    }
    
}
