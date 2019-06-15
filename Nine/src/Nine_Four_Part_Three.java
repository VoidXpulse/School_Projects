import javax.swing.*;
import java.awt.*;

//imports the things
public class Nine_Four_Part_Three extends JPanel {
    //Justin Ecarma
    //6/10/2019
    //Lab 9.4 Part 3
    //Extra: Makes a cone that is under the frustum
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Four_Part_Three d = new Nine_Four_Part_Three();
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
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 100, 20);
        g.setColor(Color.BLACK);
        g.drawOval(100, 190, 100, 20);
        g.drawLine(100, 110, 100, 200);
        g.drawLine(200, 110, 200, 200);
        //making the first shape
        g.setColor(Color.BLACK);
        g.drawOval(300, 100, 100, 20);
        g.setColor(Color.BLACK);
        g.drawOval(325, 190, 50, 20);
        g.drawLine(300, 110, 325, 200);
        g.drawLine(400, 110, 375, 200);
        //making the second shape

        g.setColor(Color.BLACK);
        g.drawOval(300, 300, 100, 20);
        g.setColor(Color.BLACK);
        g.drawLine(300, 310, 350, 200);
        g.drawLine(400, 310, 350, 200);
        //making the cone
    }
}
