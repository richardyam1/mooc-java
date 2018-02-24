/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;
import java.util.*;
/**
 *
 * @author Syn
 */
public class Group implements Movable{
    
    private List<Movable> organism;
    
    public Group(){
        this.organism = new ArrayList<Movable>();
    }
    
    public String toString(){
        String move = "";
        for(Movable o : this.organism){
            move += o.toString() + "\n";
        }
        return move;
    }
    
    public void addToGroup(Movable movable){
        this.organism.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable o : this.organism){
            o.move(dx, dy);
        }
    }
}
