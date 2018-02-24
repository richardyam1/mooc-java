/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author Syn
 */
public class MindfulDictionary {
    
    private Map<String, String> translate = new HashMap<String, String>();
    private String file;
    
    public MindfulDictionary(){

    }
    
    public MindfulDictionary(String file){
        this.file = file;    
    }
    
    public boolean load(){
        try{
            Scanner s = new Scanner(new File(this.file));
            while(s.hasNextLine()){
                String line = s.nextLine();
                String[] parts = line.split(":");
                this.translate.put(parts[0], parts[1]);
                this.translate.put(parts[1], parts[0]);
            }
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean save() {
        try{
            FileWriter writer = new FileWriter(this.file);
            List<String> inFile = new ArrayList<String>();
            for(String key: this.translate.keySet()){
                if(!inFile.contains(key)){
                    writer.write(key + ":" + this.translate.get(key) + "\n");
                    inFile.add(this.translate.get(key));
                }

             }
            writer.close();
            return true;
        }
        catch(IOException e){
            return false;
        }
        
        
    }
    
    public void add(String word, String translation){
        if(!this.translate.containsKey(word)){
            this.translate.put(word, translation);
            this.translate.put(translation, word);
        }

    }
    
    public String translate(String word){
        return this.translate.get(word);
    }
    
    public void remove(String word){
        String translation = translate(word);
        
        this.translate.remove(word);
        this.translate.remove(translation);
    }
    

}
