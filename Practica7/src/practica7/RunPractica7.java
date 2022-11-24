/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7;

import java.util.Scanner;

/**
 *
 * @author donov
 */
public class RunPractica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("-----Gato------");
        System.out.println("Introduce lo que come su gato");
        String comida= Obj.next();
        Gato g = new Gato(comida);
        g.setEdad(3);
        System.out.println("Edad "+g.getEdad());
        g.setRaza("Siames");
        System.out.println("Raza "+g.getRaza());
        g.setNombre("Quina");
        System.out.println("Nombre "+g.getNombre());
        System.out.println("Cuanto camino su gato?");
        double gt = Obj.nextDouble();
        System.out.println(g.caminar(gt));
        System.out.println(g.maullar());
        
        System.out.println("------Perro-------");
        System.out.println("Introduce lo que come su perro");
        String comidap=Obj.next();
        Perro p = new Perro(comidap);
        p.setEdad(4);
        System.out.println("Edad "+g.getEdad());
        p.setNombre("Toby");
        System.out.println("Nombre "+p.getNombre());
        System.out.println(p.color("Blanco"));
        System.out.println("Cuanto camino su perro?");
        double pt = Obj.nextDouble();
        System.out.println(p.caminar(pt));
        System.out.println(p.ladrar());
        
        System.out.println("------Gorrion--------");
        System.out.println("Introduce lo que come su gorrion");
        String comidag= Obj.next();
        Gorrion pg= new Gorrion(comidag);
        pg.setEdad(1);
        System.out.println("Edad "+pg.getEdad());
        pg.setColor("Cafe");
        System.out.println("Color "+pg.getColor());
        pg.setNombre("Piolin");
        System.out.println("Nombre "+pg.getNombre());
        System.out.println("Cuanto camino su gorrion?");
        double pp= Obj.nextDouble();
        System.out.println(pg.caminar(pp));
        
        System.out.println("----------cocodrilo-------");
        System.out.println("Introduce lo que come su cocodrilo");
        String comidac = Obj.next();
        Cocodrilo cp = new Cocodrilo(comidac);
        cp.setEdad(4);
        System.out.println("Edad "+cp.getEdad());
        cp.setTamaño("Grande");
        System.out.println("Tamaño "+cp.getTamaño());
        cp.setNombre("Yoda");
        System.out.println("Nombre "+cp.getNombre());
        System.out.println("Cuanto camino su cocodrilo?");
        double cc = Obj.nextDouble();
        System.out.println(cp.caminar(cc));
        
        System.out.println("--------Jaguar--------");
        System.out.println("Introduce lo que come su jaguar");
        String comidaj = Obj.next();
        Jaguar j = new Jaguar(comidaj);
        j.setEdad(2);
        System.out.println("Edad "+j.getEdad());
        j.setSexo("Macho");
        System.out.println("El jaguar es "+j.getSexo());
        j.setNombre("Morty");
        System.out.println("Nombre "+j.getNombre());
        System.out.println("Cuanto camino su jaguar?");
        double jj = Obj.nextDouble();
        System.out.println(j.caminar(jj));
        
        
        double sum = jj+cc+pp+pt+gt;
        double prom=sum/5;
        
        System.out.println("El promedio caminado por los animales es: "+prom+" pasos");
    } 
}
