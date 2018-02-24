import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int position = name.length() - 1;
        System.out.print("In reverse order: ");
        while(position >= 0){
            System.out.print(name.charAt(position));
            position--;
        }
        System.out.println("");
    }
}
