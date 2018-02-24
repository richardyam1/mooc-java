/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
import java.util.*;
/**
 *
 * @author Syn
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    
    private int duplicates;
    private Set<String> unique;
    
    public PersonalDuplicateRemover(){
        this.duplicates = 0;
        this.unique = new HashSet<String>();
    }
    
    public void add(String characterString){
        if(this.unique.contains(characterString)){
            this.duplicates++;
        }
        this.unique.add(characterString);
    }
    
    public int getNumberOfDetectedDuplicates(){
        return this.duplicates;
    }
    
    public Set<String> getUniqueCharacterStrings(){
        return this.unique;
    }
    
    public void empty(){
        this.duplicates = 0;
        this.unique.clear();
    }
}
