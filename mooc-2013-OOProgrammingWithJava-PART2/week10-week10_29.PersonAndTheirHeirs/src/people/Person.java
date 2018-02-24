/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Syn
 */
public class Person {
    
    private String name;
    private String street;
    
    public Person(String name, String street){
        this.name = name;
        this.street = street;
    }
    
    public String toString(){
        return this.name + "\n" + "  " + this.street;
    }
}
