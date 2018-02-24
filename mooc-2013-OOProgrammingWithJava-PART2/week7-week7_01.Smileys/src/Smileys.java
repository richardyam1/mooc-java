
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
        printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        if(characterString.length() % 2 == 1){
            characterString += " ";
        }
        characterString = " " + characterString + " ";
        for(int i = 0; i < characterString.length()/2 + 2; i++){
            System.out.print(":)");
        }
        
        System.out.println("");
        System.out.print(":)" + characterString + ":)");
        
        System.out.println("");
        for(int j = 0; j < characterString.length()/2 + 2; j++){
            System.out.print(":)");
        }
       
        System.out.println("");
    }

}
