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

//DTA estructura datos... 
public class persona {
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public void finalize(){
        System.out.println("Se destruye persona");
    }
    
    
    
    
  
}
