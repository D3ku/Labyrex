/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.view;

/**
 *
 * @author Utente
 */
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
    
    public void updateLevelLabel(){
       mainGUI.lvl=levelwindow.choosed_lvl;
       mainGUI.diff=levelwindow.choosed_diff;
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
