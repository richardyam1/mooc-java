public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount > 0){
            System.out.print("*");   
            amount--;
        }
        System.out.println("");
        
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int spaces = 0;
        while(spaces < amount){
            System.out.print(" ");
            spaces++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int stars = 1;
        int spacePerRow = size - 1;
        while(spacePerRow >= 0){
            printWhitespaces(spacePerRow);
            printStars(stars);
            spacePerRow--;
            stars++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int stars = 1;
        int baseHeight = 2;
        int baseSpaces = height - 2;
        while(height > 0){
            printWhitespaces(height-1);
            printStars(stars);
       
            stars += 2;
            height--;
        }
        while(baseHeight > 0){
            printWhitespaces(baseSpaces);
            printStars(3);
            baseHeight--;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
