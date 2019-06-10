import javax.swing.*;
import java.awt.*;

public class Nine_Two extends JPanel {
    //Justin Ecarma
    //6/9/2019
    //Lab 9.2
    //
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Two d = new Nine_Two();
        //making JFrame and setting up basic window
        f.add(d);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void paintComponent (Graphics g) {

        super.paintComponent(g);
        Font logo = new Font("Arial", Font.PLAIN, 125);
        setBackground(Color.black);

        g.setColor(Color.yellow);
        g.fillArc(165, 25, 75, 75, 45, 270);
        g.setColor(Color.white);
        g.setFont(logo);
        g.drawString("Pa  Man", 10, 100);
        int[] x = {100, 100, 105, 110, 115, 120, 125, 130, 130};
        int[] y = {400, 420, 415, 420, 415, 420, 415, 420, 400};
        for() {
            g.setColor(Color.RED);
            g.fillPolygon(x, y, 9);
            g.fillArc(99, 385, 31, 30, 0, 180);
            g.setColor(Color.WHITE);
            g.fillOval(105, 393, 12, 12);
            g.setColor(Color.BLUE);
            g.fillOval(111, 396, 6, 6);
            g.setColor(Color.WHITE);
            g.fillOval(118, 393, 12, 12);
            g.setColor(Color.BLUE);
            g.fillOval(124, 396, 6, 6);

        }

    }
}