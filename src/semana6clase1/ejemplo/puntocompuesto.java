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

//Extends ... 
public class puntocompuesto extends puntos{
    
    public puntocompuesto(){
        super();
        System.out.println("Constructor subclase");
    }
    
    
    public puntocompuesto(int x , int y){
      super(x,y);
        System.out.println("Constuctor subclase");
    }

   // @Override
    public void mostrarmensaje() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Aqyu realiza la accion");
    }

    @Override
    public void metodo1() {
        System.out.println("metodo 1");
    }

    
    
    
    
    
}
