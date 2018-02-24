/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syn
 */
import java.util.*;
public class Suitcase {
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int weightLimit;

    
    public Suitcase(int weightLimit){
        this.things = new ArrayList<Thing>();
        this.weightLimit = weightLimit;

    }
    
    public void addThing(Thing thing){
        if(totalWeight() + thing.getWeight() <= this.weightLimit){
            this.things.add(thing);

        }        
    }
    
    public String toString(){
        if(this.things.size() == 0){
            return "empty " + "(" + totalWeight() + " kg)";
        }
        
        else if(this.things.size() == 1){
            return this.things.size() + " thing (" + totalWeight() + " kg)";
        }
       
        return this.things.size() + " things (" + totalWeight() + " kg)";
        
    }
    
    public void printThings(){
        for(Thing item : things){
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Thing item : things){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Thing heaviestThing(){
        if(things.size() == 0){
            return null;
        }
        Thing heaviest = things.get(0);
        
        for(Thing item : things){
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
}