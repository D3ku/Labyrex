/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.controller;

import jlabyrex.model.Model;
/**
 *
 * @author Utente
 */
public class ControllerForModel implements IControllerForModel {
    
    private static ControllerForModel instance=null;
    
    //public static method
    public static IControllerForModel getInstance() {
		if (instance == null)
			instance = new ControllerForModel();
		return instance;
	}
    
    //public instance method
    
    public int[][] getLevel(int i){
        return Model.getInstance().getLevel(i);
    }
    
    public int getNumberOfMirror(){
        return Model.getInstance().getNumberOfMirror();
    }
    
    public int getNumberOfLaser(){
        return Model.getInstance().getNumberOfLaser();
    }
}
