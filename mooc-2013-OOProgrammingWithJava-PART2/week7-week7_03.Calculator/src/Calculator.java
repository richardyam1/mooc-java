/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syn
 */

public class Calculator {
    
    private Reader reader;
    private int stats;
    
    public Calculator(){
        reader = new Reader();
        this.stats = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    
    private void sum(){
        int[] values = getTwoValues();

        System.out.print("sum of the values " + (values[0] + values[1]));
        System.out.println("");

    }
    
    private void difference(){
        int[] values = getTwoValues();

        System.out.print("difference of the values " + (values[0] - values[1]));
        System.out.println("");

    }
    
    private void product(){
        int[] values = getTwoValues();
        
        System.out.print("product of the values " + values[0] * values[1]);
        System.out.println("");

    }
        
    private void statistics(){
        System.out.print("Calculations done " + this.stats);
        System.out.println("");
    }
    
    private int[] getTwoValues(){
        this.stats++;
        
        int[] values = new int[2];
        
        System.out.print("value1: ");
        values[0] = reader.readInteger();

        
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        
        return values;
      
    }
}
