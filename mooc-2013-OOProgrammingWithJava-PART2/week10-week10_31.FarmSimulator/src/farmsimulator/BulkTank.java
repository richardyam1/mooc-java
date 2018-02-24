/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Syn
 */
public class BulkTank {
    
    private double capacity;
    private double tankVol;
    
    public BulkTank(){
        this.capacity = 2000;
        this.tankVol = 0;
    }
    
    public BulkTank(double capacity){
        this.capacity = capacity;
        this.tankVol = 0;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getVolume(){
        return this.tankVol;
    }
    
    public double howMuchFreeSpace(){
        return this.capacity - this.tankVol;
    }
    
    public void addToTank(double amount){
        if(amount > howMuchFreeSpace()){
            this.tankVol = this.capacity;
        }
        else{
            this.tankVol += amount;
        }
    }
    
    public double getFromTank(double amount){
        if(amount > this.tankVol){
            this.tankVol = 0;
        }
        else{
            this.tankVol -= amount;
        }
        return this.tankVol;
    }
    
    public String toString(){
        return Math.ceil(this.tankVol) + "/" + Math.ceil(this.capacity);
    }
    
}
