/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6clase2;

/**
 *
 * @author samv
 */
public class perro extends animal{
     protected String nombre;
    public perro(){
        super();
        
        
        this.metodo1();
       
        
      //  System.out.println("Se ejecuta el constructor hijo");
    }

    @Override
    public void metodo1() {
        System.out.println("Metodo hijo");
    }
    
    
    
}
