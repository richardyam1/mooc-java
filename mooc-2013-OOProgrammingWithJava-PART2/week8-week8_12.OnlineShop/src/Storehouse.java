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
public class Storehouse {
    
    private Map<String, Integer> storePrice = new HashMap<String, Integer>();
    private Map<String, Integer> storeStock = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock){

        storePrice.put(product, price);
        storeStock.put(product, stock);
    }
    
    public int price(String product){
        if(storePrice.get(product) == null){
            return -99;
        }
        return storePrice.get(product);
    }
    
    public int stock(String product){
        if(storeStock.get(product) == null){
            return 0;
        }
        return storeStock.get(product);
    }
    
    public boolean take(String product){
        if(storeStock.get(product) == null){
            return false;
        }
        
        if(storeStock.get(product) > 0){
            storeStock.put(product, storeStock.get(product) - 1);
            return true;
        }
        
      
        return false;
    }
    
    public Set<String> products(){
        Set<String> set = new HashSet<String>();
        for(String key: storePrice.keySet()){
            set.add(key);
        }
        return set;
    }
}
