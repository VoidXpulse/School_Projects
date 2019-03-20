import java.io.*;
import java.util.Scanner;
//importing the things
public class Seven_Three_Part_Four {
    //Justin Ecarma
    //3/20/2019
    //Lab 7.3 Part 4
    //
    public static void main(String[] args) {
        File dog = new File("Seven/src/Dog.txt");
        //connecting to the file
        try
        {
            //making the scanner
            Scanner theScanner = new Scanner(dog);
            while(1<2) {
                System.out.println(theScanner.next());
                theScanner.next();
                //printing the name and the skipping one
                if(!theScanner.hasNext()) {
                    break;
                    //breaking the loop
                }
            }
        }
        catch(FileNotFoundException e) {
            //error result
            System.out.println(e.getMessage());
        }
    }
}
