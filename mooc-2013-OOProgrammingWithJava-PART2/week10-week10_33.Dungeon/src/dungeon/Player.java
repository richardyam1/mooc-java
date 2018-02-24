/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Syn
 */
public class Player {
    
    private int x;
    private int y;
    
    public Player(){
        this.x = 0;
        this.y = 0;
    }
    
    public void moveX(int x){
        this.x += x;
    }
    
    public void moveY(int y){
        this.y += y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
}
