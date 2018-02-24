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
public class Hand implements Comparable<Hand>{
    
    private List<Card> hand = new ArrayList<Card>();
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        for(Card card : hand){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
 
    
    public int sum(){
        int sum = 0;
        for(Card card : hand){
            sum += card.getValue();
        }
        return sum;
    }
    
    public int compareTo(Hand hand){
       if(sum() == hand.sum()){
           return 0;
       }
       else if(sum() > hand.sum()){
           return 1;
       }
       else{
           return -1;
       }
    }
    
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitAndValue = new SortAgainstSuitAndValue();
        Collections.sort(hand, suitAndValue);
    }
}
