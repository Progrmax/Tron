
package tron;

import java.util.ArrayList;
import java.awt.Toolkit; 
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bikes {
    public static int f1x1; public static int f1y1; public static int f1x2; public static int f1y2;
    public static int f2x1; public static int f2y1; public static int f2x2; int f2y2;
    public static int a = -1;public static int b = 0;public static int c = 0;public static int d = 0;public static int e = 0;public static int f = -1;public static int g = 0;public static int h = 0;
    public static int a1=1; public static int b1=0; public static int c1=0; public static int d1=0;public static int e1=0; public static int f1=1; public static int g1=0; public static int h1=0;
    public static boolean Stop= false;
    public PanelClass pc = new PanelClass();
    public static int gesch = 10;
    public static boolean gws1 = false; public static boolean gws2 = false;
     
   public static ArrayList<Integer> x_kord_f1 = new ArrayList<Integer>();
   public static ArrayList<Integer> y_kord_f1 = new ArrayList<Integer>();
   public static ArrayList<Integer> x_kord_f2 = new ArrayList<Integer>();
   public static ArrayList<Integer> y_kord_f2 = new ArrayList<Integer>();
   public static Toolkit tk = Toolkit.getDefaultToolkit();
   public static int xSize = ((int) tk.getScreenSize().getWidth());
   public static int ySize = ((int) tk.getScreenSize().getHeight());
   
   public static String ergebenisse ="";
   
   public static int p = 0;
   
   public Bikes() throws InterruptedException {
       Timer timer = new Timer(); 
       long mylong = 1;
       f2x1 = 50;f2y1 = 50;
       f1x1 = xSize-100; f1y1 = ySize-100;
       
       timer.schedule(new TimerTask() {
           @Override
           public void run() {
               try {
                   game();
               } catch (InterruptedException ex) {
                   Logger.getLogger(Bikes.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       }, 0, mylong);}
  
      public void game() throws InterruptedException{
            System.out.print("");
            if(Stop==false){
            if(a == -1){
                f1y1 -= gesch;
                main.jf.setContentPane(pc);
                Thread.sleep(10);
                vergleichen();
                 
            }
             if(b == -1){
                f1y1 += gesch;
                main.jf.setContentPane(pc);
                Thread.sleep(10);
                vergleichen();
            }
              if(c == -1){
                f1x1 -= gesch;
                main.jf.setContentPane(pc);
                Thread.sleep(10);
                vergleichen();
                
            }
               if(d == -1){
                f1x1 += gesch;
                main.jf.setContentPane(pc);
                Thread.sleep(10);
                vergleichen();
                
            }
               if(e == -1){
                f2y1 -= gesch;
                main.jf.setContentPane(pc);
                Thread.sleep(10);
                vergleichen2();
              
            }
               if(f == -1){
                f2y1 += gesch;
                main.jf.setContentPane(pc);
                Thread.sleep(10);
                vergleichen2();
               
            }
               if(g == -1){
                f2x1 -= gesch;
                main.jf.setContentPane(pc);
                Thread.sleep(10);
                vergleichen2();
               
            }
               if(h == -1){
                f2x1 += gesch;
                main.jf.setContentPane(pc);
                Thread.sleep(10);
                vergleichen2();
                
            }
            }
        }

        
    
  
    public void vergleichen(){
        for(int i = 0; i<x_kord_f1.size(); i++){
                    if(f1y1 == Bikes.y_kord_f2.get(i)&& f1x1 == Bikes.x_kord_f2.get(i)){
                        gws2 = true;
                    }
                    if(f1y1 == Bikes.y_kord_f1.get(i)&& f1x1 == Bikes.x_kord_f1.get(i)){
                       gws2 = true;
                    }
                    
                }
                x_kord_f1.add(p, Bikes.f1x1);
                y_kord_f1.add(p, Bikes.f1y1);
                x_kord_f2.add(p, Bikes.f2x1);
                y_kord_f2.add(p, Bikes.f2y1);
                p++;
    }
    public void vergleichen2(){
        
        for(int i = 0; i<x_kord_f1.size(); i++){
                    if(f2y1 == Bikes.y_kord_f1.get(i) && f2x1 == Bikes.x_kord_f1.get(i)){
                      gws1 = true;
                    }
                    if(f2y1 == Bikes.y_kord_f2.get(i)&& f2x1 == Bikes.x_kord_f2.get(i)){
                        gws1 = true;
                    }
                    
                }
                
        stoppenbeimende();
    }
    public void stoppenbeimende(){
        if(f1x1 >= xSize || f1y1 >= ySize || f1x1 < 0 || f1y1 < 0 ){
            
            gws2 = true;
            
        }
        if(f2x1 >= xSize || f2y1 >= ySize || f2x1 < 0 || f2y1 < 0 ){
            
            gws1= true;
            
        }
    }
    
    
    
    
}
