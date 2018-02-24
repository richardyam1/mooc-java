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
public class Not implements Criterion{
    
    private Criterion criterion;
    
    public Not(Criterion criterion){
        this.criterion = criterion;
    }
    
    public boolean complies(String line){
        return !this.criterion.complies(line);
    }
}
