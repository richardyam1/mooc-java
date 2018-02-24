/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.*;
/**
 *
 * @author Syn
 */
public class AverageSensor implements Sensor{
    

    private List<Integer> measures;
    private ArrayList<Sensor> sensors;
    
    public AverageSensor(){

       this.sensors = new ArrayList<Sensor>();
       this.measures = new ArrayList<Integer>();
    }
    
    public boolean isOn(){

        for(Sensor i : sensors){
            if(!i.isOn()){
                return false;
            }

        }
        return true;
      
    }
    
    public void on(){
        for(Sensor i : this.sensors){
            i.on();
        }

    }
    
    public void off(){
        for(Sensor i : this.sensors){
            i.off();
        }
    }
    
    public int measure(){
        int total = 0;
        int average = 0;
        if(this.isOn() == false || this.sensors.size() == 0){
            throw new IllegalStateException("Invalid action");
        }
        for(Sensor i : this.sensors){
            total += i.measure();
        }
        average = total/sensors.size();
        this.measures.add(average);
        return average;
    }
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }
    
    public List<Integer> readings(){
        return this.measures;
    }
}
