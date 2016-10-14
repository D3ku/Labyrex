
package jlabyrex.view;

import java.awt.Color;
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
    private JLabel Mirror;
    private JLabel num_conn;
    private JLabel num_mirr;
    
    protected static int lvl;         //aggiorna label
    protected static String diff;        //del livello
    
    public MainGUI() {
        gamepanel=new GamePanel();
        optionpanelsx = new JPanel();
        optionpaneldx = new JPanel();
        
        level = new JLabel();
        level.setText(diff+" "+lvl);
        level.setFont(new Font("Tahoma", 1, 24)); 
        
        connection = new JLabel();
        connection.setFont(new Font("Tahoma", 1, 20));
        connection.setText("Connessioni");
        
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

        
        GroupLayout gamepanelLayout = new GroupLayout(gamepanel);
        gamepanel.setLayout(gamepanelLayout);
        gamepanelLayout.setHorizontalGroup(
            gamepanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        gamepanelLayout.setVerticalGroup(
            gamepanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
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

        optionpanelsx.setName(""); // NOI18N

        
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
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(optionpanelsx, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(gamepanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(optionpaneldx, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(level)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(connection))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(connection)
                    .addComponent(level))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optionpaneldx,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(gamepanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(optionpanelsx, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
       // this.gamepanel.setBackground(Color.red);
        
        this.setResizable(false);
        pack();
        this.setSize(720,560);
        //ImageIcon background= new ImageIcon("sfondo.jpg");
        //this.setBackground(background);
        }               
    
        private void handleLevelWindowEvent(){
            ControllerForView.getInstance().closeMainGUI();
            ControllerForView.getInstance().openLevelWindow();
        }
    
    }
