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
public class Skier implements Comparable<Skier>{
    
    private String name;
    private int score;
    private int length;
    private int[] judgeVotes;
    private List<Integer> jumps;
    
    public Skier(String name){
        this.name = name;
        this.score = 0;
        this.length = 0;
        this.judgeVotes = new int[5];
        this.jumps = new ArrayList<Integer>();
    }
    
    public void addScore(int points){
        this.score += points;
    }
    
    public int getLength(){
        Random r = new Random();
        this.length = r.nextInt((120 - 60) + 1) + 60;
        this.jumps.add(this.length);
        return this.length;
    }
    
    public int[] getVotes(){
        Random r = new Random();
        for(int i = 0; i < 5; i++){
            this.judgeVotes[i] = r.nextInt((20 - 10) + 1) + 10;
        }
        return this.judgeVotes;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getScore(){
        return  this.score;
    }
    
    public String getScoreString(){
        return "(" + this.score + " points)";
    }
    
    public String getJumps(){
        int commas = jumps.size() - 1;
        String s = "jump lengths: ";
        for(int jump : jumps){
            s = s + jump + " m";
            if(commas > 0){
                s = s + ", ";
                commas--;
            }
        }
        return s;
    }
    
    public int compareTo(Skier skier){
        if(this.score == skier.getScore()){
            return 0;
        }
        else if(this.score > skier.getScore()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
