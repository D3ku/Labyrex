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
public class Model implements IModel {
    //instance attribute
    public static Level level=null;
    
    //static var
    public static Model instance =null;
    
    //static method
    public static IModel getInstance(){
        if(instance==null)
            instance=new Model();
        return instance;
    }
    
    //metodi dei livelli
    public int[][] getLevel(){
        return level.getLevel();
    }
      
    public int getNumberOfMirror(){
        return level.NumberOfMirror();
    }
    
    public int getNumberOfLaser(){
        return level.NumberOfLaser();
    }
    
    public void updateLevel(){
        if(level==null)                 //sempre verificata poiché level=null ogni volta che si accede alla lvlwindow
            level=new Level(ControllerForView.getInstance().updateLevel(),ControllerForView.getInstance().updateDifficult());
        
    }
}
