
package tron;


import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


public class TronGUI extends JFrame {
    public PanelClass pc;
    
    
    public TronGUI() {
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setLayout(null);
       
      
        pc = new PanelClass();
        
        pc.repaint();
       
        setContentPane(pc);
        
        
        requestFocus();
        setVisible(true);
       
        Border bo = new LineBorder(Color.orange);
        JMenuBar bar = new JMenuBar();
        bar.setBorder(bo);
        JMenu menu = new JMenu("Options");
        JMenu menu1 = new JMenu("Schließen");
        bar.add(menu);bar.add(menu1);
        setJMenuBar(bar);
        JMenuItem jmi= new JMenuItem("Stop");
        JMenuItem jmi2= new JMenuItem("Start");
        JMenuItem jmi3= new JMenuItem("Reset");
        menu.add(jmi);menu.add(jmi2);menu.add(jmi3);
        KeyStroke ctrl1 = KeyStroke.getKeyStroke(KeyEvent.VK_1, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
        KeyStroke ctrl2 = KeyStroke.getKeyStroke(KeyEvent.VK_2, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
        KeyStroke ctrl3 = KeyStroke.getKeyStroke(KeyEvent.VK_3, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
        jmi.setAccelerator(ctrl1);
        jmi2.setAccelerator(ctrl2);
        jmi3.setAccelerator(ctrl3);
        dispose();
        setUndecorated(true);
        pack();
        setVisible(true);
        
        Bikes.Stop= true;
        
        
       jmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bikes.Stop=true;
            }
        });
       jmi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Bikes.Stop=false;
       
             }
       });
       jmi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Bikes.Stop=true;
               Bikes.x_kord_f1.clear();
               Bikes.x_kord_f2.clear();
               Bikes.y_kord_f1.clear();
               Bikes.y_kord_f2.clear();
               Bikes.p=0;
               Bikes.f2x1 = 50;Bikes.f2y1 = 50;
               Bikes.f1x1 = Bikes.xSize-100; Bikes.f1y1=Bikes.ySize-100;
               Bikes.a=-1;Bikes.b=0;Bikes.c=0;Bikes.d=0;Bikes.e=0;Bikes.f=-1;Bikes.g=0;Bikes.h=0;
               Bikes.a1=1;Bikes.b1=0;Bikes.c1=0;Bikes.d1=0;Bikes.e1=0;Bikes.f1=1;Bikes.g1=0;Bikes.h1=0;
               Bikes.gws1=false;
               Bikes.gws2=false;
               main.jf.setContentPane(pc);
               
               
       
             }
       });
       menu1.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                System.exit(0);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void menuCanceled(MenuEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
    
    
    }
}
