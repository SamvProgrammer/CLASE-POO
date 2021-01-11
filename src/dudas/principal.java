/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dudas;

/**
 *
 * @author samv
 */
public class principal {
    
    
    public static void main(String[] args) {
        operacion op = new suma();
        
        double n1 = 5;
        double n2 = 19;
        
        
        System.out.println(op.realizarOperacion(n1, n2));
        
        
        
        op = new resta();
        
        System.out.println(op.realizarOperacion(n1, n2));
        
        op = new multiplicacion();
        
        
        System.out.println(op.realizarOperacion(n1, n2));
        
        
        
        
    }
}
