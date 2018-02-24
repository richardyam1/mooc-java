package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);  
        
        graphics.fillRect(80, 50, 50, 50);
        graphics.fillRect(250, 50, 50, 50);
        graphics.fillRect(30, 200, 50, 50);
        graphics.fillRect(300, 200, 50, 50);
        graphics.fillRect(80, 250, 220, 50);
    }
}
