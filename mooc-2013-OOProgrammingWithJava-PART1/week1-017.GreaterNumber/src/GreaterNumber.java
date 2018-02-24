import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        if(number1 > number2){
            System.out.print("Greater number: " + number1);
        }
        else if(number1 < number2){
            System.out.print("Greater number: " + number2);
        }
        else{
            System.out.print("The numbers are equal!");
        }
    }
}
