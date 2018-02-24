/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;
import reference.domain.Person;
import java.util.Comparator;
import java.util.Map;
import reference.Main;
/**
 *
 * @author Syn
 */
public class PersonComparator implements Comparator<Person>{
    
    private Map<Person, Integer> peopleIdentities;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities){
        this.peopleIdentities = peopleIdentities;
    }
    

    
    public int compare(Person person1, Person person2){
        
        if(this.peopleIdentities.get(person1) == this.peopleIdentities.get(person2)){
            return 0;
        }
        else if(this.peopleIdentities.get(person1) > this.peopleIdentities.get(person2)){
            return -1;
        }
        else{
            return 1;
        }

        
    }
    
}
