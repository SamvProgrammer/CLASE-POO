/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6clase2.interfaces;

/**
 *
 * @author samv
 */
public class principal {
    public static void main(String[] args) {
        carril c1 = new carril();//la clase que cachara la interfaz en su método quevolar
        
        
        aeropuerto avion1 = new avion();
        aeropuerto paloma1 = new paloma();
        
        
        
        c1.comovuela(paloma1);
        c1.comovuela(avion1);
    }
}
