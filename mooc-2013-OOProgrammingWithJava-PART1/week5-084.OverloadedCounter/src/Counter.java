/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syn
 */
public class Counter {
    
    private int startingValue;
    private boolean check;
    
    
    public Counter(int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
        
       
    }
    
    public Counter(int startingValue){
        this.startingValue = startingValue;
        this.check = false;
    }
    
    public Counter(boolean check){
        this.startingValue = 0;
        this.check = check;
 
    }
    
    public Counter(){
        this.startingValue = 0;
        this.check = false;
    }
    
    public int value(){
        return this.startingValue;
    }
    
    public void increase(){
        this.startingValue++;
    }
    
    public void decrease(){
        this.startingValue--;
        if(this.check == true && this.startingValue < 0){
            this.startingValue = 0;
        }
        
    }
    
    public void increase(int increaseAmount){
        if(increaseAmount >= 0){
            this.startingValue += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount){
        if(decreaseAmount >= 0){
            this.startingValue -= decreaseAmount;
            if(this.check == true && this.startingValue < 0){
                this.startingValue = 0;
            }
        }
        
    }
}
