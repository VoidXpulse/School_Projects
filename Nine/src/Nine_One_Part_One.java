import javax.swing.*;
import java.awt.*;

public class Nine_One_Part_One extends JPanel {
    //Justin Ecarma
    //6/5/2019
    //Lab 9.1 Part 1
    //
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_One_Part_One d = new Nine_One_Part_One();
        //making JFrame and setting up basic window
        f.add(d);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public void paintComponent (Graphics g)
    {

        super.paintComponent(g);

        g.setColor(Color.black);
        g.fillRect(40, 30, 100, 300);

        g.setColor(Color.red);
        g.fillRect(40, 30, 110, 120);

        g.setColor(Color.blue);
        g.fillOval(87, 87, 25, 25);

        g.setColor(Color.YELLOW);
        g.drawString("Graphics are easy in Java!", 200, 200);
    }
}