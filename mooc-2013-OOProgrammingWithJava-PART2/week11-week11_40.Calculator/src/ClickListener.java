/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syn
 */

import java.awt.event.*;
import javax.swing.*;
public class ClickListener implements ActionListener{
    
    private JTextField inputField;
    private JTextField outputField;
    private JButton addButton;
    private JButton minusButton;
    private JButton clearButton;
    private Calculate cal;
    
    public ClickListener(Calculate cal, JTextField inputField, JTextField outputField, JButton addButton, JButton minusButton, JButton clearButton){
        this.cal = cal;
        this.inputField = inputField;
        this.outputField = outputField;
        this.addButton = addButton;
        this.minusButton = minusButton;
        this.clearButton = clearButton;
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clearButton){
            this.cal.resetOutput();
            outputField.setText("0");
            inputField.setText("");
            clearButton.setEnabled(false);
        }
        else{
            try{
                int input = Integer.parseInt(inputField.getText());

                if(ae.getSource() == addButton){
                    this.cal.add(input);
                    outputField.setText(Integer.toString(this.cal.getOutputValue()));
                    inputField.setText("");
                    clearButton.setEnabled(true);
                }
                else if(ae.getSource() == minusButton){
                    this.cal.minus(input);
                    outputField.setText(Integer.toString(this.cal.getOutputValue()));
                    inputField.setText("");
                    clearButton.setEnabled(true);
                }
            }
            catch(NumberFormatException e){
                inputField.setText("");
            }
            
        }

    }
}
