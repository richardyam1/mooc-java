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
public class Student extends Person{
    
    private int credit;
    
    public Student(String name, String street){
        super(name, street);
        this.credit = 0;
    }
    
    public void study(){
        this.credit++;
    }
    
    public int credits(){
        return this.credit;
    }
    
    public String toString(){
        return  super.toString() + "\n" + "  credits " + this.credit;
    }
}
