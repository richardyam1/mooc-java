
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int firstNumber;
        int lastNumber;
        System.out.print("First: ");
        firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        lastNumber = Integer.parseInt(reader.nextLine());
        while(firstNumber <= lastNumber){
            System.out.println(firstNumber);
            firstNumber++;
        }
    }
}
