/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6clase1.ejemplo;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author samv
 */
public class lineasbezier extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
       
        int x1 = 0;
        int y1 = getHeight();
        
        int x2 = 0;
        int y2 = 0;
        
        
        for(  ; x1 <= getWidth() ; x1 += 30,y2+=30  ){
           g.drawLine(x1, y1, x2, y2);
        }
        
        
        
         x1 = 0;
         y1 = 0;
        
         x2 = 0;
         y2 = getHeight();
        
        
        for(  ; x1 <= getWidth() ; x1 +=30,y2-=30){
           g.drawLine(x1, y1, x2, y2);
        }
        
    }
    
    
    
    public static void main(String[] args) {
        lineasbezier n = new lineasbezier();
        
        JFrame ventana = new JFrame();
        ventana.add(n);
        ventana.setSize(400,400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        ventana.setVisible(true);
    }
    
    
}
