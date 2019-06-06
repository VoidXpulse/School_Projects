import javax.swing.*;
import java.awt.*;

public class Nine_One_Part_Two extends JPanel {
    //Justin Ecarma
    //6/5/2019
    //Lab 9.1 Part 2
    //
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_One_Part_Two d = new Nine_One_Part_Two();
        //making JFrame and setting up basic window
        f.add(d);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public void paintComponent (Graphics g)
    {

        super.paintComponent(g);
        setBackground(Color.blue);
        Font arialbig = new Font("Arial", Font.PLAIN, 60);
        g.setFont(arialbig);
        g.setColor(Color.orange);
        g.fillOval(25, 15, 75, 75);
        g.setColor(Color.orange);
        g.fillOval(25, 100, 75, 75);
        g.setColor(Color.orange);
        g.fillOval(25, 185, 75, 75);
        g.setColor(Color.orange);
        g.fillOval(25, 270, 75, 75);
        g.setColor(Color.orange);
        g.fillOval(115, 270, 75, 75);
        g.setColor(Color.orange);
        g.fillOval(205, 270, 75, 75);
        g.setColor(Color.orange);
        g.fillOval(295, 270, 75, 75);
        g.setColor(Color.orange);
        g.drawString("Go Team!", 115, 200);
    }
}
