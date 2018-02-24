/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;
import wormgame.Direction;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Syn
 */
public class Worm {
    
    private int x;
    private int y;
    private Direction direction;
    private List<Piece> worm = new ArrayList<Piece>();
    private boolean grow;
    
    public Worm(int originalX, int originalY, Direction originalDirection){
        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;
        worm.add(new Piece(this.x, this.y));
    }
    
    public Direction getDirection(){
        return this.direction;
    }
    
    public void setDirection(Direction dir){
        this.direction = dir;
    }
    
    public int getLength(){
        return worm.size();
    }
    
    public List<Piece> getPieces(){
        return worm;
    }
    
    public void move(){
        if(this.direction == Direction.UP){
            this.y--;
        }
        else if(this.direction == Direction.DOWN){
            this.y++;
        }
        else if(this.direction == Direction.LEFT){
            this.x--;
        }
        else if(this.direction == Direction.RIGHT){
            this.x++;
        }

        if(!grow && getLength() > 2){
            worm.remove(0);
        }
        else{
            grow = false;
        }
        
        worm.add(new Piece(this.x, this.y));
    }
    
    public void grow(){
        grow = true;


    }
    
    public boolean runsInto(Piece piece){
        
        for(int i = 0; i < worm.size(); i++){
            Piece p = worm.get(i);
            if(p.getX() == piece.getX() && p.getY() == piece.getY()){
                return true;
            }
        }
        return false;
    }
    
    public boolean runsIntoItself(){

        for(int i = 0; i < worm.size() - 1; i++){
            Piece p = worm.get(i);
            Piece head = worm.get(worm.size() - 1);
            if(p.getX() == head.getX() && p.getY() == head.getY()){
                return true;
            }
        }
        return false;
    }
    
    public boolean runsIntoWall(int width, int height){
        for(int i = 0; i < worm.size() - 1; i++){
            Piece p = worm.get(i);
            Piece head = worm.get(worm.size() - 1);
            if(head.getX() == width  || head.getX() == -1 || head.getY() == height || head.getY() == -1){
                return true;
            }
        }
        return false;
    }
    
   
}
