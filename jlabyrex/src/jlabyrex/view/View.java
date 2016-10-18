/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.view;

import jlabyrex.controller.ControllerForModel;
import jlabyrex.controller.ControllerForView;
import jlabyrex.model.Model;
        
        
public class View implements IView {
    //static var
    public static View instance =null;
    
    //static method
    public static IView getInstance(){
        if(instance==null)
            instance=new View();
        return instance;
    }
    
    //instance attribute
    protected StartWindow startwindow=null;
    protected HelpWindow helpwindow=null;
    protected LevelWindow levelwindow=null;
    protected MainGUI mainGUI=null;
    protected GamePanel gamepanel=null;
    
    //instance method
    public void openStartWindow(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
                        if (startwindow == null)
				startwindow = new StartWindow();
			startwindow.setVisible(true);
			}
		});
    }
    
    public void closeStartWindow(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			if (startwindow != null)
				startwindow.setVisible(false);
			}
		});
    }
    
    public void openMainGUI(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
                        if (mainGUI == null)
				mainGUI = new MainGUI();
                        ControllerForModel.getInstance().updateLevel();  //aggiorna il livello da caricare all'apertura dellla mainGUI
                        mainGUI.updateLabel();                             //aggiorna il label (livello) della schermata 
			mainGUI.setVisible(true);
			}
		});
    }
    
    public void closeMainGUI(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			if (mainGUI != null)
				mainGUI.setVisible(false);
			}
		});
    }
    
    public void updateMirrorLabel(){
    }
    
    public void updateConnectionLabel(){
    }
    
    public int updateLevel(){   
       return levelwindow.choosed_lvl;
    }
    
    public String updateDifficult(){
       return levelwindow.choosed_diff;
       
    }
    
    public void openHelpWindow(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				if (helpwindow == null)
					helpwindow = new HelpWindow();
				helpwindow.setVisible(true);
			}
		});
    }
    
    public void closeHelpWindow(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			if (helpwindow != null)
				helpwindow.setVisible(false);
			}
		});
    }
    
    public void openLevelWindow(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
                        if (levelwindow == null)
				levelwindow = new LevelWindow();
			levelwindow.setVisible(true);
                        Model.level=null;                               //resetta il livello ogni volta che si accede alla lvlwindow
			}
		});
    }
    
    public void closeLevelWindow(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			if (levelwindow != null)
				levelwindow.setVisible(false);
			}
		});
    };
    
}
