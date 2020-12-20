/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6clase2.operaciones;

import java.util.Scanner;

/**
 *
 * @author samv
 */
public class princiapal {
    public static void main(String[] args) {
        int opcion = 0;
        
        operacion p1 = null;
        
        do{
        
            System.out.println("Menu");
            System.out.println("Elegir operacion\n1.-Suma\n2.-Resta\n3 salir");
            opcion = new Scanner(System.in).nextInt();
            
            
            
            switch(opcion){
                case 1:
                    p1 = new suma();
                    break;
                case 2:
                    p1 = new resta();
                    break;
                    
                default:
                    break;
            }
            
            
            p1.haceroperacion();
            
            
        }while(opcion != 3);
    }
}
