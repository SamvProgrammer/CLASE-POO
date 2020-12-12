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
public class jorge {//b = 2    p = 0
    private static int elevado (int b,int p){
		if(p==0) {//3  .. 2 .. 1 ... 0
			return 1;
		}
		else {
			return b*elevado(b,p-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base,potencia;
		base=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base "));
		potencia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base potencia "));
		JOptionPane.showMessageDialog(null,elevado(base,potencia));
	}
}


