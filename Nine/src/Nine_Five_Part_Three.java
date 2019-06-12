import javax.swing.*;
import java.awt.*;

public class Nine_Five_Part_Three extends JPanel {
    //Justin Ecarma
    //6/12/2019
    //Lab 9.5 Part Three
    //
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Five_Part_Three d = new Nine_Five_Part_Three();
        //making JFrame and setting up basic window
        f.add(d);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        //paintComponent
        for (int i = 6; i > 0; i--) {
            g.setColor(Color.BLUE);
            g.fillOval(100 + (i * 5), 100 + (i * 5), 25 + (i * 25), 25 + (i * 25));
            g.setColor(Color.black);
            g.drawOval(100 + (i * 5), 100 + (i * 5), 25 + (i * 25), 25 + (i * 25));
        }
    }
}
