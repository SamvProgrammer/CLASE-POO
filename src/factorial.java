/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samv
 */
public class factorial {
    
    
    public double factorial(double numero){
      
        if(numero == 1) return numero;
        return numero * factorial(numero - 1);
      
    }
   
    
    public static void main(String[] args) {
        factorial f = new factorial();
        
       double resultado =  f.factorial(6);
       
        System.out.println(resultado);
    }
}
