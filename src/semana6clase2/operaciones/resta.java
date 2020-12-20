/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6clase2.operaciones;

/**
 *
 * @author samv
 */
public class resta extends operacion{

    @Override
    public void haceroperacion() {
        System.out.println("La resta es "+(super.n1 - super.n2));
    }
    
}
