/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5clase1.tarea;

import javax.swing.JOptionPane;

/**
 *
 * @author samv
 */
public class jorge2 {
    
 //n = 2 ... n1 ... 0
  private static int factorial (int n){
		if(n>0) {
			return n*factorial(n-1);
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		do {
		num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de factorial "));
		}while(num<0);
		JOptionPane.showMessageDialog(null,factorial(num));
	}

}
