import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;
    private String password;
    
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        
    }

    public String createPassword() {
        // write code that returns a randomized password
        this.password = "";
        int i = 0;
     
        while(i < this.length){
            password += "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            i++;
        }
        return password;
    }
}
