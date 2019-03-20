import java.io.*;
import java.util.Scanner;

public class Seven_Three_Part_Four {
    //Justin Ecarma
    //3/20/2019
    //Lab 7.3 Part 4
    //
    public static void main(String[] args) {
        File dog = new File("Seven/src/Dog.txt");
        try
        {
            Scanner theScanner = new Scanner(dog);
            while(1<2) {
                System.out.println(theScanner.next());
                theScanner.next();
                //
                if(!theScanner.hasNext()) {
                    break;
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
