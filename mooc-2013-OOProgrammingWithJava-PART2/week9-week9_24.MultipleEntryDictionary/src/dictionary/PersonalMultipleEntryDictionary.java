/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.*;
/**
 *
 * @author Syn
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    
    private Map<String, Set<String>> entries;
    
    public PersonalMultipleEntryDictionary(){
        this.entries = new HashMap<String, Set<String>>();
    }
    
    public void add(String word, String entry){
        if(!this.entries.containsKey(word)){
            this.entries.put(word, new HashSet<String>());
        }
        this.entries.get(word).add(entry);
    }
    
    public Set<String> translate(String word){
        if(this.entries.containsKey(word)){
            return this.entries.get(word);
        }
        return null;
    }
    
    public void remove(String word){
        this.entries.remove(word);
    }
    
}
