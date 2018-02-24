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
public class Flight {    
 
    private ArrayList<String> flight;
    
    public Flight(){
        this.flight = new ArrayList<String>();
    }

    public void add(String name, String depart, String destination){
        this.flight.add(name  + " (" + depart + "-" + destination + ")");
    }
    
    public void printFlight(){
        for(int i = 0; i < this.flight.size(); i++){
            System.out.println(flight.get(i));
        }
    }

}
