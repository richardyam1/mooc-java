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
public class ShoppingBasket {
    
    private Map<String, Purchase> basket = new HashMap<String, Purchase>();
    
    public void add(String product, int price){
        if(basket.containsKey(product)){
            basket.get(product).increaseAmount();
        }
        else{
            basket.put(product, new Purchase(product, 1, price));
        }
        
    }
    
    public int price(){
        int price = 0;
        for(Purchase value: basket.values()){
            price += value.price();
        }
        return price;
    }
    
    public void print(){
        for(Purchase p : basket.values()){
            System.out.println(p);
        }
    }
    
}
