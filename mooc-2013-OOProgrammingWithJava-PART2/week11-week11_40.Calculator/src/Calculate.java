/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syn
 */
public class Calculate {
    

    private int outputValue;
    
    public Calculate(){
        this.outputValue = 0;
    }

    public int getOutputValue(){
        return this.outputValue;
    }
    
    public void add(int num){
        this.outputValue += num;
    }
    
    public void minus(int num){
        this.outputValue -= num;
    }
    
    public void resetOutput(){
        this.outputValue = 0;
    }
}
