/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Richard
 */
public class Product {
    private double price;
    private int amount;
    private String name;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
        
        
    }
    
    public void printProduct(){
        System.out.println(name + ", price " + price + ", amount " + amount); 
    }
}
