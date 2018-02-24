
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculate cal;

    
    public GraphicCalculator(Calculate cal){
        this.cal = cal;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        JTextField outputField = new JTextField(0 + "");
        JTextField inputField = new JTextField();
        outputField.setEnabled(false);
        
        container.add(outputField);
        container.add(inputField);
         
        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton addButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton clearButton = new JButton("Z");
        panel.add(addButton);
        panel.add(minusButton);
        panel.add(clearButton);
  
        ClickListener listener = new ClickListener(cal, inputField, outputField, addButton, minusButton, clearButton);
        
        clearButton.setEnabled(false);
        addButton.addActionListener(listener);
        minusButton.addActionListener(listener);
        clearButton.addActionListener(listener);
        
        container.add(panel);
    }


    

    
    public JFrame getFrame() {
        return frame;
    }
}
