/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author Syn
 */
public enum Rating {
    BAD,MEDIOCRE,NOT_WATCHED,NEUTRAL,FINE,GOOD;
    
    public int getValue(){
        if(this.equals(BAD)){
            return -5;
        }
        else if(this.equals(MEDIOCRE)){
            return -3;
        }
        else if(this.equals(NOT_WATCHED)){
            return 0;
        }
        else if(this.equals(NEUTRAL)){
            return 1;
        }        
        else if(this.equals(FINE)){
            return 3;
        }
        else if(this.equals(GOOD)){
            return 5;
        }

        return 0;
    }
}
