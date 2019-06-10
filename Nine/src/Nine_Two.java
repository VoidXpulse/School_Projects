import javax.swing.*;
import java.awt.*;
//import the things
public class Nine_Two extends JPanel {
    //Justin Ecarma
    //6/9/2019
    //Lab 9.2
    //Extra: Another ghost is on the grid
    public static void main(String[] args) {
        JFrame f = new JFrame("eeeee");
        Nine_Two d = new Nine_Two();
        //making JFrame and setting up basic window
        f.add(d);
        f.setSize(516,832);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void paintComponent (Graphics g) {

        super.paintComponent(g);
        Font logo = new Font("Arial", Font.PLAIN, 125);
        setBackground(Color.black);
        //making font and background

        g.setColor(Color.yellow);
        g.fillArc(165, 25, 75, 75, 45, 270);
        g.setColor(Color.white);
        g.setFont(logo);
        g.drawString("Pa  Man", 10, 100);
        //making the logo

        int[] x = {100, 100, 105, 110, 115, 120, 125, 130, 130};
        int[] x2 = {100, 100, 105, 110, 115, 120, 125, 130, 130};
        int[] y = {200, 220, 215, 220, 215, 220, 215, 220, 200};
        for(int i = 0; i < 4; i++) {
            if(i == 0) {
                g.setColor(Color.ORANGE);
            }
            else if(i == 1) {
                g.setColor(Color.CYAN);
            }
            else if(i == 2) {
                g.setColor(Color.PINK);
            }
            else{
                g.setColor(Color.RED);
            }
            for (int j = 0; j < 9; j++) {
                x[j] = x2[j] + (40 * i);
            }
            g.fillPolygon(x, y, 9);
            g.fillArc(99  + (40 * i), 185, 31, 30, 0, 180);
            g.setColor(Color.WHITE);
            g.fillOval(105 + (40 * i), 193, 12, 12);
            g.setColor(Color.BLUE);
            g.fillOval(111 + (40 * i), 196, 6, 6);
            g.setColor(Color.WHITE);
            g.fillOval(118 + (40 * i), 193, 12, 12);
            g.setColor(Color.BLUE);
            g.fillOval(124 + (40 * i), 196, 6, 6);
        }
        //making the ghosts under the logo

        g.setColor(Color.yellow);
        g.fillArc(300, 185, 30, 30, 45, 270);
        g.setColor(Color.WHITE);
        g.fillOval(350, 194, 15, 15);
        //Making PACMAN and the Power Pellet under the logo

        g.fillRect(100, 300, 100, 100);
        g.fillRect(300, 300, 100, 100);
        g.fillRect(0, 400, 100, 100);
        g.fillRect(200, 400, 100, 100);
        g.fillRect(400, 400, 100, 100);
        g.fillRect(100, 500, 100, 100);
        g.fillRect(300, 500, 100, 100);
        g.fillRect(0, 600, 100, 100);
        g.fillRect(200, 600, 100, 100);
        g.fillRect(400, 600, 100, 100);
        g.fillRect(100, 700, 100, 100);
        g.fillRect(300, 700, 100, 100);
        g.fillRect(500, 500, 100, 120);
        //making the grid

        g.setColor(Color.RED);
        int[] e = {135, 135, 140, 145, 150, 155, 160, 165, 165};
        int[] d = {435, 455, 450, 455, 450, 455, 450, 455, 435};
        g.fillPolygon(e, d, 9);
        g.fillArc(99  + (35), 285 + 135, 31, 30, 0, 180);
        g.setColor(Color.WHITE);
        g.fillOval(105 + (35), 293 + 135, 12, 12);
        g.setColor(Color.BLUE);
        g.fillOval(111 + (35), 296 + 135, 6, 6);
        g.setColor(Color.WHITE);
        g.fillOval(118 + (35), 293 + 135, 12, 12);
        g.setColor(Color.BLUE);
        g.fillOval(124 + (35), 296 + 135, 6, 6);
        //making ghost1 on the grid

        g.setColor(Color.PINK);
        int[] r = {135, 135, 140, 145, 150, 155, 160, 165, 165};
        int[] eeeeeee = {635, 655, 650, 655, 650, 655, 650, 655, 635};
        g.fillPolygon(r, eeeeeee, 9);
        g.fillArc(99  + (35), 285 + 335, 31, 30, 0, 180);
        g.setColor(Color.WHITE);
        g.fillOval(105 + (35), 293 + 335, 12, 12);
        g.setColor(Color.BLUE);
        g.fillOval(111 + (35), 296 + 335, 6, 6);
        g.setColor(Color.WHITE);
        g.fillOval(118 + (35), 293 + 335, 12, 12);
        g.setColor(Color.BLUE);
        g.fillOval(124 + (35), 296 + 335, 6, 6);
        //making ghost2 on the grid

        g.setColor(Color.yellow);
        g.fillArc(335, 635, 30, 30, 45, 270);
        //making PACMAN on the grid
    }
}