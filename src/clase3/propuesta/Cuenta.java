/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.propuesta;

/**
 *
 * @author samv
 */
public class Cuenta {
     private String titular;
    private double cantidad;
    
    public Cuenta(){
    }

    public void mostrar(){
        System.out.println("Titular: "+this.titular+" cantidad: "+this.cantidad);
    }
    
    public void ingresar(double cantidad){
        if (cantidad>0) {
            this.cantidad=this.cantidad+cantidad;
        } 
    }
    
    public void retirar(double cantidad){
        if (this.cantidad>cantidad) {
            this.cantidad = this.cantidad-cantidad;
        }else{
            System.out.println("No dispone de esa cantidad!");
        }
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }    
}
