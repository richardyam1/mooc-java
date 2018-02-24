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
public class Container {
    private ArrayList<Suitcase> suitcaseList = new ArrayList();
    private int weightLimit;
    private int totalWeight;
    
    public Container(int weightLimit){
        this.weightLimit = weightLimit;
        this.suitcaseList = new ArrayList();
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + this.totalWeight <= this.weightLimit){
            suitcaseList.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }
    
    public String toString(){
        return suitcaseList.size() + " suitcases " + "(" + this.totalWeight + " kg)";
    }
    
    public void printThings(){
        for(Suitcase items : suitcaseList){
            items.printThings();
        }
    }
}
