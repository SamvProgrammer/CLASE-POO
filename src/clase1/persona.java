/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author samv
 */
 public class persona {
    private String nombre; //Vairables de instancia
    private int edad; //Variable de instancia
    
    private static String apellido;
    
    public persona(String nombre,int edad,double suma){
        System.out.println("ijdfi");
    }
    //Ejecuta cuando se inicializa la clase
  
   public void setNombre(String nombre){ //Método de instancia que no retorna nada
     this.nombre = nombre;
   }
   
   public String getNombre(){  //Método de instancia que retorna una cádena String
    return this.nombre;
   }
   
   
   public void setEdad(int edad){
     this.edad = edad;
   }
   
   public int getEdad(){
    return this.edad;
   }
   
   
   public static void metodoClase(){
   
   }
    
}
