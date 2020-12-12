/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author samv
 */
public class claseprincipal {
    public static void main(String[] args) {
        //Vamos a crear 3 gatitos, uno siames, uno angora, normal
        //Vamos a crear 2 perritos pug, chichiahua
        
        //Primera instancia del tipo gatito
        gatito g1 = new gatito();
        g1.setNombre("Minino");
        g1.setAlimento("Wiskas");
        g1.setDias(40);
        
        //Segunda instancia del tipo gatito
        
        gatito g2 = new gatito();
        g2.setNombre("michi");
        g2.setAlimento("purina");
        g2.setDias(30);
        
        //tercera  instancia del tipo gatito
        
        gatito g3 = new gatito();
        g3.setNombre("picachu");
        g3.setAlimento("carne");
        g3.setDias(50);
        
        
      //  String nn = gatito.estado;
        
        g1.setEstado("MExico");
        g2.setEstado("Peru");
        
        System.out.println(g1.getEstado());
        System.out.println(g2.getEstado());
        System.out.println(g3.getEstado());
       
        
//        System.out.println(g1.traerDescripcion());
//        System.out.println(g2.traerDescripcion());
//        System.out.println(g3.traerDescripcion());
//        
        
        perrito p1 = new perrito();
        p1.setNombre("sultan");
        p1.setRaza("pug");
        p1.setDias(43);
        
        perrito p2 = new perrito();
        p2.setNombre("mm1");
        p2.setRaza("chichuahua");
        p2.setDias(3);
        
//        System.out.println(p1.descripcion());
//        System.out.println(p2.descripcion());
        
        
        /*
          Variables instancia ---> unicas que no se repetiran cuando se creaa un objeto con new...
        
           Variable de clase o métodos de clase --> todos los objetos creados comparten la variable o metodo de clase...
        
        
        variables de instancia metodos .-- metodos o variabels que no son campartidas con otros objetos
        
        vairbales de clase ... todos los objketos creados apartir de la clase que contiene la palabra resevada static
        varibale de clase.... compartiras el mismo dato.. si o si...
        
        */
        
        
        
    }
}
