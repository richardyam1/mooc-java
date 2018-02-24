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
public class Airplane {
    
    private HashMap<String, String> airplane;   

    
    public Airplane(){
        this.airplane = new HashMap<String, String>();
    }
    
    public void add(String name, int capacity){
       this.airplane.put(name, " (" + capacity + " ppl)");
    }
    
    public String getInfo(String name){
        return name + this.airplane.get(name);
    }
    
    public ArrayList<String> planeList(){
        ArrayList<String> list = new ArrayList<String>();              
        for(String key : this.airplane.keySet()){
            list.add(key +  this.airplane.get(key));
        }
        return list;
    }
    
   
}
