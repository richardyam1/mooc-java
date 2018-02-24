package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.List;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.gui.Updatable;
import wormgame.domain.Worm;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    
    public WormGame(int width, int height) {
        
        super(1000, null);
        this.worm = new Worm(width/2, height/2, Direction.DOWN);
        
        Random rn = new Random();
        //this.apple = new Apple(rn.nextInt(width), rn.nextInt(height));
        while(true){
            int appleX = rn.nextInt(width);
            int appleY = rn.nextInt(height);
            boolean overlap = false;
            this.apple = new Apple(appleX, appleY);
            List<Piece> pieces = this.worm.getPieces();
            
            for(Piece p: pieces){
                if(this.apple.getX() == p.getX() && this.apple.getY() == p.getY()){
                    overlap = true;
                 
                }
            }
            if(overlap == false){
                break;
            }
           
        }
        //this.apple = newApple();
        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);

    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        
        this.worm.move();
        
        if(this.worm.runsInto(this.apple)){
            this.worm.grow();
            
            Random rn = new Random();
            //setApple(new Apple(rn.nextInt(width), rn.nextInt(height)));
            
            //setApple(newApple());
            while(true){
                int appleX = rn.nextInt(width);
                int appleY = rn.nextInt(height);
                boolean overlap = false;
                setApple(new Apple(appleX, appleY));
                List<Piece> pieces = this.worm.getPieces();

                for(Piece p: pieces){
                    if(this.apple.getX() == p.getX() && this.apple.getY() == p.getY()){
                        overlap = true;
                        
                    }
                    
                }
                if(overlap == false){
                    break;
                }
                    

            }
        }
        
        if(this.worm.runsIntoItself() || this.worm.runsIntoWall(this.width, this.height)){
            continues = false;
        }
        this.updatable.update();
        
        setDelay(1000/this.worm.getLength());
    }
    
    public Worm getWorm(){
        return this.worm;
    }
    
    public void setWorm(Worm worm){
        this.worm = worm;
    }
    
    public Apple getApple(){
        return this.apple;
    }
    
    public void setApple(Apple apple){
        this.apple = apple;
    }
    
    
    public Apple newApple(){
        Random rn = new Random();
        return new Apple(rn.nextInt(width), rn.nextInt(height));
   }
    


}
