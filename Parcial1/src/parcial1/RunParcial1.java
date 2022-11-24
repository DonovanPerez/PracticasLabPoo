/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1;

/**
 *
 * @author donov
 */
public class RunParcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Telefono[] movil = new Telefono[5];
        Radio[] radio = new Radio[5];
        Computadora[] compu = new Computadora[5];
        
        System.out.println("Telefono----------------");
        for (int i = 0; i < movil.length; i++) {
            movil[i] = new Telefono();
            movil[i].setMarca("Nokia - "+ Integer.toString(i));
            movil[i].setModelo("E60 - "+Integer.toString(i));
           
        }
        for(Telefono tl: movil){
        System.out.println(tl.getMarca());
        System.out.println(tl.getModelo());
        System.out.println(tl.encender());
        System.out.println(tl.apagar());
        System.out.println(tl.hacerLlamada("Leo"));
        System.out.println(tl.hacerLlamada("8123456765"));
       }
        
        System.out.println("\nRadio----------------");
         for (int i = 0; i < radio.length; i++) {
            radio[i] = new Radio();
            radio[i].setMarca("Sony - "+ Integer.toString(i));
            radio[i].setModelo("XAV-AX5000 - "+Integer.toString(i));
         }
        for(Radio rd: radio){
        System.out.println(rd.getMarca());
        System.out.println(rd.getModelo());
        System.out.println(rd.encender());
        System.out.println(rd.apagar());
        System.out.println(rd.subirVolumen());
        System.out.println(rd.bajarVolumen());
       }
        
        System.out.println("\nComputadora--------------");
        for (int i = 0; i < compu.length; i++) {
            compu[i] = new Computadora();
            compu[i].setMarca("Dell - "+ Integer.toString(i));
            compu[i].setModelo("Inspiron 14 - "+Integer.toString(i));
         }
        for(Computadora cm: compu){
        System.out.println(cm.getMarca());
        System.out.println(cm.getModelo());
        System.out.println(cm.encender());
        System.out.println(cm.apagar());
        System.out.println(cm.subirVolumen());
        System.out.println(cm.bajarVolumen());
        System.out.println(cm.AbrirBuscador());
        System.out.println(cm.DescargarArchivo());
        System.out.println(cm.hacerLlamada("Irving"));
        System.out.println(cm.hacerLlamada("8116670922"));
            
       }

        
        
    }
    
}
