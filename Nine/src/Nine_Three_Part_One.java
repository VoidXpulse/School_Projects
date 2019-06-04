import java.awt.*;
import javax.swing.*;

public class Nine_Three_Part_One extends JPanel {
    //Justin Ecarma
    //6/4/2019
    //Lab 9.3 Part 1
    //Extra:
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Three_Part_One d = new Nine_Three_Part_One();

        f.add(d);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(100, 100, 200, 150);

        g.setColor(Color.black);
        g.drawLine(100, 100, 150, 50);
        g.setColor(Color.black);
        g.drawLine(150, 50, 300, 100);

        g.setColor(Color.yellow);
        g.fillRect(150, 150, 25, 25);
        g.setColor(Color.yellow);
        g.fillRect(225, 150, 25, 25);

        g.setColor(Color.yellow);
        g.fillRect(175, 200, 50, 50);

    }
}
