/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dudas;

/**
 *
 * @author samv  estrategia, singleton, fabrica...
 */
public class multiplicacion  extends operacion {

    @Override
    public double realizarOperacion(double n1, double n2) {
        return n1 * n2;
    }
    
}
