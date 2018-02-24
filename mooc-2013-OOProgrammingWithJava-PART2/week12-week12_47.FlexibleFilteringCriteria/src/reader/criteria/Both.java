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
public class Both implements Criterion{
    

    private Criterion criterion1;
    private Criterion criterion2;
    
    public Both(Criterion criterion1, Criterion criterion2){
        this.criterion1 = criterion1;
        this.criterion2 = criterion2;
    }
    
    public boolean complies(String line){

        return this.criterion1.complies(line) && this.criterion2.complies(line);
    }
}
