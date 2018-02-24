/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;
import java.util.*;
/**
 *
 * @author Syn
 */
public class Employees {
    
    private List<Person> employees = new ArrayList<Person>();
    
    public Employees(){
        
    }
    
    public void add(Person person){
        employees.add(person);
    }
    
    public void add(List<Person> persons){
        for(Person p : persons){
            employees.add(p);
        }
    }
    
    public void print(){
       Iterator<Person> iterator = employees.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        while(iterator.hasNext()){
            Person p = iterator.next();
            if(p.getEducation().equals(education)){
                System.out.println(p);
            }

        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator(); 
        while(iterator.hasNext()){
            if(iterator.next().getEducation().equals(education)){
                iterator.remove();
            }
        }
    }
}
