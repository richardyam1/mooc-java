
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int position = 0;
        int listNumber = 1;
        while(position < name.length()){
            System.out.println(listNumber + ". character: " + name.charAt(position));
            position++;
            listNumber++;
        }
    }
}
