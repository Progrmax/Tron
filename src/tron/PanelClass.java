
package tron;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;



public class PanelClass extends JPanel{
    
    int es1=0;
    int es2=0;
    
 
    public PanelClass() {
       
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        
        setSize(xSize, ySize);
        setLayout(null);
        
        
        
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponents(g);
        g.setColor(Color.BLACK);
        for(int ausgabe = 0; ausgabe<Bikes.x_kord_f1.size(); ausgabe++){
            g.fillRect(Bikes.x_kord_f2.get(ausgabe), Bikes.y_kord_f2.get(ausgabe), 20, 20);
        }   
        for(int ausgabe = 0; ausgabe<Bikes.x_kord_f1.size(); ausgabe++){
            g.fillRect(Bikes.x_kord_f1.get(ausgabe), Bikes.y_kord_f1.get(ausgabe), 20, 20);
            }
        g.setColor(Color.red);
        g.fillRect(Bikes.f1x1, Bikes.f1y1, 20, 20);
        g.setColor(Color.GREEN);
        g.fillRect(Bikes.f2x1, Bikes.f2y1, 20, 20);
        if(Bikes.gws1 == true){
        Bikes.Stop=true;
        es1 +=1;
        g.setColor(Color.darkGray);
        Font myFont = new Font ("Courier New", 10, 50);
        g.setFont(myFont);
        g.drawString("Der Rote Spieler hat gewonnen", Bikes.xSize/2-400, Bikes.ySize/2-300);
        }
        if(Bikes.gws2 == true){
        Bikes.Stop= true;
        es2+=1;
        g.setColor(Color.darkGray);
        Font myFont = new Font ("Courier New", 10, 50);
        g.setFont(myFont);
        g.drawString("Der Grüne Spieler hat gewonnen", Bikes.xSize/2-400, Bikes.ySize/2-300);
        }
        g.setColor(Color.red);
        
        Font myFont = new Font ("Courier New", 3, 20);
        g.setFont(myFont);
        Bikes.ergebenisse = Integer.toString(es2/5)+" : " + Integer.toString(es1/5  ); ;
        g.drawString(Bikes.ergebenisse, Bikes.xSize-100, 50);
    }
        
    }
    
    
    

