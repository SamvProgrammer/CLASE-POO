/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6clase3.ejercicio;

import java.util.Scanner;

/**
 *
 * @author samv
 */
public class principal {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        
        Persona[] listaPersona = new Persona[10];
        Estudiante[] listaEstudiante = new Estudiante[10];
        Empleado[] listaEmpleado = new Empleado[10];
        Estudiante_empleado[] listaEstudiante_empleado = new Estudiante_empleado[10];
        
        int contadorPersona = 0;
        int contadorEstudiante = 0;
        int contadorEmpleado = 0;
        int estudianteEmpleado = 0;
        
        int opcion = 0;
        do {

            String cosasMenu = "Menu\nSeleccionar Opcion\n1Generar Persona en común\n2 Generar Estudiante\n"
                    + "3 Generar Empleado\n4 Generar Estudiante_empleado";

            System.out.println(cosasMenu);
            
            
            opcion = sc.nextInt();
            
            System.out.println("Rellenar campos necesarios, Nombre,Sexo y edad de la persona");

            switch (opcion) {
                case 1:
                    
                    String nomnre = sc.next();
                    String sexo = sc.next();
                    int edad = sc.nextInt();
                    
                    
                    Persona p = new Persona(nomnre,sexo,edad);
                    listaPersona[contadorPersona] = p;
                    contadorPersona++;
                    break;
                case 2:
                     Estudiante p1 = new Estudiante(sc.next(),sc.next(),sc.nextInt());
                    listaEstudiante[contadorEstudiante] = p1;
                    contadorEstudiante++;
                    break;
                case 3:
                    Empleado p2 = new Empleado(sc.next(),sc.next(),sc.nextInt());
                    listaEmpleado[contadorEmpleado] = p2;
                    contadorEmpleado++;
                    break;
                case 4:
                    Estudiante_empleado p3 = new Estudiante_empleado(sc.next(),sc.next(),sc.nextInt());
                    listaEstudiante_empleado[estudianteEmpleado] = p3;
                    estudianteEmpleado++;
                    break;
                case 5:
                    System.out.println("Se esta saliendo del menú");
                    break;
                default:

                    System.err.println("No existe opcion en el menú");
                    break;
            }

        } while (opcion != 5);
        
        
        
        for(int x = 0; x < listaEmpleado.length; x++){
            System.out.println(listaEmpleado[x]);
            System.out.println(listaPersona[x]);
            System.out.println(listaEstudiante[x]);
            System.out.println(listaEstudiante_empleado[x]);
            
        }
    }
}
