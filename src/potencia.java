
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samv
 */
public class potencia {
    public int potencia(int numero,int exponente){
       if(exponente == 2)
           return numero * numero;
       else if(exponente == 1)
           return numero;
       else if(exponente == 0)
            return 1;
       else
       {
        return potencia(numero,exponente-1)*numero;
       }
    }
    
    
    public static void main(String[] args) {
        potencia p = new potencia();
        
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        int potencia = scanner.nextInt();
        
        int resultado = p.potencia(numero, potencia);
        
        System.out.println("El resultado es "+resultado);
        
        
        //Clase math
        
        double mathResultado = Math.pow(numero, potencia);
        
        System.out.println("Con clase math es "+mathResultado);
        
    }
}
