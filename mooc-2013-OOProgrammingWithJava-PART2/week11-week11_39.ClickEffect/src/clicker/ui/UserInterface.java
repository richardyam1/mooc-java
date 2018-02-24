package clicker.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.*;
import clicker.applicationlogic.Calculator;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator cal;
    
    public UserInterface(Calculator cal){
        this.cal = cal;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        
        //container.add(new JButton("Click!"), BorderLayout.SOUTH);
        //container.add(new JLabel (cal.giveValue() + ""));
        JLabel number = new JLabel(Integer.toString(this.cal.giveValue()));
        JButton addButton = new JButton("Click!");
        
        container.add(addButton, BorderLayout.SOUTH);
        container.add(number, BorderLayout.CENTER);
        
        ClickListener listener = new ClickListener(this.cal, number);
        addButton.addActionListener(listener);

    }

    public JFrame getFrame() {
        return frame;
    }
}
