/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.model;

/**
 *
 * @author Utente
 */
public class Position {
    
    private boolean mirror;
    private int px;
    private int py;
    private int cx;
    private int cy;
    private int cell_num;                               //numero delle celle in una riga
    private int dim;                                    //dimensione griglia
    
    public Position(int x,int y){
        this.cx=x;
        this.cy=y;
        this.px= x*(dim/cell_num);
        this.py=y*(dim/cell_num);
    }
    
}
