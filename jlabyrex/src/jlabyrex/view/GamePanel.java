
package jlabyrex.view;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;



public class GamePanel extends JComponent{
    
    //lunghezza panel
    private int width=480;       
    //altezza panel
    private int height=480;                     
    //valori dei componenti sulla matrice
    //della griglia
    private int mirror=0;                   
    private int laser=1;                 
    private int receiver=2;                 
    
    private RoundRectangle2D.Double rect = new RoundRectangle2D.Double(120,40,width,height,20,20); //px,py,width,height,angoli
    
    BufferedImage buffer=null;
    
    public void paintComponent(Graphics g){
        
        if(buffer==null)
            buffer=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);          //carica l'immagine di dimensione data e tipo RGB
        Graphics2D g2 =(Graphics2D) buffer.getGraphics();
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);    //imm più fluida
        
        g2.setColor(Color.BLUE);
        g2.fill(rect);
        
        
        
        g.drawImage(buffer,0,0,null);       //immg,px,py, img obs.
        buffer=null;
    }
}
