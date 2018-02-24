import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
    
    public LotteryNumbers() {
        
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int i = 1;
        int lottoNumber;
        while(i <= 7){
            lottoNumber = random.nextInt(39) + 1;
            if(!containsNumber(lottoNumber)){
                this.numbers.add(lottoNumber);
                i++;
            }           
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        for(int num : this.numbers){
            if(number == num){
                return true;
            }
        }
        return false;
    }
}
