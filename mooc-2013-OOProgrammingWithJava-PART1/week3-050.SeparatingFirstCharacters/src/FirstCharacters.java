import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int position = 0;
        if(name.length() > 3){
            while(position < 3){
                System.out.println((position + 1) + ". character: " + name.charAt(position));
                position++;
            }
        }
    }
}
