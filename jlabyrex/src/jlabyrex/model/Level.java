/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.model;

import jlabyrex.controller.ControllerForView;

/**
 *
 * @author Utente
 */
public class Level { 
    //variabili di istanza                                              
    private int num_specchi;
    private int num_laser;
    private int num_rec;
    private static int[][] level;                                                  //variabile che contiene lo schema del livello selezionato 
    //variabili schema livelli (che dovranno essere FINAL)
    //0=vuoto e 1=specchio,2-6 ricevitori con colori Rosso,Verde,Giallo,Blu,Bianco
    //7-11 laser con colori Rosso,Verde,Giallo,Blu,Bianco
    private final int[][] easy_1={
        {0 ,0 ,7 ,0 ,0 ,0 ,0 ,0 },                                        
        {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 },                       
        {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 },                       
        {8 ,0 ,1 ,0 ,0 ,0 ,0 ,2 },                     
        {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 },                          
        {0 ,0 ,1 ,0 ,0 ,0 ,0 ,3 },                        
        {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 },
        {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 }};
                      
    private final int[][] easy_2={
        {0 ,2 ,7 ,0 ,0 ,0 ,0 ,0 },
        {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 },
        {0 ,0 ,0 ,0 ,1 ,1 ,0 ,0 },
        {0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 },
        {0 ,0 ,1 ,0 ,1 ,0 ,0 ,7 },
        {0 ,0 ,0 ,0 ,1 ,1 ,0 ,2 },
        {0 ,0 ,0 ,0 ,1 ,0 ,1 ,0 },
        {0 ,0 ,0 ,0 ,7 ,2 ,0 ,0 }};
    
    private final int[][] easy_3={
        {0 ,0 ,0 ,0 ,0 ,7 ,2 ,0 },
        {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 },
        {0 ,0 ,0 ,0 ,1 ,1 ,1 ,6 },
        {7 ,0 ,0 ,0 ,1 ,1 ,1 ,11},
        {0 ,1 ,0 ,0 ,0 ,0 ,0 ,11},
        {0 ,0 ,0, 0 ,0 ,0 ,0 ,0 },
        {2 ,0 ,0 ,0 ,1 ,0 ,0 ,0 },
        {0 ,6 ,0 ,0 ,0 ,0 ,0 ,0 }};
    
    private final int[][] easy_4={
        {0 ,11,7 ,9 ,9 ,10,7 ,0 },
        {9 ,1 ,1 ,1 ,0 ,1 ,1 ,2 },
        {6 ,0 ,1 ,0 ,0 ,1 ,0 ,4 },
        {4 ,1 ,1 ,1 ,1 ,1 ,1 ,5 },
        {2 ,1 ,1 ,1 ,1 ,1 ,0 ,4 },
        {9 ,0 ,1 ,1 ,0 ,1 ,1 ,4 },
        {0 ,1 ,0 ,0 ,1 ,1 ,1 ,9 },
        {0 ,0 ,11,6 ,2 ,7 ,4 ,0 }};
    
    private final int[][] easy_5={
        {0 ,8 ,10,7 ,5 ,7 ,3 ,0 },
        {3 ,1 ,0 ,1 ,1 ,1 ,0 ,5 },
        {10,1 ,1 ,1 ,1 ,0 ,0 ,2 },
        {5 ,1 ,1 ,1 ,1 ,1 ,1 ,8 },
        {7 ,1 ,1 ,1 ,1 ,1 ,1 ,3 },
        {2 ,1 ,1 ,1 ,1 ,1 ,1 ,8 },
        {7 ,0 ,1 ,1 ,1 ,0 ,1 ,8 },
        {0 ,2 ,2 ,10,5 ,3 ,10,0 }};
    
    private final int[][] mid_1={
        {0 ,0 ,0 ,5 ,6 ,11,11,4 ,0 ,0 },
        {9 ,0 ,0 ,0 ,1 ,1 ,0 ,1 ,0 ,5 },
        {0 ,0 ,1 ,1 ,1 ,0 ,0 ,1 ,0 ,10},
        {10,0 ,1 ,1 ,0 ,0 ,0 ,1 ,1 ,0 },
        {10,0 ,1 ,0 ,0 ,0 ,0 ,0 ,0 ,6 },
        {0 ,0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,6 },
        {0 ,0 ,1 ,0 ,0 ,1 ,1 ,1 ,0 ,0 },
        {0 ,1 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,5 },
        {5 ,0 ,1 ,0 ,0 ,0 ,0 ,0 ,0 ,0 },
        {0 ,10,0 ,11,5 ,10,9 ,0 ,4 ,0 }};
    
    private final int[][] mid_2={
        {0 ,9 ,9 ,7 ,2 ,0 ,4 ,0 ,0 ,0 },
        {0 ,1 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,0 },
        {0 ,1 ,0 ,1 ,1 ,0 ,0 ,1 ,0 ,0 },
        {9 ,1 ,0 ,0 ,0 ,1 ,1 ,1 ,1 ,0 },
        {6 ,1 ,1 ,0 ,0 ,0 ,1 ,1 ,0 ,7 },
        {9 ,0 ,1 ,0 ,0 ,0 ,1 ,1 ,1 ,2 },
        {4 ,0 ,1 ,1 ,0 ,1 ,1 ,1 ,0 ,6 },
        {4 ,0 ,1 ,1 ,0 ,1 ,1 ,0 ,1 ,0 },
        {0 ,0 ,0 ,0 ,0 ,0 ,1 ,1 ,1 ,0 },
        {0 ,4 ,0 ,0 ,9 ,11,0 ,4 ,11,0 }};
    
    private final int[][] mid_3={
        {0 ,9 ,10,9 ,9 ,5 ,8 ,0 ,4 ,0 },
        {4 ,0 ,0 ,1 ,0 ,1 ,1 ,0 ,0 ,3 },
        {10,0 ,0 ,1 ,1 ,1 ,0 ,1 ,0 ,0 },
        {4 ,1 ,1 ,1 ,1 ,0 ,0 ,1 ,1 ,8 },
        {5 ,0 ,0 ,1 ,1 ,1 ,1 ,0 ,1 ,11},
        {8 ,1 ,0 ,1 ,1 ,0 ,1 ,1 ,0 ,10},
        {4 ,0 ,1 ,1 ,0 ,1 ,1 ,1 ,0 ,5 },
        {9 ,0 ,1 ,1 ,1 ,0 ,1 ,1 ,1 ,6 },
        {3 ,1 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,3 },
        {0 ,8 ,9 ,9 ,4 ,3 ,4 ,8 ,3 ,0 }};
    
    private final int[][] mid_4={
        {0 ,11,0 ,2 ,0 ,11,8 ,3 ,6 ,0 },
        {0 ,0 ,0 ,0 ,1 ,0 ,1 ,1 ,0 ,0 },
        {6 ,0 ,0 ,0 ,1 ,0 ,0 ,1 ,0 ,0 },
        {0 ,0 ,1 ,1 ,1 ,1 ,0 ,0 ,1 ,0 },
        {7 ,0 ,1 ,1 ,1 ,1 ,0 ,1 ,1 ,0 },
        {0 ,1 ,0 ,1 ,1 ,0 ,1 ,1 ,0 ,3 },
        {0 ,1 ,0 ,0 ,0 ,1 ,1 ,1 ,0 ,3 },
        {7 ,0 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,6 },
        {0 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,0 },
        {0 ,0 ,2 ,11,3 ,8 ,0 ,8 ,8 ,0 }};
    
    private final int[][] mid_5={
        {0 ,2 ,0 ,0 ,8 ,6 ,11,0 ,8 ,0 },
        {3 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,0 },
        {7 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,3 },
        {9 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,0 },
        {4 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,0 },
        {4 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,4 },
        {9 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,9 },
        {8 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,3 },
        {3 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,0 },
        {0 ,9 ,4 ,9 ,0 ,0 ,4 ,0 ,8 ,0 }};
    
    private final int[][] diff_1={
        {0 ,0 ,2 ,6 ,5 ,11,4 ,7 ,10,0 ,9 ,0 },
        {8 ,0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,1 ,4 },
        {3 ,0 ,1 ,1 ,1 ,0 ,1 ,1 ,1 ,1 ,0 ,0 },
        {11,0 ,1 ,1 ,0 ,0 ,1 ,1 ,0 ,1 ,1 ,9 },
        {5 ,0 ,0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,2 },
        {0 ,1 ,0 ,1 ,0 ,0 ,0 ,1 ,0 ,1 ,1 ,4 },
        {0 ,0 ,1 ,0 ,1 ,0 ,1 ,1 ,0 ,0 ,0 ,7 },
        {4 ,0 ,0 ,0 ,1 ,1 ,0 ,1 ,0 ,0 ,0 ,2 },
        {7 ,0 ,0 ,0 ,0 ,0 ,1 ,1 ,1 ,1 ,1 ,9 },
        {7 ,0 ,0 ,1 ,1 ,1 ,0 ,1 ,1 ,1 ,1 ,11},
        {2 ,0 ,0 ,0 ,0 ,0 ,1 ,1 ,0 ,1 ,1 ,6 },
        {0 ,10,0 ,9 ,6 ,11,6 ,5 ,10,3 ,8 ,0 }};
    
    private final int[][] diff_2={
        {0 ,9 ,11,6 ,3 ,8 ,5 ,5 ,9 ,10,3 ,0 },
        {8 ,0 ,0 ,0 ,1 ,1 ,0 ,0 ,0 ,1 ,0 ,10},
        {4 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,1 ,0 ,4 },
        {5 ,1 ,0 ,1 ,1 ,1 ,1 ,0 ,1 ,0 ,0 ,4 },
        {5 ,0 ,0 ,0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,9 },
        {3 ,1 ,0 ,0 ,1 ,1 ,0 ,1 ,0 ,1 ,0 ,3 },
        {4 ,1 ,1 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,4 },
        {10,0 ,0 ,0 ,1 ,1 ,0 ,1 ,0 ,1 ,0 ,9 },
        {10,1 ,1 ,0 ,0 ,1 ,1 ,1 ,1 ,1 ,0 ,8 },
        {10,0 ,0 ,1 ,1 ,1 ,1 ,0 ,1 ,1 ,1 ,8 },
        {10,0 ,0 ,0 ,1 ,1 ,0 ,1 ,0 ,1 ,0 ,0 },
        {0 ,5 ,8 ,9 ,7 ,2 ,5 ,5 ,10,0 ,3 ,0 }};
    
    private final int[][] diff_3={
        {0 ,10,0 ,10,3 ,0 ,5 ,0 ,8 ,0 ,5 ,0 },
        {5 ,0 ,0 ,1 ,0 ,0 ,1 ,1 ,0 ,1 ,0 ,0 },
        {0 ,1 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,10},
        {0 ,0 ,1 ,0 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,0 },
        {0 ,1 ,1 ,1 ,1 ,1 ,0 ,1 ,1 ,1 ,1 ,0 },
        {3 ,1 ,0 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,0 ,10},
        {8 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,8 },
        {3 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,3 },
        {5 ,1 ,1 ,0 ,1 ,1 ,0 ,1 ,1 ,1 ,1 ,8 },
        {11,1 ,1 ,1 ,1 ,1 ,1 ,0 ,1 ,1 ,1 ,0 },
        {0 ,1 ,1 ,0 ,0 ,0 ,0 ,1 ,1 ,1 ,0 ,0 },
        {0 ,0 ,6 ,8 ,3 ,0 ,0 ,8 ,3 ,0 ,0 ,0 }};
  
    private final int[][] diff_4={
        {0 ,0 ,8 ,3 ,4 ,7 ,2 ,4 ,9 ,4 ,0 ,0 },
        {0 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,1 ,1 ,1 ,0 },
        {6 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,9 },
        {9 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,3 },
        {11,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,8 },
        {0 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,10},
        {9 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,4 },
        {0 ,1 ,1 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,9 },
        {9 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,5 },
        {4 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,4 },
        {0 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,0 },
        {0 ,0 ,4 ,9 ,4 ,11,6 ,5 ,10,0 ,9 ,0 }};
    
    private final int[][] diff_5={
        {0 ,10,9 ,4 ,4 ,9 ,3 ,10,9 ,8 ,3 ,0 },
        {5 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,4 },
        {4 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,5 },
        {9 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,3 },
        {6 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,8 },
        {11,1 ,0 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,4 },
        {8 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,3 },
        {5 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,8 },
        {9 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,3 },
        {4 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,3 },
        {0 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,0 ,1 ,2 },
        {0 ,0 ,10,9 ,10,5 ,8 ,3 ,8 ,8 ,7 ,0 }};
    
    //variabili statiche
    protected static int lvl;          //livello
    protected static String diff;     //attuale   */ System.out.println("livello1");
    
    
     public Level(int lev,String diffic){
         lvl=lev;
         diff=diffic;
         
         this.num_laser=0;
         this.num_specchi=0;
         //i rappresenta il pulsante premuto sulla LevelWindow
         //level è una matrice che racchiude lo schema del livello selezionato
         
        if((lvl==1)&&(diff=="Facile")){
             level=easy_1; 
             System.out.println("livello1");
     }
        else if((lvl==2)&&(diff=="Facile"))
             level=easy_2;
        else if((lvl==3)&&(diff=="Facile"))
             level=easy_3;
        else if((lvl==4)&&(diff=="Facile"))
             level=easy_4;
        else if((lvl==5)&&(diff=="Facile"))
             level=easy_5;
        else if((lvl==1)&&(diff=="Medio"))
             level=mid_1;
        else if((lvl==2)&&(diff=="Medio"))
             level=mid_2;
        else if((lvl==3)&&(diff=="Medio"))
             level=mid_3;
        else if((lvl==4)&&(diff=="Medio"))
             level=mid_4;
        else if((lvl==5)&&(diff=="Medio"))
             level=mid_5;
        else if((lvl==1)&&(diff=="Difficile"))
             level=diff_1;
        else if((lvl==2)&&(diff=="Difficile"))
             level=diff_2;
        else if((lvl==3)&&(diff=="Difficile"))
             level=diff_3;
        else if((lvl==4)&&(diff=="Difficile"))
             level=diff_4;
        else if((lvl==5)&&(diff=="Difficile"))
             level=diff_5;
        
        //calcola numero di specchi,laser e ricevitori
        //0=vuoto;1=specchi;2-6=ric;7-11=laser
        for(int k=0;k<level.length;k++)
            for(int j=0;j<level[k].length;j++) {
                if(level[k][j]==1)
                    num_specchi++;
                else if(level[k][j]>=7)
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
     
     public int[][] getLevel(){
         return level;
     }
}
