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


//DTA
public  class animal {
    protected String nombre;
    protected String raza;
    
    public final double PI = 3.1416;
    
    public animal(){
       nombre = "Sin nombre";
       raza = "Sin raza";
       
      // System.out.println("Se ejecuta el constructor padre");
       
       
    }

    @Override
    public String toString() {
        String cadena = String.format("Mi nombre es %s y mi raza es %s",this.nombre,this.raza);
        
        return cadena;
    }
    
    
    public  void metodo1(){
        System.out.println("metodo padre");
    }
    
    
    
   
}
