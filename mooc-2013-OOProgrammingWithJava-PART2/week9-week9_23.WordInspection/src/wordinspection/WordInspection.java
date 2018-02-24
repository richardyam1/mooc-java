/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;
import java.util.*;
import java.io.File;
/**
 *
 * @author Syn
 */
public class WordInspection {
    
    private List<String> lines;
    private File file;
    
    public WordInspection(File file) throws Exception{
        this.file = file;
        Scanner reader = new Scanner(this.file, "UTF-8");
        this.lines = new ArrayList<String>();
        while(reader.hasNextLine()){
            this.lines.add(reader.nextLine());
        }
    }
    
    public int wordCount() throws Exception{
        int words = 0;
        for(String line : lines){
            String[] split = line.split("\\s");
            words += split.length;
        }
        System.out.println(words);
        return words;
        
    }
    
    public List<String> wordsContainingZ()throws Exception{
        List<String> wordZ = new ArrayList<String>();
         for(String line : lines){
             String[] split = line.split("\\s");
             for(int i = 0; i < split.length; i++){
                 if(split[i].contains("z")){
                     wordZ.add(split[i]);
                 }
             }
         }
       
        return wordZ;
    }
    
    public List<String> wordsEndingInL() throws Exception{
        List<String> wordsEndingInL = new ArrayList<String>();
        for(String line : lines){
            String[] split = line.split("\\s");
            for(int i = 0; i < split.length; i++){
                String s = split[i];               
               
                if(s.endsWith("l")){
                    wordsEndingInL.add(split[i]);
                }
            }
        }
        
        return wordsEndingInL;
    }
    
    public List<String> palindromes()throws Exception{
       List<String> palindromes = new ArrayList<String>();
       for(String line : lines){
           String reverse = "";
           for(int i = line.length() - 1; i >= 0; i--){
               reverse = reverse + line.charAt(i);
           }
           
           if(line.equals(reverse)){
               palindromes.add(line);
           }
               
       }
       return palindromes;
    }
    
    public List<String> wordsWhichContainAllVowels()throws Exception{
        List<String> allVowels = new ArrayList<String>();
        for(String line : lines){
            String[] split = line.split("\\s");
            for(int i = 0; i < split.length; i++){
                String s = split[i];
                if(s.contains("a") && s.contains("e") && s.contains("i") && s.contains("o") && s.contains("u") && s.contains("y") && s.contains("ä") && s.contains("ö")){
                    allVowels.add(s);
                }
            }
        }
        return allVowels;
    }
}
