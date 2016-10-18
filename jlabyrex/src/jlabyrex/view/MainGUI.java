
package jlabyrex.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.LayoutStyle;


import jlabyrex.controller.ControllerForView;


public class MainGUI extends JFrame {
    
    private static GamePanel gamepanel=null;
    private JPanel optionpaneldx;
    private JPanel optionpanelsx;
    
    private JButton menù;
    private JButton effects;
    private JButton reset;
    private JButton music;
    private JButton lock;
    private JButton key;
    private JButton save;
    
    private JLabel level;
    private JLabel connection;
    private JLabel mirror;
    private JLabel num_conn;
    private JLabel num_mirr;
    
    protected static int lvl;         //aggiorna label
    protected static String diff;        //del livello
    
    public MainGUI() {        
        
        gamepanel=new GamePanel();
        optionpanelsx = new JPanel();
        optionpaneldx = new JPanel();
        
        level = new JLabel();
        
        connection = new JLabel();
        connection.setFont(new Font("Tahoma", 1, 20));
        connection.setText("Connessioni");
        
        mirror = new JLabel();
        mirror.setFont(new Font("Tahoma", 1, 20));
        mirror.setText("Specchi");
        
        num_conn = new JLabel();
        num_conn.setFont(new Font("Tahoma", 1, 20));
        
        num_mirr = new JLabel();
        num_mirr.setFont(new Font("Tahoma", 1, 20));
        
        menù = new JButton();
        menù.setText("Menù");
        menù.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    handleLevelWindowEvent();
                }
            });
        
        effects = new JButton();
        effects.setText("Effetti");
        
        reset = new JButton();
        reset.setText("Reset");
        
        music = new JButton();
        music.setText("Musica");
        
        lock = new JButton();
        lock.setText("Lock");
        
        key = new JButton();
        key.setText("Key");
        
        save = new JButton();
        save.setText("Save");
           

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        gamepanel.setPreferredSize(new Dimension(492, 492));
        GroupLayout gamepanelLayout = new GroupLayout(gamepanel);
        gamepanel.setLayout(gamepanelLayout);
        gamepanelLayout.setHorizontalGroup(
            gamepanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );
        gamepanelLayout.setVerticalGroup(
            gamepanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        
        GroupLayout optionpaneldxLayout = new GroupLayout(optionpaneldx);
        optionpaneldx.setLayout(optionpaneldxLayout);
        optionpaneldxLayout.setHorizontalGroup(
            optionpaneldxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(optionpaneldxLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(optionpaneldxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lock, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                    .addComponent(key, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                    .addComponent(save, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        optionpaneldxLayout.setVerticalGroup(
            optionpaneldxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(optionpaneldxLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lock, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(key, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(save, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        
        GroupLayout optionpanelsxLayout = new GroupLayout(optionpanelsx);
        optionpanelsx.setLayout(optionpanelsxLayout);
        optionpanelsxLayout.setHorizontalGroup(
            optionpanelsxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(optionpanelsxLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(optionpanelsxLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(music, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, GroupLayout.PREFERRED_SIZE, 70,GroupLayout.PREFERRED_SIZE)
                    .addComponent(effects, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                    .addComponent(menù, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        optionpanelsxLayout.setVerticalGroup(
            optionpanelsxLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(optionpanelsxLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(menù, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(reset, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(effects, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(music, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(optionpanelsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(gamepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionpaneldx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(num_conn)
                            .addComponent(num_mirr))
                        .addGap(26, 26, 26))
                    .addComponent(mirror, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(level)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(connection))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connection)
                    .addComponent(level))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num_conn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mirror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num_mirr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optionpaneldx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(gamepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(optionpanelsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
       // this.gamepanel.setBackground(Color.red);
       
        
        this.setResizable(false);
        pack();
        this.setSize(725,560);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //ImageIcon background= new ImageIcon("sfondo.jpg");
        //this.setBackground(background);
        }               
    
    protected void updateLabel(){
        lvl=ControllerForView.getInstance().updateLevel();
        diff=ControllerForView.getInstance().updateDifficult();
        
        level.setText(diff+" "+lvl);
        level.setFont(new Font("Tahoma", 1, 24));
        
        num_mirr.setText("dfghjk");
        num_conn.setText("dfghjk");
        

    }    
    
    
    private void handleLevelWindowEvent(){
        ControllerForView.getInstance().closeMainGUI();
        ControllerForView.getInstance().openLevelWindow();
        }
    
    }
