/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica9;

import java.util.ArrayList;
import java.util.Scanner;

public class RunPractica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Obj = new Scanner(System.in);
        
        ArrayList<Person> pe = new ArrayList<Person>();
        Person p = new Person();
        pe.add(p);
        
        System.out.println("Ingrese el nombre de la persona");
        String name = Obj.nextLine();
        System.out.println("Ingrese el address de la persona");
        String address = Obj.nextLine();
        p.setAddress(address);
        p.setName(name);
        for(Person l : pe){
            System.out.println(l.toString());
        }
        
           ArrayList<Staff> st = new ArrayList<Staff>();
        Staff t = new Staff();
        st.add(t);
        
        System.out.println("Ingrese el nombre de la persona");
        String n = Obj.nextLine();
        System.out.println("Ingrese el address de la persona");
        String a = Obj.nextLine();
        System.out.println("Ingrese la escuela");
        String school= Obj.nextLine();
        System.out.println("Ingrese el pago");
        double pay = Obj.nextDouble();
        t.setAddress(a);
        t.setName(n);
        t.setSchool(school);
        t.setPay(pay);
        for(Person d : st){
            System.out.println(d.toString());
        }
        
            ArrayList<Student> ts = new ArrayList<Student>();
        Student s = new Student();
        ts.add(s);
        
        System.out.println("Ingrese el nombre de la persona");
        String na = Obj.next();
        System.out.println("Ingrese el address de la persona");
        String ad = Obj.next();
        System.out.println("Ingrese el año en el que va");
        int year = Obj.nextInt();
        System.out.println("Ingresa su carrera");
        String pm = Obj.nextLine();
        System.out.println("Ingrese la tarifa del pago");
        double fee = Obj.nextDouble();
        s.setAddress(ad);
        s.setName(na);
        s.setProgram(pm);
        s.setYear(year);
        s.setFee(fee);
        for(Person v : ts){
            System.out.println(v.toString());
        }
    }
    
}
