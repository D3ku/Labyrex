
package jlabyrex.controller;

import jlabyrex.view.View;


public class ControllerForView implements IControllerForView{
    
    private static ControllerForView instance=null;
    
    //public static method
    public static IControllerForView getInstance() {
		if (instance == null)
			instance = new ControllerForView();
		return instance;
	}
    
    //pubblic instance methods
   
    public void openStartWindow(){
        View.getInstance().openStartWindow();
    }
    
    public void closeStartWindow() {
        View.getInstance().closeStartWindow(); 
    }
    
    public void openHelpWindow() {
        View.getInstance().openHelpWindow();
    }
    
    public void closeHelpWindow() {
        View.getInstance().closeHelpWindow(); 
    }
    
    public void openLevelWindow() {
        View.getInstance().openLevelWindow();
    }
    
    public void closeLevelWindow() {
        View.getInstance().closeLevelWindow();
    }
    
    public void openMainGUI(){
        View.getInstance().openMainGUI();
    }
    
    public void closeMainGUI(){
        View.getInstance().closeMainGUI();
    }
    
    public int updateLevel(){
       return View.getInstance().updateLevel();
    }
    
    public String updateDifficult(){
       return View.getInstance().updateDifficult();
    }
}
