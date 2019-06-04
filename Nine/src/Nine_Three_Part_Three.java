import javax.swing.*;
import java.awt.*;

public class Nine_Three_Part_Three extends JPanel {
    //Justin Ecarma
    //6/4/2019
    //Lab 9.3 Part 3
    //Extra:
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Three_Part_Three d = new Nine_Three_Part_Three();

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

    }
}
