
import java.awt.BorderLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samv
 */
public class prueba {
    
    
    @Override
   public String toString(){
       return "Si sirve mi método";
   }
   
   public void finalize(){
        System.out.println("Finalizo mi método");
   }
    
    public static void main(String[] args) {
        
           prueba p = new prueba();
        System.out.print(p);
        
        p = null;
    }
}
