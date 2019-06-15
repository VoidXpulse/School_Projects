import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//importing
public class Nine_Six_Part_Two extends JPanel implements ActionListener {
    //Justin Ecarma
    //6/14/2019
    //Lab 9.6 Part 2
    //Extra: The bugs will continue to fly across screen, "wrapping" around the screen (also there are multiple bugs)

    Timer time = new Timer(5, this);
    int x = 35, speed = 3;
    //making timer and delay
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Six_Part_Two d = new Nine_Six_Part_Two();
        //making JFrame and setting up basic window
        f.add(d);
        f.setSize(532,556);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if(x >= 0 & x < 760) {
            x = x + speed;
            repaint();
        }
        else {
            x = 0;
            repaint();
        }
        //conditions for movement
    }
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 6; i++) {
                g.setColor(Color.yellow);
                g.fillOval(25 + (25 * i) + (x) - 260, 25 + (110 * j), 100, 100);
                //making the circle
                g.setColor(Color.black);
                g.drawOval(25 + (25 * i) + (x) - 260, 25 + (110 * j), 100, 100);
                //making the outline
            }
            //loop for the shapes
            g.setColor(Color.blue);
            g.fillOval(210 + (x) - 260, 40 + (110 * j), 25, 25);
            g.fillOval(165 + (x) - 260, 40 + (110 * j), 25, 25);
            g.setColor(Color.black);
            g.drawOval(210 + (x) - 260, 40 + (110 * j), 25, 25);
            g.drawOval(165 + (x) - 260, 40 + (110 * j), 25, 25);
            g.setColor(Color.red);
            g.fillOval(170 + (x) - 260, 100 + (110 * j), 60, 10);
            g.setColor(Color.black);
            g.drawOval(170 + (x) - 260, 100 + (110 * j), 60, 10);
            //eyes and mouth
        }
        time.start();
    }
}
