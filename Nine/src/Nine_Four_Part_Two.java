import javax.swing.*;
import java.awt.*;
//importing the things
public class Nine_Four_Part_Two extends JPanel {
    //Justin Ecarma
    //6/10/2019
    //Lab 9.4 Part 2
    //
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Four_Part_Two d = new Nine_Four_Part_Two();
        //making JFrame and setting up basic window
        f.add(d);
        f.setSize(532,556);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        //paintComponent
        setBackground(Color.GREEN);
        //making the background green
        //drawing the line
        g.drawLine(0, 0, 600, 600);
        g.setColor(Color.black);
        g.fillOval(275, 275, 100, 100);
        g.setColor(Color.BLUE);
        g.fillOval(300, 300, 100, 100);
        g.setColor(Color.black);
        g.fillOval(75, 75, 100, 100);
        g.setColor(Color.BLUE);
        g.fillOval(100, 100, 100, 100);
        //drawing the circles
    }
}
