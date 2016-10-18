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
public interface IModel {
    
    public int[][] getLevel();
    
    public int getNumberOfMirror();
    
    public int getNumberOfLaser();
    
    public void updateLevel();
}
