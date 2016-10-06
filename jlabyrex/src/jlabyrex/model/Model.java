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
public class Model implements IModel {
    //instance attribute
    protected Level level=null;
    
    //static var
    public static Model instance =null;
    
    //static method
    public static IModel getInstance(){
        if(instance==null)
            instance=new Model();
        return instance;
    }
    
    //metodi dei livelli
    public int[][] getLevel(int i){
        if(level==null)
            level=new Level(i);
        return level.Level();
    }
      
    public int getNumberOfMirror(){
        return level.NumberOfMirror();
    }
    
    public int getNumberOfLaser(){
        return level.NumberOfLaser();
    }
    
}
