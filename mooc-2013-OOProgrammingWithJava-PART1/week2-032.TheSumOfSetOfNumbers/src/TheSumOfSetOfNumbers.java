
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first = 1;
        int sum = 0;
        System.out.print("Until what? " );
        int n = Integer.parseInt(reader.nextLine());
        while(first <= n){
            sum += first;
            first++;
        }
        System.out.println(sum);
    }
}
