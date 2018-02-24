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
public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){      
        if(this.owners.get(plate) != null){
            return false;
        }
        this.owners.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate){
        if(plate == null){
            return null;
        }
        return this.owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        if(this.owners.get(plate) == null){
            return false;
        }
        this.owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates(){
       for(RegistrationPlate key: this.owners.keySet()){
           System.out.println(key);
       } 
    }
    
    public void printOwners(){
       ArrayList<String> list = new ArrayList<String>(); 
       for(RegistrationPlate key : this.owners.keySet()){
           if(!list.contains(this.owners.get(key))){
               list.add(this.owners.get(key));
               System.out.println(this.owners.get(key));
           }
       }
        
    }
}
