/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samv
 */
public class modificandovalores {
    
    public void modificandoprimitivo(int numero){
        numero = 58;
    }
    public void modificandoprimitivo(double numero2){
         numero2 = 44;
    }
    
    public void modificandoobj(datoespecial obj){
        obj.dato = 20;
    }
    
    public void modificandoArreglo(int[] arreglo){
      for(int x = 0; x < arreglo.length; x++){
          arreglo[x] *= 2;
      }
    }
    
    public static void main(String[] args) {
        modificandovalores obj = new modificandovalores();
        
        int valor1 = 10;
        
        double valor2 = 43.5;
        
        datoespecial especial = new datoespecial();
        
        
        System.out.printf("Los valores originales: | %s | %s | %s | \n",valor1,valor2,especial.dato);
        
        obj.modificandoprimitivo(valor1);
        obj.modificandoprimitivo(valor2);
        obj.modificandoobj(especial);
        
        System.out.printf("Los valores originales: | %s | %s | %s | \n",valor1,valor2,especial.dato);
        
        
        int[] arreglos = {1,2,3,4,5,6,7,8,9,10};
        
        for(int item : arreglos){
            System.out.print(item+" ");
        }
        
        obj.modificandoArreglo(arreglos);
        
        System.out.println();
          for(int item : arreglos){
            System.out.print(item+" ");
        }
        
    }
}

 class datoespecial{

     int dato = 6;
     
}
