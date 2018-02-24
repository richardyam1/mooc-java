/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author Syn
 */

import java.util.*;
public class Box implements Thing{
    
    private int maximumCapacity;
    private List<Thing> items;
   
    
    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.items = new ArrayList<Thing>();
        
    }
    
    public int getVolume(){
       int currentVol = 0;
       for(Thing things : this.items){
           currentVol += things.getVolume();
       }
       return currentVol;
    }
    
    public boolean addThing(Thing thing){
        if(thing.getVolume() + getVolume() <= this.maximumCapacity){
            this.items.add(thing);

            return true;
        }
        return false;
    }
}
