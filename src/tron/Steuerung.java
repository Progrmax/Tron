
package tron;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;


public class Steuerung{

    
    public Steuerung() {
       pfeiltasten();
       
    }
 
    public PanelClass pc = new PanelClass();
    
    public void pfeiltasten(){
        
       main.jf.addKeyListener(new KeyAdapter() {
           @Override
           
            public void keyPressed(KeyEvent e) {
                
                switch(e.getKeyCode()) {                    
                    
                    case VK_UP:
                        if(Bikes.b1==0){
                        Bikes.b = 0; Bikes.c = 0; Bikes.d = 0; Bikes.a = -1; Bikes.a1 = 1;Bikes.b1=0;Bikes.c1=0;Bikes.d1=0;
                        }
                    break;
                    case VK_DOWN:
                        if(Bikes.a1==0){
                         Bikes.a = 0; Bikes.c = 0; Bikes.d = 0; Bikes.b = -1;Bikes.b1=1;Bikes.a1=0;Bikes.c1=0;Bikes.d1=0;
                        }
                    break;
                    case VK_LEFT:
                        if(Bikes.d1==0){
                        Bikes.a = 0; Bikes.b = 0; Bikes.d = 0; Bikes.c = -1; Bikes.c1=1;Bikes.b1=0;Bikes.a1=0;Bikes.d1=0; 
                        }
                    break;
                    case VK_RIGHT: 
                        if(Bikes.c1==0){
                         Bikes.a = 0; Bikes.b = 0; Bikes.d = -1; Bikes.c = 0;Bikes.d1=1;Bikes.b1=0;Bikes.c1=0;Bikes.a1=0; 
                        }
                    break;
                    case VK_ENTER: System.out.println(Bikes.x_kord_f1.toString());System.out.println(Bikes.y_kord_f1.toString());
                    break;
                    
                    case VK_W: if(Bikes.f1==0){Bikes.f = 0; Bikes.g = 0; Bikes.h = 0; Bikes.e = -1;Bikes.e1=1;Bikes.f1=0;Bikes.g1=0;Bikes.h1=0; }
                    break;
                    case VK_S: if(Bikes.e1==0){Bikes.e = 0; Bikes.g = 0; Bikes.h = 0; Bikes.f = -1;Bikes.f1=1;Bikes.e1=0;Bikes.g1=0;Bikes.h1=0; }
                    break;
                    case VK_A: if(Bikes.h1==0){Bikes.f = 0; Bikes.e = 0; Bikes.h = 0; Bikes.g = -1;Bikes.g1=1;Bikes.f1=0;Bikes.e1=0;Bikes.h1=0; }
                    break;
                    case VK_D: if(Bikes.g1==0){Bikes.e = 0; Bikes.g = 0; Bikes.f = 0; Bikes.h = -1;Bikes.h1=1;Bikes.f1=0;Bikes.g1=0;Bikes.e1=0; }
                    break;
                    case VK_MINUS: 
                        if(Bikes.gesch >= 5){Bikes.gesch -=1;}
                    break;
                    case VK_PLUS: if(Bikes.gesch <= 30){Bikes.gesch +=1;}
                    break;
                    default: 
                    break;
                } 
                
            }
            
        });
        
    }
   
}
