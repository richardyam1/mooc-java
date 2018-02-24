
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        while(true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            
            Student student = new Student(name, studentNumber);
            list.add(student);
        }
        
        for(Student person : list){
            System.out.println(person);
        }
        
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        for(Student searchPerson : list){
            if(searchPerson.getName().contains(searchTerm)){
                System.out.println(searchPerson);
            }
        }
    }
}