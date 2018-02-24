package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public class ActionEventListener implements ActionListener{
        private JTextField origin;
        private JLabel destination;
        
        public ActionEventListener(JTextField origin, JLabel destination){
            this.origin = origin;
            this.destination = destination;
        }
        
        public void actionPerformed(ActionEvent ae){
            this.destination.setText(this.origin.getText());
            this.origin.setText("");
        }
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3,1);
        container.setLayout(layout);
        
        JTextField textAreaTop = new JTextField("I was copied here from the JTextArea.");
        JLabel textAreaBottom = new JLabel();
        JButton copyButton = new JButton("Copy!");
        
        ActionEventListener copier = new ActionEventListener(textAreaTop, textAreaBottom);
        copyButton.addActionListener(copier);
        
        container.add(textAreaTop);
        container.add(copyButton);
        container.add(textAreaBottom);
    }
}
