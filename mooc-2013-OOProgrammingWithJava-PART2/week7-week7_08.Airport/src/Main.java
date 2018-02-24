import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Airplane airplane = new Airplane();
        Flight flight = new Flight();
        TextUserInterface ui = new TextUserInterface(reader, airplane, flight);
        
        ui.airportPanel();
        //ui.flightPanel();
    }
}
