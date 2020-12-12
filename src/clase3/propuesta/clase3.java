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
public class clase3 {
    //Tipo global
    //Tipo local
    //Tipo Procedimiento

    private String nombre;

//    public void metodo1(float parametro) {
//        int x = (int) parametro;
//
//        //Break pero de los métodos...
//        if (x == 5) {
//            return;//break de los métodos....
//        }
//
//        System.out.println("Mi metodo es genial");
//    }
    public void metodo1(int x) {

        System.out.println("Ambito " + x);
        if (x == 5) 
            return;
        

        metodo1(x + 1);

        System.out.println("Termino ambito" + x);

    }

    public static void main(String[] args) {
        clase3 c1 = new clase3();
        c1.metodo1(0);
        
        String[] arreglo = new String[4];
        
        
        String[] arreglo2 = arreglo;
        
        
        
    }

}
