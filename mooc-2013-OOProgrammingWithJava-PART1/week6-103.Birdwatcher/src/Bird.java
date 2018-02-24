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
public class Bird {
    private String name;
    private String latin;
    private int observed;
    
    public Bird(String name, String latin){
        this.name = name;
        this.latin = latin;
        this.observed = 0;
    }
    
    public void observeIncrease(){
        this.observed++;
    }
    
    public String name(){
        return this.name;
    }
    
    public String latin(){
        return this.latin;
    }
    
    public String toString(){
        return this.name + " " + this.latin + ": " + this.observed + " observations";
    }
    
}
