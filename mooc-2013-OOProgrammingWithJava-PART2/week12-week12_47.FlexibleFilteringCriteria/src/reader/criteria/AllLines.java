/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Syn
 */
public class AllLines implements Criterion{
    
    public AllLines(){
        
    }
    
    public boolean complies(String line){
         return line.contains(line);
    }
    
}
