/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import gameoflife.GameOfLifeBoard;
import java.util.Random;
import java.util.*;
/**
 *
 * @author Syn
 */

public class PersonalBoard extends GameOfLifeBoard{
    
    private List<Integer> viewDirection;
 
    public PersonalBoard(int width, int height) {
        super(width, height);
        viewDirection = new ArrayList<Integer>();
        viewDirection.add(-1);
        viewDirection.add(0);
        viewDirection.add(1);
    }
    
    
    public void turnToLiving(int x, int y){
        if(x < getWidth() && y < getHeight() && x >= 0 && y >= 0 ){

            super.getBoard()[x][y] = true;
        }
    } 
    
  
    public void turnToDead(int x, int y){
        if(x < getWidth() && y < getHeight() && x >= 0 && y >= 0){

            super.getBoard()[x][y] = false;
        }
    }
    
    
    public boolean isAlive(int x, int y){
        if(x < getWidth() && y < getHeight() && x >= 0 && y >= 0){
            return super.getBoard()[x][y];
        }
        else{
            return false;
        }
    }
    
    public void initiateRandomCells(double probabilityForEachCell){
   
            for(int x = 0; x < getWidth(); x++ ){
                for(int y = 0; y < getHeight(); y++){
                    
                    Random rand = new Random();
                    double r = rand.nextDouble();
                    if(r <= probabilityForEachCell && probabilityForEachCell != 0){
                        turnToLiving(x,y);                            
                    }
                 
                }
            }

    }
    
    public int getNumberOfLivingNeighbours(int x, int y){
        int numberLiving = 0;
        
        for (int xNeighbour : viewDirection) {
            for (int yNeigbour : viewDirection) {
                if (xNeighbour == 0 && yNeigbour == 0) {
                    continue;
                }
 
                if (!isAlive(x + xNeighbour, y + yNeigbour)) {
                    continue;
                }
 
                numberLiving++;
            }
        }       

        
        return numberLiving;
    }
    
    public void manageCell(int x, int y, int livingNeighbours){
        livingNeighbours = getNumberOfLivingNeighbours(x, y);
        
        if(livingNeighbours < 2 || livingNeighbours > 3){
            if(isAlive(x, y)){
                turnToDead(x, y);                
            }

        }
        
        else if(livingNeighbours == 3 && !isAlive(x,y)){
            turnToLiving(x,y);
        }
    }
 

}
