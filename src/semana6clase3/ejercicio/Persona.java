/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6clase3.ejercicio;

/**
 *
 * @author samv
 */
public class Persona {
    protected String nombre;
    protected String sexo;
    protected int edad;
    
    public Persona(String nombre,String Sexo,int edad){
       this.nombre = nombre;
       this.sexo = Sexo;
       this.edad = edad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre:%s\tSexo:%s\tEdad:%s",nombre,sexo,edad);
        
        return cadena; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
