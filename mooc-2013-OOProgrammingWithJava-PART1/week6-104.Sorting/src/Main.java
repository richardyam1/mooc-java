import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){

        int smallest = smallest(array);
        for(int i = 0; i < array.length; i++){
            if(array[i] == smallest){
                return i;
            }
        }
        return 0;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        
        int smallestIndex = index;
        for(int i = smallestIndex + 1; i < array.length; i++){
            if(array[i] < array[smallestIndex]){
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int oldIndex1 = array[index1];
        int oldIndex2 = array[index2];
        
        array[index1] = oldIndex2;
        array[index2] = oldIndex1;
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){  
            System.out.print("[");
            for(int j = 0; j < array.length; j++){
                if(j > 0){
                    System.out.print(", ");
                }
                System.out.print(array[j]);
            }
            System.out.print("]");
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex); 
           
            System.out.println("");
        }
        
    }
    
    

}
