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
    private Airplane airplane;
    private Flight flight;
   
    
    public TextUserInterface(Scanner reader, Airplane airport, Flight flight){
        this.reader = reader;
        this.airplane = airport;
        this.flight = flight;

    }
    
    public void airportPanel(){
        System.out.println("Airport panel");
        System.out.println("----------------------");
        while(true){
            System.out.println("\n" + "Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String choice = reader.nextLine();
            
            if(choice.equals("1")){
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int capacity = Integer.parseInt(reader.nextLine());
                this.airplane.add(id, capacity);
            }
            else if(choice.equals("2")){
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                System.out.print("Give departure airport code: ");
                String departCode = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String destinationCode = reader.nextLine();
                this.flight.add(this.airplane.getInfo(id), departCode, destinationCode);
               
            }
            else if(choice.equals("x")){
                break;
            }

        }
        flightPanel();
    }
 
    public void flightPanel(){
        System.out.println("\n" + "Flight service");
        System.out.println("---------------------");
        while(true){
            System.out.println("\n" + "Choose operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String choice = reader.nextLine();
            
            if(choice.equals("1")){
                ArrayList<String> planes = this.airplane.planeList();
                for(String plane : planes){
                    System.out.println(plane);
                }
            }
            else if(choice.equals("2")){
                this.flight.printFlight();
            }
            else if(choice.equals("3")){
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                System.out.println(this.airplane.getInfo(id));
            }
            else if(choice.equals("x")){
                break;
            }
        }

    }
}
