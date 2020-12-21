/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6clase3;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author samv
 */
public class ventana  extends JFrame {
    
    
    
    
    public static void main(String[] args) {
        ventana v = new ventana();
        
        Container c = v.getContentPane();
        
        JButton btn1 = new JButton("Agregar");
        btn1.setSize(100,100);
        c.add(btn1);
        
        
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setBounds(100, 100, 500, 500);
        v.setVisible(true);
    }
    
    
    
    
}
