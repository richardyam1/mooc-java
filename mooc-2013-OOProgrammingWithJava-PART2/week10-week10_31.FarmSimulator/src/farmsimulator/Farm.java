/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.*;
/**
 *
 * @author Syn
 */
public class Farm implements Alive{
    
    private String owner;
    private Barn barn;
    private List<Cow> cows;
    
    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public void liveHour(){
        for(Cow c: cows){
            c.liveHour();
        }
    }
    
    public void manageCows(){
        this.barn.takeCareOf(this.cows);
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.barn.installMilkingRobot(milkingRobot);
    }
    
    public String toString(){
        
       String farm = "Farm owner: " + this.owner + "\n" + "Barn bulk tank: " + this.barn.toString();
       if(cows.isEmpty()){
           farm = farm + "\n" + "No cows.";
       }
       else{
           farm = farm + "\n" + "Animals:";
           for(Cow c : cows){
               farm = farm + "\n" + "        " + c.toString();
           }
       }
       
       return farm;
    }
}
