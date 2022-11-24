/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author donov
 */
public class RunCalculadora {
    static Scanner Obj = new Scanner(System.in); 
    static Scanner Obj1 = new Scanner(System.in); 
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
     Operaciones op = new Operaciones();
     
    System.out.println("Introduce tu primer valor");
    double v1 = Obj.nextDouble();
    System.out.println("Introduce tu segundo valor");
    double v2 = Obj1.nextDouble();
    
    System.out.println("Clase Operaciones:");
    
    double x = op.suma(v1, v2);
    System.out.println("Suma de "+v1+"+"+v2+"="+x);
    double y = op.resta(v1, v2);
    System.out.println("Resta de "+v1+"-"+v2+"="+y);
    double z = op.multiplicacion(v1, v2);
    System.out.println("Multiplicacion de "+v1+"*"+v2+"="+z);
    double d = op.division(v1, v2);
    System.out.println("Division de "+v1+"/"+v2+"="+d);
    
    OperacionesAvanzadas opa = new OperacionesAvanzadas();
    System.out.println("Clase Operaciones Avanzadas:");
    
    double l = opa.raiz(v1);
    System.out.println("Raiz de "+v1+"="+l);
    double v = opa.raiz(v2);
    System.out.println("Raiz de "+v2+"="+v);
    double s = opa.potencia(v1, v2);
    System.out.println("Potencia de "+v1+" elevado a la "+v2+"="+s);
    double q = opa.potencia(v2, v1);
    System.out.println("Potencia de "+v2+" elevado a la "+v1+"="+q);
    }
}
