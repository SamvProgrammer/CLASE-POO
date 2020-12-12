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
public class PruebaClasePersona {
    public static void main(String[] args) {
        Persona per = new Persona();
        
        per.setNombre("Luis");
        per.setDni("65497820");
        per.setEdad(18);
        
        per.mostrar();
        System.out.println("Mayor de edad: "+per.esMayorDeEdad(18));
    }
}
