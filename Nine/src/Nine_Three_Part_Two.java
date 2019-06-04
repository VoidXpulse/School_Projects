import javax.swing.*;
import java.awt.*;

public class Nine_Three_Part_Two extends JPanel{
    //Justin Ecarma
    //6/4/2019
    //Lab 9.3 Part 2
    //Extra:
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Three_Part_Two d = new Nine_Three_Part_Two();

        f.add(d);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        g.drawOval(50, 100, 100, 100);
        g.drawOval(100, 150, 100, 100);
        g.drawOval(150, 100, 100, 100);
        g.drawOval(200, 150, 100, 100);
        g.drawOval(250, 100, 100, 100);
    }
}

