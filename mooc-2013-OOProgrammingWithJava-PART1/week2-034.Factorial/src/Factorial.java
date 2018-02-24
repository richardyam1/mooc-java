import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        int first = 1;
        while(first <= n){
            factorial *= first;
            first++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
