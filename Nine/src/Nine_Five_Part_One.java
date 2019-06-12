import javax.swing.*;
import java.awt.*;

//importing the things
public class Nine_Five_Part_One extends JPanel {
    //Justin Ecarma
    //6/12/2019
    //Lab 9.5 Part One
    //
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Five_Part_One d = new Nine_Five_Part_One();
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
        for (int i = 0; i < 6; i++) {
            g.setColor(Color.red);
            g.fillRect(10 + (10 * i), 10 + (10 * i), 50, 25);
            //making the rectangle
            g.setColor(Color.black);
            g.drawRect(10 + (10 * i), 10 + (10 * i), 50, 25);
            //making the outline
        }
        //loop for the shapes
    }
}