import javax.swing.*;
import java.awt.*;
//importing the things
public class teszt extends JPanel{
    public static void main (String [] args)
    {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String allFonts[] = ge.getAvailableFontFamilyNames();
        for (int i = 0; i < allFonts.length; i++)
            System.out.println(allFonts[i]);
    }
}
