/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora2;
import java.util.Scanner;
/**
 *
 * @author donov
 */
public class RunCalculadora2 {
    static Scanner Obj = new Scanner(System.in); 
    static Scanner Obj1 = new Scanner(System.in); 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         System.out.println("Introduce tu primer valor");
    double v1 = Obj.nextDouble();
    System.out.println("Introduce tu segundo valor");
    double v2 = Obj1.nextDouble();
    
     Calculadora casio = new Calculadora();
     CalculadoraCientifica casioC = new CalculadoraCientifica();
     
    System.out.println("\nClase Calculadora:");
    double x = casio.suma(v1, v2);
    System.out.println("Suma de "+v1+"+"+v2+"="+x);
    double y = casio.resta(v1, v2);
    System.out.println("Resta de "+v1+"-"+v2+"="+y);
    double z = casio.multiplicacion(v1, v2);
    System.out.println("Multiplicacion de "+v1+"*"+v2+"="+z);
    double d = casio.division(v1, v2);
    System.out.println("Division de "+v1+"/"+v2+"="+d);
    
    
    
    System.out.println("\nClase Calculadora Cientifica:");
    double q = casioC.suma(v1, v2);
    System.out.println("Suma de "+v1+"+"+v2+"="+q);
    double g = casioC.resta(v1, v2);
    System.out.println("Resta de "+v1+"-"+v2+"="+g);
    double p = casioC.multiplicacion(v1, v2);
    System.out.println("Multiplicacion de "+v1+"*"+v2+"="+p);
    double o = casioC.division(v1, v2);
    System.out.println("Division de "+v1+"/"+v2+"="+o);
    double l = casioC.raiz(v1);
    System.out.println("Raiz de "+v1+"="+l);
    double v = casioC.raiz(v2);
    System.out.println("Raiz de "+v2+"="+v);
    double s = casioC.potencia(v1, v2);
    System.out.println("Potencia de "+v1+" elevado a la "+v2+"="+s);
    double t = casioC.potencia(v2, v1);
    System.out.println("Potencia de "+v2+" elevado a la "+v1+"="+t);
    
        
       
    }
    
}
