import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//importing
public class Nine_Six_Part_One extends JPanel implements ActionListener {
    //Justin Ecarma
    //6/14/2019
    //Lab 9.6 Part 1
    //Extra:

    Timer time = new Timer(5, this);
    int x = 35, speed = 3;
    //making timer and delay
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Six_Part_One d = new Nine_Six_Part_One();
        //making JFrame and setting up basic window
        f.add(d);
        f.setSize(532,556);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if(x >= 0 & x < 500) {
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
        int[] a = {x, x+60, x+60, x+80, x+60, x+60, x};
        int[] b = {40, 40, 20, 60, 100, 80,80};

        g.fillPolygon(a, b, 7);
        //making the polygon and shooting it across the screen
        time.start();
    }
}
