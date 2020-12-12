/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samv
 */
public class fibo {
    
    public int calcular(int inicial,int sucesor){
        
        if(inicial >1000)return 0;
        
        System.out.print(inicial+" ");
        return calcular(sucesor,inicial+sucesor);
    }
    public static void main(String[] args) {
        fibo f = new fibo();
        
        f.calcular(0,1);
    }
}
