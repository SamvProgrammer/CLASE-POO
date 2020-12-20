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
public abstract class operacion {
    protected int n1,n2;
    public operacion(){
      n1 = 0; n2 = 0;
    }
    
    public operacion(int n1,int n2){
      this.n1 = n1;
      this.n2 = n2;
    }
    
    
    public abstract void haceroperacion();
}
