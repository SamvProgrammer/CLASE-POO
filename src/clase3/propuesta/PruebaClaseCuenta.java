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
public class PruebaClaseCuenta {
    public static void main(String[] args) {
        Cuenta obj = new Cuenta();
        
        obj.setTitular("luis");
        obj.setCantidad(100.10);
        
        obj.mostrar();
        
        obj.ingresar(20.00);
        System.out.println("Cantidad en cuenta: "+obj.getCantidad());
        
        obj.retirar(100.0);
        System.out.println("Cantidad en cuenta: "+obj.getCantidad());
        
        obj.retirar(50);
        System.out.println("Cantidad en cuenta: "+obj.getCantidad());
    }
}
