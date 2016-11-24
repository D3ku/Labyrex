
package jlabyrex.view;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
//immagini
import java.awt.Image;
import java.awt.Toolkit;


import javax.swing.JPanel;



public class GamePanel extends JPanel{
    
              
    //valori dei componenti sulla matrice
    //della griglia
    private int mirror=0;                   
    private int laser=1;             //da rifare    
    private int receiver=2;  
    
    Toolkit tk= Toolkit.getDefaultToolkit();
    Image imm=tk.getImage("Sfondo.jpg");
    
                                                                             //sfondo ( da eliminare)
    private Rectangle2D.Double rect = new Rectangle2D.Double(0,0,480,480); //px,py,width,height,angoli
    
    
    public void paintComponent(Graphics g){
        
        Graphics2D g2=(Graphics2D) g;
        
        //g2.drawImage(imm, 0, 0, 400, 400, null);
         
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);    //imm più fluida
                                                                                //sfondo (da eliminare)
        //g2.setColor(Color.BLUE);                                                //
        //g2.fill(rect);                                                          //
        
       

    }
    
    public void update(){
        
        repaint();
        
    }
}
