

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        //SwingUtilities.invokeLater(new GraphicCalculator());
        GraphicCalculator ui = new GraphicCalculator(new Calculate());
        SwingUtilities.invokeLater(ui);
    }
}
