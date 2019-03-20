import java.util.Scanner;
import java.io.*;
//importing the things
public class Seven_Three_Part_Three {
    //Justin Ecarma
    //3/20/2019
    //Lab 7.3 Part 2
    //
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("Seven/src/Dog.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Beatrice 3 Tasha 4 Patty 1");
            pw.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
