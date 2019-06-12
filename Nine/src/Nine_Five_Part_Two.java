import javax.swing.*;
import java.awt.*;

//importing the things
public class Nine_Five_Part_Two extends JPanel {
    //Justin Ecarma
    //6/12/2019
    //Lab 9.5 Part Two
    //Extra: There are a lot more worms
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Five_Part_Two d = new Nine_Five_Part_Two();
        //making JFrame and setting up basic window
        f.add(d);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        //paintComponent
        int i;
        //looping for MORE WORM aka WORMPOCALYPSE
        for (int x = 0; x < 10; x++) {
            for (int j = 0; j < 10; j++) {
                for (i = 0; i < 6; i++) {
                    g.setColor(Color.yellow);
                    g.fillOval(25 + (25 * i) + (250 * x), 25 + (110 * j), 100, 100);
                    //making the circle
                    g.setColor(Color.black);
                    g.drawOval(25 + (25 * i) + (250 * x), 25 + (110 * j), 100, 100);
                    //making the outline
                }
                //loop for the shapes
                g.setColor(Color.blue);
                g.fillOval(210  + (250 * x), 40 + (110 * j), 25, 25);
                g.fillOval(165  + (250 * x), 40 + (110 * j), 25, 25);
                g.setColor(Color.black);
                g.drawOval(210  + (250 * x), 40 + (110 * j), 25, 25);
                g.drawOval(165  + (250 * x), 40 + (110 * j), 25, 25);
                g.setColor(Color.red);
                g.fillOval(170  + (250 * x), 100 + (110 * j), 60, 10);
                g.setColor(Color.black);
                g.drawOval(170  + (250 * x), 100 + (110 * j), 60, 10);
                //eyes and mouth
            }
        }
    }
}
