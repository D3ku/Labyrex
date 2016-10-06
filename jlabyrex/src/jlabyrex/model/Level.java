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
public class Level { 
    //variabili di istanza                                              
    private int num_specchi;
    private int num_laser;
    private int[][] level;                                                  //variabile che contiene il livello selezionato 
    //variabili schema livelli (che dovranno essere FINAL)
    private int[][] easy_1;                        
    private int[][] easy_2;
    private int[][] easy_3;
    private int[][] easy_4;
    private int[][] easy_5;
    private int[][] mid_1;
    private int[][] mid_2;
    private int[][] mid_3;
    private int[][] mid_4;
    private int[][] mid_5;
    private int[][] diff_1;
    private int[][] diff_2;
    private int[][] diff_3;
    private int[][] diff_4;
    private int[][] diff_5;

    
    
     public Level(int i){
         
         this.num_laser=0;
         this.num_specchi=0;
         //i rappresenta il pulsante premuto sulla LevelWindow
         //level è una matrice che racchiude lo schema del livello selezionato
         
        if(i==1)
             this.level=easy_1;
        if(i==2)
             this.level=easy_2;
        if(i==3)
             this.level=easy_3;
        if(i==4)
             this.level=easy_4;
        if(i==5)
             this.level=easy_5;
        if(i==6)
             this.level=mid_1;
        if(i==7)
             this.level=mid_2;
        if(i==8)
             this.level=mid_3;
        if(i==9)
             this.level=mid_4;
        if(i==10)
             this.level=mid_5;
        if(i==11)
             this.level=diff_1;
        if(i==12)
             this.level=diff_2;
        if(i==13)
             this.level=diff_3;
        if(i==14)
             this.level=diff_4;
        if(i==15)
             this.level=diff_5;
        
        //calcola numero di specchi,laser e ricevitori
        for(int k=0;k<this.level.length;k++)
            for(int j=0;j<this.level[k].length;j++) {
                if(this.level[k][j]==1)
                    num_specchi++;
                else if(this.level[k][j]==2)
                    num_laser++;
            }
        ;     
        
    }  
     
     public int NumberOfMirror(){
         return this.num_specchi;
     }
     
     public int NumberOfLaser(){                                             //num laser=num ricevitori
         return this.num_laser;
     }
     
     public int[][] Level(){
         return this.level;
     }
}
