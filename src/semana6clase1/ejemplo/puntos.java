/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6clase1.ejemplo;

/**
 *
 * @author samv
 */
public abstract  class puntos {
   protected int x,y;
    
    public puntos(){
       this.x = 0;
       this.y = 0;
       
        System.out.println("Constructor superclase");
    }
    
    
    public puntos(int x, int y){
       this.x = x;
       this.y = y;
       System.out.println("Constructor superclase");
    }
    
    
    public abstract void metodo1();
   
    
}
