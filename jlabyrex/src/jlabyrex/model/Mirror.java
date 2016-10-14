/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.model;

import java.awt.geom.Ellipse2D;






public class Mirror extends Ellipse2D.Double  {         //da controllare e l'estensione va bene

    private boolean orientation;        //0-->/ mentre 1-->\
    private int n;                      //numero specchio
    //posizione e dimensione
    private int px;
    private int py;
    private int width;
    private int height;
    //numero di specchi sulla griglia
    private static int num=1;           //assegna un valore ad ogni specchio da 1 a n
    
    public Mirror(int px,int py,int width,int height){
        
        super(px,py,width,height);
        
        this.px=px;
        this.py=py;
        this.width=width;
        this.height=height;
        
        this.n=num;
        num++;
             //orientamento da fare
    }
}
