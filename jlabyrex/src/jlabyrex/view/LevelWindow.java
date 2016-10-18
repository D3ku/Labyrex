/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabyrex.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle;

import jlabyrex.controller.ControllerForView;

public class LevelWindow extends JFrame {

    private static String saved_lvl;                                                   //livello attualmente salvato
    protected static int choosed_lvl=0;                                                    //livello scelto
    protected static String choosed_diff="";
    
    public LevelWindow(){
        //label
        JLabel easy = new JLabel("Facile");
        easy.setFont(new Font("Times New Roman", 1, 24));
        
        JLabel difficult = new JLabel("Difficile");
        difficult.setFont(new Font("Times New Roman", 1, 24));
 
        JLabel medium = new JLabel("Medio");
        medium.setFont(new Font("Times New Roman", 1, 24));
        
        JLabel saved= new JLabel("Ultimo livello salvato");
        saved.setFont(new Font("Times New Roman", 1, 12));
        
        JLabel lvl_saved = new JLabel(this.saved_lvl);                          //lvl_saved si aggiorna in base all'attuale salvataggio
        lvl_saved.setFont(new Font("Times New Roman", 1, 12));
        //livelli facili
        JButton easy_1 = new JButton("1");
        easy_1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=1;
                    choosed_diff="Facile";
                    handleMainGUIEvent();
                }
            });
        
        JButton easy_2 = new JButton("2");
        easy_2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=2;
                    choosed_diff="Facile";
                    handleMainGUIEvent();
                }
            });
        
        JButton easy_3 = new JButton("3");
        easy_3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=3;
                    choosed_diff="Facile";
                    handleMainGUIEvent();
                }
            });
        
        JButton easy_4 = new JButton("4");
        easy_4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=4;
                    choosed_diff="Facile";
                    handleMainGUIEvent();
                }
            });
        
        JButton easy_5 = new JButton("5");
        easy_5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=5;
                    choosed_diff="Facile";
                    handleMainGUIEvent();
                }
            });
        //livelli medi
        JButton mid_1 = new JButton("1");
        mid_1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=1;
                    choosed_diff="Medio";
                    handleMainGUIEvent();
                }
            });
        
        JButton mid_2 = new JButton("2");
        mid_2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=2;
                    choosed_diff="Medio";
                    handleMainGUIEvent();
                }
            });
        
        JButton mid_3 = new JButton("3");
        mid_3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=3;
                    choosed_diff="Medio";
                    handleMainGUIEvent();
                }
            });
        
        JButton mid_4 = new JButton("4");
        mid_4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=4;
                    choosed_diff="Medio";
                    handleMainGUIEvent();
                }
            });
        
        JButton mid_5 = new JButton("5");
        mid_5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=5;
                    choosed_diff="Medio";
                    handleMainGUIEvent();
                }
            });
        
        //livelli difficili
        JButton diff_1 = new JButton("1");
        diff_1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=1;
                    choosed_diff="Difficile";
                    handleMainGUIEvent();
                }
            });
        
        JButton diff_2 = new JButton("2");
        diff_2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=2;
                    choosed_diff="Difficile";
                    handleMainGUIEvent();
                }
            });
        
        JButton diff_3 = new JButton("3");
        diff_3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=3;
                    choosed_diff="Difficile";
                    handleMainGUIEvent();
                }
            });
        
        JButton diff_4 = new JButton("4");
        diff_4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=4;
                    choosed_diff="Difficile";
                    handleMainGUIEvent();
                }
            });
        
        JButton diff_5 = new JButton("5");
        diff_5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    choosed_lvl=5;
                    choosed_diff="Difficile";
                    handleMainGUIEvent();
                }
            });
        
        //utility
        JButton load = new JButton("Carica");
        JButton back = new JButton("Indietro");
        back.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    handleStartWindowEvent();
                }
            });

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        //layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(medium)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mid_1,GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mid_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mid_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mid_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mid_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(easy, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(easy_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(easy_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(easy_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(easy_4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(easy_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(difficult, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                .addComponent(diff_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diff_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(saved)
                                    .addComponent(lvl_saved, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(back, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(diff_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diff_4,GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diff_5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addComponent(load, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(easy, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(difficult, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(easy_5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(easy_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(easy_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(easy_3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addComponent(easy_4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                    .addComponent(diff_5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(diff_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(diff_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(diff_3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(diff_4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(medium))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(saved)
                        .addComponent(load, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(back, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(mid_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mid_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mid_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mid_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mid_5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lvl_saved, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }
    
    private void handleStartWindowEvent(){
        ControllerForView.getInstance().closeLevelWindow();
        ControllerForView.getInstance().openStartWindow();
    }
    
    private void handleMainGUIEvent(){
        ControllerForView.getInstance().closeLevelWindow();
        ControllerForView.getInstance().openMainGUI();
        //aggiungi variabili per la selezione del livello
    }

}