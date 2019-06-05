import javax.swing.*;
import java.awt.*;
//importing the things
public class Nine_Three_Part_Three extends JPanel {
    //Justin Ecarma
    //6/4/2019
    //Lab 9.3 Part 3
    //Extra:
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Three_Part_Three d = new Nine_Three_Part_Three();
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
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 300, 100);
        //making face
        g.setColor(Color.blue);
        g.fillOval(150, 75, 25, 25);
        g.setColor(Color.blue);
        g.fillOval(225, 75, 25, 25);
        //making eyes
        g.setColor(Color.green);
        g.fillOval(187, 75, 25, 40);
        //making nose
        g.setColor(Color.orange);
        g.fillArc(125, 110, 150, 30, 180, 180);
        //making mouth
    }
}
