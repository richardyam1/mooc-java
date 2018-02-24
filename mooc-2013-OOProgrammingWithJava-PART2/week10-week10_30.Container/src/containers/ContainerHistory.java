/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;
import java.util.*;
/**
 *
 * @author Syn
 */
public class ContainerHistory {
    
    private ArrayList<Double> history;
    
    public ContainerHistory(){
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.history.add(situation);
    }
    
    public void reset(){
        this.history.clear();
    }
    
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        return Collections.max(this.history);
    }
    
    public double minValue(){
        return Collections.min(this.history);
    }
    
    public double average(){
        if(this.history.isEmpty()){
            return 0;
        }
        
        double sum = 0;
        for(double number : this.history){
            sum += number;
        }
        
        return sum/this.history.size();
    }
    
    public double greatestFluctuation(){
        if(this.history.isEmpty() || this.history.size() == 1){
            return 0;
        }
        
        double greatest = Math.abs(this.history.get(0) - this.history.get(1));
        for(int i = 1; i < this.history.size() - 1; i++){
            double change = Math.abs(this.history.get(i) - this.history.get(i + 1));
            if(change > greatest){
                greatest = change;
            }
        }
        return greatest;
    }
    
    public double variance(){
        if(this.history.isEmpty() || this.history.size() == 1){
            return 0;
        }
        double average = average();
        double n = this.history.size() - 1;
        double sum = 0;
        for(int i = 0; i < this.history.size(); i++){
            sum += Math.pow((this.history.get(i) - average), 2);
        }
        return sum/n;
    }
}
