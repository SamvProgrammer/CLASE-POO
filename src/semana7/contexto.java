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
public class contexto {
    
    private comision comision;
    
    public contexto(comision objrecibido){
       this.comision = objrecibido;
    }
    
    
    public double ejecutarCOmision(double cantidad){
        return comision.calcularComision(cantidad);
    }
    
    
}
