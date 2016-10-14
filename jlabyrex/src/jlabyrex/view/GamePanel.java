
package jlabyrex.view;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;



public class GamePanel extends JPanel{
    
              
    //valori dei componenti sulla matrice
    //della griglia
    private int mirror=0;                   
    private int laser=1;                 
    private int receiver=2;                 
    
    private Rectangle2D.Double rect = new Rectangle2D.Double(0,0,480,480); //px,py,width,height,angoli
    
    
    public void paintComponent(Graphics g){
        
        Graphics2D g2=(Graphics2D) g;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);    //imm più fluida
        
        g2.setColor(Color.BLUE);
        g2.fill(rect);
        

    }
}
