/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;
import wormgame.domain.Worm;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import wormgame.Direction;
/**
 *
 * @author Syn
 */
public class KeyboardListener implements KeyListener{
    
    private Worm worm;

    
    public KeyboardListener(Worm worm){
        this.worm = worm;

    }
    
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            this.worm.setDirection(Direction.LEFT);
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            this.worm.setDirection(Direction.RIGHT);
        }
        else if(e.getKeyCode() == KeyEvent.VK_UP){
            this.worm.setDirection(Direction.UP);
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            this.worm.setDirection(Direction.DOWN);
        }
    }
    
    public void keyReleased(KeyEvent e){
        
    }
    
    public void keyTyped(KeyEvent ke){
        
    }
}
