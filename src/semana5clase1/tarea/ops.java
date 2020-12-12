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
public class ops {
    private static int factorial(int num) {
      return num == 0 ? 1 : num * factorial(num - 1);
   }
   private static double potencia(double num, double exponente) {
      return  exponente == 0 ? 1 : num * potencia(num, exponente - 1);
   }
   public static void main(String[] args) {
       System.out.println("Factorial");
      System.out.println(factorial(3));//3x2x1
      
      
   }
}
