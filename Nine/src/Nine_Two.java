import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
public class Nine_Two extends JPanel {
    public Nine_Two(String argx) {
        if ( argx == null ) {
            argx = "Pac.png";
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,640);
        JPanel panel = new JPanel();
        //panel.setSize(500,640);
        panel.setBackground(Color.CYAN);
        ImageIcon icon = new ImageIcon(argx);
        JLabel label = new JLabel();
        label.setIcon(icon);
        panel.add(label);
        this.getContentPane().add(panel);
    }
    public static void main(String[] args) {
        new Nine_Two(args.length == 0 ? null : args[0]).setVisible(true);
    }
}