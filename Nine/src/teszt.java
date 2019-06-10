import javax.swing.*;
import java.awt.*;
//importing the things
public class teszt extends JPanel{
    public static void main (String [] args)
    {
        String st = "at";
        for(int a=0; a < st.length(); a++) {
            for(int b=1; b<=a; b++){
                System.out.println(" ");
            }
            for(int c = a; c<=st.length()/2+1;c++) {
                System.out.print(st.charAt(a));
            }
        }
    }
}
