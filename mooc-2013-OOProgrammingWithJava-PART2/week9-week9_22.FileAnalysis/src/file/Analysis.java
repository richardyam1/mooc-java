/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.File;
import java.util.*;
/**
 *
 * @author Syn
 */
public class Analysis {
    
    private List<String> lines;
    private File file;
    
    public Analysis(File file) throws Exception{
        this.file = file;
        Scanner reader = new Scanner(this.file, "UTF-8");
        lines = new ArrayList<String>();
        while(reader.hasNextLine()){
            lines.add(reader.nextLine());
        }
    }
    
    public int lines() throws Exception{       
        return lines.size();
    }
    
    public int characters() throws Exception{
        int characters = 0;
        for(String line : lines){
            characters += line.length();
            characters++;
        }
        return characters;
    }
}
