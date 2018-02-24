
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());
        int number = 0;
        int result = 0;
        while(number <= power){
           result += (int)Math.pow(2, number);
           number++;
        }
         
        System.out.println("The result is " + result);
    }
}
