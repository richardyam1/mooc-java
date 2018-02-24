/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;
import java.util.*;
/**
 *
 * @author Syn
 */
public class MaxWeightBox extends Box{
    
    private int maxWeight;

    private List<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    
    public void add(Thing thing){
        int currentWeight = 0;
        for(Thing things: things){
            currentWeight += things.getWeight();
        }
        if(currentWeight + thing.getWeight() <= this.maxWeight){
            things.add(thing);
        }
    }
    
    public boolean isInTheBox(Thing thing){
        return things.contains(thing);
    }
    
}
