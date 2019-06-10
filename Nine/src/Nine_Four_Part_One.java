import javax.swing.*;
import java.awt.*;
//importing the thins
public class Nine_Four_Part_One extends JPanel{
    //Justin Ecarma
    //6/10/2019
    //Lab 9.4 Part 1
    //
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Four_Part_One d = new Nine_Four_Part_One();
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
        int[] x = {120, 220, 200, 100};
        int[] y = {200, 200, 220, 220};
        int[] x1 = {100, 100, 120, 120};
        int[] y1 = {220, 270, 250, 220};
        int[] x2 = {120, 220, 200, 100};
        int[] y2 = {250, 250, 270, 270};
        int[] x3 = {200, 200, 220, 220};
        int[] y3 = {220, 270, 250, 200};
        //coordinates
        g.setColor(Color.PINK);
        g.fillPolygon(x, y, 4);
        g.setColor(Color.BLUE);
        g.drawPolygon(x, y, 4);
        g.setColor(Color.PINK);
        g.fillPolygon(x1, y1, 4);
        g.setColor(Color.BLUE);
        g.drawPolygon(x1, y1, 4);
        g.setColor(Color.PINK);
        g.fillPolygon(x2, y2, 4);
        g.setColor(Color.BLUE);
        g.drawPolygon(x2, y2, 4);
        g.setColor(Color.PINK);
        g.fillPolygon(x3, y3, 4);
        g.setColor(Color.BLUE);
        g.drawPolygon(x3, y3, 4);
        //drawing the things
    }
}
