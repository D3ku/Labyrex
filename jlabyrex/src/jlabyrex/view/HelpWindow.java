/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.view;

import javax.swing.*;
import javax.swing.JButton;

import jlabyrex.controller.ControllerForView;

/**
 *
 * @author Utente
 */
public class HelpWindow extends JFrame {
    
    
    public HelpWindow() {
        super("How to Play");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);              // la variabile deve essere DO_NOTHING_ON_CLOSE
        this.setVisible(true);
        
        
    this.pack();
    }
    
}
