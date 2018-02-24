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
public class TextUserInterface {
    
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        System.out.println("");
        
        while(true){
            System.out.print("Statement: ");
            String statement = this.reader.nextLine();
            
            if(statement.equals("quit")){
                break;
            }
            else if(statement.equals("add")){
                System.out.print("In Finnish: ");
                String finnish = this.reader.nextLine();
               
                System.out.print("Translation: ");
                String translation = this.reader.nextLine();
                this.dictionary.add(finnish, translation);
            }
            else if(statement.equals("translate")){
                System.out.print("Give a word: ");
                String word = this.reader.nextLine();
               
                System.out.println("Translation: " + this.dictionary.translate(word));
            }
            else{
                 System.out.println("Unknown statement");
            }
            System.out.println("");
           
        }
        System.out.println("Cheers!");
    }
    
    
}
