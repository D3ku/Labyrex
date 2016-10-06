/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.controller;

/**
 *
 * @author Utente
 */
public interface IControllerForView {
    
    public void openStartWindow();

    public void closeStartWindow();

    public void openHelpWindow();
    
    public void closeHelpWindow();
    
    public void openLevelWindow();
    
    public void closeLevelWindow();
    
    public void openMainGUI();
    
    public void closeMainGUI();

}
