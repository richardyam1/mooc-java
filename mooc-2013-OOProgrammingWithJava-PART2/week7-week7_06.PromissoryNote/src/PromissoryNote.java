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
public class PromissoryNote {
    
    private HashMap<String, Double> promissory; 
   
    public PromissoryNote(){
        this.promissory = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        this.promissory.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if(this.promissory.containsKey(whose)){
            return this.promissory.get(whose);
        }
        return 0;
    }
}
