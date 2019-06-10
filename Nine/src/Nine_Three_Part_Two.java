import javax.swing.*;
import java.awt.*;
//importing the things
public class Nine_Three_Part_Two extends JPanel{
    //Justin Ecarma
    //6/4/2019
    //Lab 9.3 Part 2
    //Extra:
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        //naming JFrame
        Nine_Three_Part_Two d = new Nine_Three_Part_Two();
        //making JFrame and setting up basic window
        f.add(d);
        //adding drawing space
        f.setSize(400,400);
        //setting space
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        //making the paintComponent

        g.drawOval(50, 100, 100, 100);
        g.drawOval(100, 150, 100, 100);
        g.setColor(Color.blue);
        g.drawOval(150, 100, 100, 100);
        g.drawOval(200, 150, 100, 100);
        g.drawOval(250, 100, 100, 100);
        //making the circles equidistant from each other
    }
}

