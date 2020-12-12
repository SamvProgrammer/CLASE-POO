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
public class Persona {

    private String nombre;
    private int edad;
    private String dni;

    public Persona() {
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre + " edad: " + this.edad + " Dni: " + this.dni);
    }

    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
