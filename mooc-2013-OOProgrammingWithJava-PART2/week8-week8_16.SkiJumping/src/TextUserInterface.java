/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syn
 */
import java.util.*;
public class TextUserInterface {
    
    private Scanner reader;
    List<Skier> skiers = new ArrayList<Skier>();
  
    public TextUserInterface(Scanner reader){
        this.reader = reader;
    }
    
    public void participents(){
        System.out.println("Kumpula ski jumping week" + "\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while(true){
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            if(name.equals("")){
                break;
            }
            Skier skier = new Skier(name);
            skiers.add(skier);
        }
        System.out.println("\n" + "The tournament begins!" + "\n");
        jump();
    }
    
    public void jump(){
        int round = 1;
       
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            if(!reader.nextLine().equals("jump")){
                break;
            }
            int listNumber = 1;
            System.out.println("\n" + "Round " + round + "\n");
            System.out.println("Jumping order:");
            for(Skier skier: skiers){
                System.out.println("     " + listNumber + ". " + skier.getName() + " " + skier.getScoreString());
                listNumber++;
            }
            System.out.println("");
            roundResult(round);
            round++;
        }
        System.out.println("\n" + "Thanks!" + "\n");
        finalResult();
    }
    
    public void roundResult(int round){
        System.out.println("Results of round " + round);
        for(Skier skier: skiers){
            int length = skier.getLength();
            int[] judge = skier.getVotes();
            System.out.println("  " + skier.getName());
            System.out.println("    length: " + length);
            System.out.println("    judge votes: " + Arrays.toString(judge));
            System.out.println("");
            Arrays.sort(judge);
            for(int i = 1; i < judge.length - 1; i++){
                skier.addScore(judge[i]);
            }
            skier.addScore(length);
        }
        Collections.sort(skiers);
    }
    
    public void finalResult(){
        Collections.reverse(skiers);
        int position = 1;
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for(Skier skier : skiers){
            System.out.print(position);
            System.out.print("           " + skier.getName() + " " + skier.getScoreString());
            System.out.println("");
            System.out.println("            " + skier.getJumps());
            position++;
        }
    }
        
}
