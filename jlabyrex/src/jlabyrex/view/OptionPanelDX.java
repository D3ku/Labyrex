
package jlabyrex.view;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

public class OptionPanelDX extends JComponent{
    
    
    //lunghezza panel
    private int width=100;       
    //altezza panel
    private int height=350;                                   
    
    private RoundRectangle2D.Double rectdx = new RoundRectangle2D.Double(620,0,width,height,20,20); //px,py,width,height,angoli
    
    BufferedImage buffer=null;
    
    public void paintComponent(Graphics g){
        
        if(buffer==null)
            buffer=new BufferedImage(720,560,BufferedImage.TYPE_INT_RGB);          //carica l'immagine di dimensione data e tipo RGB
            
        
        Graphics2D g2 =(Graphics2D) buffer.getGraphics();
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);    //imm più fluida
        
        g2.setBackground(Color.white);
        
        g2.setColor(Color.GREEN);
        g2.fill(rectdx);
        
        
        
        g.drawImage(buffer,0,0,null);       //immg,px,py, img obs.
        buffer=null;
    }
    
}