import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes: ");
        scoreList(reader);
    }
    
    public static void scoreList(Scanner reader){
        ArrayList<Integer> scoreList = new ArrayList<Integer>(); 
        while(true){
            int score = Integer.parseInt(reader.nextLine());
            if(score == -1){
                break;
            }
            else if(score >= 0 && score <=60){
                scoreList.add(score);
            }          
        }
        int[] score = new int[scoreList.size()];
        for(int i = 0; i < scoreList.size(); i++){
            score[i] = scoreList.get(i);
        }
        gradeDistribute(score);
    }
    
    public static void gradeDistribute(int[] grades){
        int accepted = 0;
        System.out.println("Grade distribution: ");
        for(int i = 5; i >= 0; i--){
             
            System.out.print(i + ": ");
            printStars(i, grades);
            
        }
        for(int j = 0; j < grades.length; j++){
            if(grades[j] >= 30){
                accepted++;
            }
        }
        double percentage = (double)(100 * accepted)/grades.length;
        System.out.println("Accepted percentage: " + percentage);
    }
    
    public static void printStars(int rank, int[] starGrade){
        for(int i = 0; i < starGrade.length; i++){
            if(rank == 5 && (starGrade[i] >= 50 && starGrade[i] <= 60)){
                System.out.print("*");
            }
            else if(rank == 4 && (starGrade[i] >= 45 && starGrade[i] <= 49)){
                System.out.print("*");
            }
            else if(rank == 3 && (starGrade[i] >= 40 && starGrade[i] <= 44)){
                System.out.print("*");
            }
            else if(rank == 2 && (starGrade[i] >=35 && starGrade[i] <= 39)){
                System.out.print("*");
            }
            else if(rank == 1 && (starGrade[i] >= 30 && starGrade[i] <= 34)){
                System.out.print("*");
            }
            else if(rank == 0 && (starGrade[i] <= 29)){
                System.out.print("*");
            }
        }
        System.out.println("");
    }
}
