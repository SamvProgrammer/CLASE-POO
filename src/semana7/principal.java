/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7;

/**
 *
 * @author samv
 */
public class principal {
 
    
    public static void main(String[] args) {
        /*
          una ´persona tiene diferente comisión dependiendo de las ganancias que gane
        
          0 a 1000 pesos  comision basica
        
          1000 a 2000 comision media
        
           2000 comision full
          1
        */
        
        contexto contextoObj = null;
        
        
        //Comisióin basica
        
        contextoObj =  new contexto(obtenertipoComision(700));
        
        System.out.println("Comision basica"+contextoObj.ejecutarCOmision(700));
        
        
        //Comisón media
        
        contextoObj =  new contexto(obtenertipoComision(1700));
          System.out.println("Comision basica"+contextoObj.ejecutarCOmision(1700));
          
           //Comisón full
        
            contextoObj =  new contexto(obtenertipoComision(11700));
          System.out.println("Comision basica"+contextoObj.ejecutarCOmision(11700));
        
        
    }
    
    
    public static comision obtenertipoComision(double cantidad){
        comision c1 = null;
        
        if(cantidad >= 0 && cantidad <= 1000 ){
            c1 = new comisionbasica();
        }else if(cantidad >1000 && cantidad <= 2000){
           c1 = new comisionNormal();
        }else{
           c1 = new comisionFull();
        }
        
        
        
        
        return  c1;
    }
    
}
