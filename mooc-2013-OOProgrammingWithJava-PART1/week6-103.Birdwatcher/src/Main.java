import java.util.*;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Bird> birdList = new ArrayList<Bird>();
    
        while(true){
             System.out.print("? ");
             String choice = reader.nextLine();
             if(choice.equals("Quit")){
                 break;
             }
             else if(choice.equals("Add")){
                 System.out.print("Name: ");
                 String name = reader.nextLine();
                 System.out.print("Latin Name: ");
                 String latin = reader.nextLine();
                 
                //Bird bird = new Bird(name, latin);
                birdList.add(new Bird(name, latin));
             }
             else if(choice.equals("Observation")){
                 System.out.print("What was observed:? ");
                 String observe = reader.nextLine();
                 if(!isBirdOnList(observe, birdList)){
                    System.out.println("Is not a bird!");
                 }
              
             }
             
             else if(choice.equals("Statistics")){
                 for(Bird birds : birdList){
                     System.out.println(birds.toString());
                 }
             }
             
             else if(choice.equals("Show")){
                 System.out.print("What? ");
                 String show = reader.nextLine();
                 for(Bird birds : birdList){
                     if(birds.name().equals(show)){
                         System.out.println(birds.toString());
                     }
                 }
             }
        }
       
    }
    
    public static boolean isBirdOnList(String birdOnList, ArrayList<Bird> birdList){
        for(Bird birds : birdList){
            if(birds.name().equals(birdOnList)){
                birds.observeIncrease();
                return true;
            }
        }
        return false;
    }
    


}
