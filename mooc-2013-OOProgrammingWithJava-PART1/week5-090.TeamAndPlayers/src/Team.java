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
public class Team {
   private String name;
   private ArrayList<Player> players;
   private int maxSize;

   
   public Team(String name){
       this.name = name;
       this.players = new ArrayList<Player>();
       this.maxSize = 16;
   }
   
   public String getName(){
       return this.name;
   }
   
   public void addPlayer(Player player){
       if(this.players.size() < this.maxSize){
           this.players.add(player);
       }
       
   }
   
   public void printPlayers(){
       for(Player players : this.players){
           System.out.println(players);
       }
   }
   
   public void setMaxSize(int maxSize){
       this.maxSize = maxSize;
   }
   
   public int size(){
       return this.players.size();
   }
   
   public int goals(){
       int totalGoals = 0;
       for(Player goals : this.players){
           totalGoals += goals.goals();
       }
       return totalGoals;
   }
}
