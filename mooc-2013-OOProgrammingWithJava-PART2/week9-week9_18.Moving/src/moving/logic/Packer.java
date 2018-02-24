/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;
import java.util.*;
import moving.domain.Box;
import moving.domain.Thing;
/**
 *
 * @author Syn
 */
public class Packer {
    
    private int boxesVolume;
    
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        List<Box> boxes = new ArrayList<Box>();
        
        Box box = new Box(this.boxesVolume);
        for(Thing items : things){
            
            while(box.addThing(items)){
                System.out.println("testing");
            }
            
            if(!box.addThing(items)){
                boxes.add(box);
                box = new Box(this.boxesVolume);
            }
        }
        System.out.println("number of boxes: "+boxes.size());
        for (Box b : boxes) {
            System.out.println("  things in the box: "+b.getVolume()+" dm^3");
        }
        return boxes;
        
    }
    
    
}
