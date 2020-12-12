/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5clase1.tarea;

/**
 *
 * @author samv
 */
public class fibonaci {
    public  String nombre = "santaigo";
    //incial = 0 siguiente = 1
    public  void fibonaci(int inicial,int siguiente){
    
        if(inicial > 1000) return;
        
        System.out.print(inicial+" ");
        fibonaci(siguiente, siguiente+inicial);
    }
    
    public static void main(String[] args) {
        
        
        //0 1 1 2 3 5 8 13 21 <= 1000
        
        
        fibonaci fb = new fibonaci();
        fb.fibonaci(0,1);
        
         fibonaci fb1 = new fibonaci();
         fb1.nombre = "mariscal";
        fb.fibonaci(0,1);
        
         fibonaci fb2 = new fibonaci();
        fb.fibonaci(0,1);
         fibonaci fb3 = new fibonaci();
        fb.fibonaci(0,1);
        
        
        
        
        
    }
}
