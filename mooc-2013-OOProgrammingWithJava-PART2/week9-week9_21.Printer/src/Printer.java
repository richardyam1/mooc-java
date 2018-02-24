/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syn
 */
import java.io.File;
import java.util.*;
public class Printer {
    
    private String fileName;
    
    public Printer(String fileName) throws Exception{
        this.fileName = fileName;
    }
    
    public void printLinesWhichContain(String word) throws Exception{
        File file = new File(this.fileName);
        Scanner reader = new Scanner(file, "UTF-8");
        //String string = "";
        if(word.isEmpty()){           
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
        }
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            if(line.contains(word)){
                System.out.println(line);
            }
        }
        reader.close();
    }
}
