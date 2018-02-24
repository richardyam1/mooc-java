
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        double quotient = (double)firstNumber/secondNumber;
        
        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + quotient);
        // Implement your program here. Remember to ask the input from user.
    }
}
