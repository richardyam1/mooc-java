/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;
/**
 *
 * @author Syn
 */
public class Thermometer implements Sensor{
    
    private boolean isOn;
    private int measure;
    
    public Thermometer(){
        this.isOn = false;
       
    }
    
    public boolean isOn(){
        return this.isOn;
    }
    
    public void on(){
        this.isOn = true;
    }
    
    public void off(){
        this.isOn = false;
    }
    
    public int measure(){
        if(this.isOn){
            Random r = new Random();
            this.measure = r.nextInt((30 - -30) + 1) + -30;
           
        }
        else{
            throw new IllegalStateException("Thermometer is not on");
        }
        return this.measure;
    }
}
