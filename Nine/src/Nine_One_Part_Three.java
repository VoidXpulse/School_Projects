import javax.swing.*;
import java.awt.*;

public class Nine_One_Part_Three extends JPanel{
    //Justin Ecarma
    //6/5/2019
    //Lab 9.1 Part 3
    //Extra: Prints "Similiar Shapes
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_One_Part_Three d = new Nine_One_Part_Three();
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
        Font arialbig = new Font("Arial", Font.PLAIN, 40);
        g.setFont(arialbig);

        g.setColor(Color.black);
        g.fillRect(40, 30, 25, 25);

        g.setColor(Color.red);
        g.fillRect(80, 60, 25, 25);

        g.setColor(Color.black);
        g.fillRect(200, 30, 50, 25);

        g.setColor(Color.red);
        g.fillRect(300, 60, 50, 25);

        g.setColor(Color.black);
        g.fillOval(40, 200, 25, 25);

        g.setColor(Color.red);
        g.fillOval(80, 300, 25, 25);

        g.drawString("Similiar Shapes", 50, 150);
    }
}
