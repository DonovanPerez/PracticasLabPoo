/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;
import java.util.Scanner;

/**
 *
 * @author donov
 */
public class RunPractica3 {
    static Scanner Obj = new Scanner(System.in);
    static Scanner Obj1 = new Scanner(System.in); 
    static Scanner Obj3 = new Scanner(System.in); 
    static Scanner Obj4 = new Scanner(System.in); 
    static Scanner Obj5 = new Scanner(System.in); 
    static Scanner Obj6 = new Scanner(System.in); 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Telefono samsung = new Telefono();
        Calculadora casio = new Calculadora();
        
        System.out.println("Telefono:");
        samsung.setMarca("Samsung");
        System.out.println(samsung.getMarca());
        samsung.setModelo("A30s");
        System.out.println(samsung.getModelo());
        samsung.setColor("Verde suave");
        System.out.println(samsung.getColor());
        System.out.println(samsung.encender());
        System.out.println("Escriba el contacto que desea buscar");
        String nom = Obj.nextLine();
        System.out.println(samsung.buscarContacto(nom));
        System.out.println("Escriba el numero del contacto");
        String num = Obj1.nextLine();
        System.out.println(samsung.hacerLlamada(nom)+ ":"+ samsung.hacerLlamadaN(num));
        System.out.println(samsung.terminaLlamada());
        System.out.println("\nIngrese 2 valores para realizar operaciones basicas:");
        
        double v1 = Obj3.nextDouble();
        double v2 = Obj4.nextDouble();
        
        double x = samsung.suma(v1, v2);
        System.out.println("Suma de "+v1+"+"+v2+"="+x);
        double y = samsung.resta(v1, v2);
        System.out.println("Resta de "+v1+"-"+v2+"="+y);
        double z = samsung.multiplicacion(v1, v2);
        System.out.println("Multiplicacion de "+v1+"*"+v2+"="+z);
        double d = samsung.division(v1, v2);
        System.out.println("Division de "+v1+"/"+v2+"="+d);
        
        System.out.println("\nCalculadora:");
        casio.setMarca("Casio");
        System.out.println(casio.getMarca());
        casio.setModelo("fx-95ES PLUS");
        System.out.println(casio.getModelo());
        casio.setColor("Gris");
        System.out.println(casio.getColor());
        
        System.out.println("\nIngrese 2 valores para realizar operaciones basicas:");
        
        double v3 = Obj5.nextDouble();
        double v4 = Obj6.nextDouble();
        
        double q = casio.suma(v3 , v4);
        System.out.println("Suma de "+v3+"+"+v4+"="+q);
        double w = casio.resta(v1, v2);
        System.out.println("Resta de "+v3+"-"+v4+"="+w);
        double e = casio.multiplicacion(v3, v4);
        System.out.println("Multiplicacion de "+v3+"*"+v4+"="+e);
        double r = casio.division(v3, v4);
        System.out.println("Division de "+v3+"/"+v4+"="+r);
        
        System.out.println("\nOperaciones Avanzadas:\n");
        double l = casio.raiz(v3);
        System.out.println("Raiz de "+v3+"="+l);
        double v = casio.raiz(v4);
        System.out.println("Raiz de "+v4+"="+v);
        double s = casio.potencia(v3, v4);
        System.out.println("Potencia de "+v3+" elevado a la "+v4+"="+s);
        double t = casio.potencia(v3, v4);
        System.out.println("Potencia de "+v3+" elevado a la "+v4+"="+t);

        
    }
    
}
