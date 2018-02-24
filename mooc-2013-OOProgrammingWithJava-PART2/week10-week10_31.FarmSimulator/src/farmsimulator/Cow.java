/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.Random;
/**
 *
 * @author Syn
 */
public class Cow implements Milkable, Alive {
    
    private String name;
    private int capacity;
    private double amount;

    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
        this.capacity = 15 + new Random().nextInt(26);
        Random rand = new Random();
        int number = rand.nextInt(NAMES.length);
        this.name = NAMES[number];
    }
    
    public Cow(String name){
        this.capacity = 15 + new Random().nextInt(26);
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public String toString(){
        return this.name + " " + Math.ceil(this.amount) + "/" + this.capacity;
    }
    
    public double milk(){
        double tempMilk = this.amount;
        this.amount = 0;
        return tempMilk;
    }
    
    public void liveHour(){

        double milkProduced = Math.random() * (2.0 - 0.7) + 0.7;
        if(this.amount + milkProduced <= this.capacity){
            this.amount += milkProduced;
        }
        else{
            this.amount = this.capacity;
        }
    }
        
}


