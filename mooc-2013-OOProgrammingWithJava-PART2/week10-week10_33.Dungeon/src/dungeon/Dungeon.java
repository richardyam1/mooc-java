/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Syn
 */
public class Dungeon {
    
    private Scanner reader = new Scanner(System.in);
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;

    private Player player = new Player();        
    private List<Vampire> vampiresInPlay = new ArrayList<Vampire>();
    private Random r = new Random();
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;

   }
    
    public void run(){
        createVampires();
        while(true){
            if(vampiresInPlay.isEmpty()){
                System.out.println("YOU WIN");
                break;
            }
            else if(this.moves == 0){
                System.out.println("YOU LOSE");
                break;
            }
            printStatus();
            drawMap();
            move(); 
            checkCollision();
        }

        
    }
    
    public void createVampires(){
        while(true){
            if(vampiresInPlay.size() == this.vampires){
                break;
            }            
            int randomX = r.nextInt(this.length);
            int randomY = r.nextInt(this.height);
            if(!vampiresInPlay.contains(new Vampire(randomX, randomY)) && (randomX + randomY != 0)){
                vampiresInPlay.add(new Vampire(randomX, randomY));
            } 

           
        }

       
    }
    
    public void printStatus(){
        System.out.println(this.moves);
        System.out.println("");
        System.out.println("@ " + player.getX() + " " + player.getY());
        for(int i = 0; i < vampiresInPlay.size(); i++){
            System.out.println("v " + vampiresInPlay.get(i).getX() + " " + vampiresInPlay.get(i).getY());
        }
        System.out.println("");
    }
    
    public void drawMap(){

        for(int i = 0; i < this.height; i++){
            for(int j = 0; j < this.length; j++){
                if(i == player.getY() && j == player.getX()){
                    System.out.print("@");
                }
                
                else{
                    boolean vampireIsHere = false;
                    for(Vampire v : vampiresInPlay){
                        if(i == v.getY() && j == v.getX()){
                            System.out.print("v");
                            vampireIsHere = true;
                        }

                    }
                    if(vampireIsHere == false){
                        System.out.print(".");
                    }
                    
                }
                
            }
            System.out.println("");
        }
        
    }
    
    public void move(){
        System.out.println("");
        String moveInputs = reader.nextLine();
        String[] moves = moveInputs.split("");
        for(int i = 0; i < moves.length; i++){
            movePlayer(moves[i]);
            
        }
        this.moves--;
        moveVampire();
    }
    
    public void movePlayer(String move){
        if(move.equals("w") && player.getY() - 1 >= 0){
            player.moveY(-1);
            checkCollision();
            //moveVampire();
        }
        
        else if(move.equals("s") && player.getY() + 1 < this.height){
            player.moveY(1);
            checkCollision();
           // moveVampire();
        }
        
        else if(move.equals("a") && player.getX() - 1 >= 0){
            player.moveX(-1);
            checkCollision();
            //moveVampire();
        }
        
        else if(move.equals("d") && player.getX() + 1 <  this.length){
            player.moveX(1);
            checkCollision();
            //moveVampire();
        }
    }
    
    public void moveVampire(){
        if(this.vampiresMove == true && !vampiresInPlay.isEmpty()){
            for(Vampire v: vampiresInPlay){
                int move = r.nextInt(4);

                if(move == 0 && v.getY() - 1 >= 0 && !vampiresInPlay.contains(new Vampire(v.getX(), v.getY() - 1))){
                    v.moveY(-1);
                    
                }
                else if(move == 1 && v.getY() + 1 < this.height && !vampiresInPlay.contains(new Vampire(v.getX(), v.getY() + 1))){
                    v.moveY(1);
               

                }

                else if(move == 2 && v.getX() - 1 >= 0 && !vampiresInPlay.contains(new Vampire(v.getX() - 1, v.getY()))){
                    v.moveX(-1);
              
                }

                else if(move == 3 && v.getX() + 1 <  this.length && !vampiresInPlay.contains(new Vampire(v.getX() + 1, v.getY()))){
                    v.moveX(1);
                     
                }
               
            }
        }
    }
    
    public void checkCollision(){
        /*
        for(Vampire v: vampiresInPlay){
            if(player.getX() == v.getX() && player.getY() == v.getY()){
               vampiresInPlay.remove(v);

            }
        }
*/
        if(vampiresInPlay.contains(new Vampire(player.getX(), player.getY()))){
            vampiresInPlay.remove(new Vampire(player.getX(), player.getY()));
        }
    }   


}
