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
public class OneThingBox extends Box{
    
    private List<Thing> oneThing;
    
    public OneThingBox(){
        this.oneThing = new ArrayList<Thing>();
    }
    
    public void add(Thing thing){
        if(oneThing.size() != 1){
            oneThing.add(thing);
        }
    }
    
    public boolean isInTheBox(Thing thing){
        return oneThing.contains(thing);
    }
}
