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
public class comisionFull implements comision{

    @Override
    public double calcularComision(double cantidad) {
        System.out.println("Tiene comision al full");
        return cantidad * 3.5;
    }
    
}
