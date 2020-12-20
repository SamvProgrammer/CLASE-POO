/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6clase1;

/**
 *
 * @author samv
 */
public class principal {
    public static void main(String[] args) {
        persona p1 = new persona();
         persona p2 = new persona();
          animal n1 = new animal();
        
        System.gc();
       
        p1 = p2;
       
        System.gc();
      
        n1 = null;
        
        System.gc();
        
    }
}
