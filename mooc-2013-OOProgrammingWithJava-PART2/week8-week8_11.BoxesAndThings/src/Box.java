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
public class Box implements ToBeStored{
    
    private double maxWeight;
    private double weight;
    private ArrayList<ToBeStored> list = new ArrayList<ToBeStored>();
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.weight = 0;
        this.list = new ArrayList<ToBeStored>();
    }
    
    public double weight(){
        this.weight = 0;
        for(ToBeStored w : list){
            this.weight += w.weight();
        }
        
        return this.weight;
    }
    
    public void add(Book book){
        if(this.weight + book.weight() < this.maxWeight){
            this.list.add(book);
        }
    }
    
    public void add(CD cd){
        if(this.weight + cd.weight() < this.maxWeight){
            this.list.add(cd);
        }
    }
    
    public void add(Box box){
        if(this.weight + box.weight() < this.maxWeight){
            this.list.add(box);
        }
    }
    
    public void add(ToBeStored t){
        if(this.weight + t.weight() < this.maxWeight){
            this.list.add(t);
        }
    }
    
    
    
    public String toString(){
        return "Box: " + this.list.size() + " things, total weight " + weight() + " kg"; 
    }
}
