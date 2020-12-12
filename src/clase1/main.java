/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author samv
 */
public class main {
    public static void main(String[] args) { //método de clase....
     
        //instanciar el objeto...
       
       
//        
//        persona p1 = new persona();
//        p1.setEdad(4);
//        p1.setNombre("Santiago");
//        
//        
//        System.out.println("Mi nombre es "+p1.getNombre()+ " mi edad "+p1.getEdad());
//       
        /*
            clase
                atributos
                métodos
                contructor... (incialzador de la clase)
        
        */
      
        persona p = new persona("santiAgo",4,5.6);
        ejemplo1 p1 = new ejemplo1();
        
        System.out.println(p1.suma());
        
        
        System.out.println("Ejercicio 2");

        
        ejemplo2 p3 = new ejemplo2();
         p3.hacerSuma();
         
         System.out.println(p3.resultado);
     
    }
}
