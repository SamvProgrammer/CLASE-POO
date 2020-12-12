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
public class eddie {//Si se puede versionar mi repositorio
    public static int factorial(int num){
        return (num==0 || num==1) ? 1 : num*factorial(num-1);
    }
    
    public static int potencia(int base, int exponente){
        return (exponente==0) ? 1 : base*potencia(base,exponente-1);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Factorial de ");
        System.out.println(factorial(6));
        
        
        System.out.println("Potecnia");
        
        System.out.println(potencia(2,1));
        
        System.out.println("Potecnia con la clase Math");
        
        System.out.println(Math.pow(2,1));
        
        
          System.out.println(potencia(2,1));
        
        System.out.println("Potecnia con la clase Math");
        
        System.out.println(Math.pow(2,1));
        
        
          System.out.println(potencia(2,0));
        
        System.out.println("Potecnia con la clase Math");
        
        System.out.println(Math.pow(2,0));
    }
}
