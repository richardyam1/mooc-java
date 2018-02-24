/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;
import clicker.applicationlogic.Calculator;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Syn
 */
public class ClickListener implements ActionListener{
    
    private JLabel label;
    private Calculator cal;
    
    public ClickListener(Calculator cal, JLabel label){
        this.label = label;
        this.cal = cal;
    }
    
    public void actionPerformed(ActionEvent ae){
        this.cal.increase();
        this.label.setText(Integer.toString(this.cal.giveValue()));
    }
    
}
