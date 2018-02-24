/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;
import java.awt.event.*;
import java.awt.Component;
/**
 *
 * @author Syn
 */
public class KeyboardListener implements KeyListener{
    
    private Component component;
    private Figure figure;
    
    public KeyboardListener(Component component, Figure figure){
        this.component = component;
        this.figure = figure;
    }
    
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            figure.move(-1, 0);
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            figure.move(1, 0);
        }
        else if(e.getKeyCode() == KeyEvent.VK_UP){
            figure.move(0, -1);
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            figure.move(0, 1);
        }
        component.repaint();
    }
    
    public void keyReleased(KeyEvent e){
        
    }
    
    public void keyTyped(KeyEvent ke){
        
    }
}
