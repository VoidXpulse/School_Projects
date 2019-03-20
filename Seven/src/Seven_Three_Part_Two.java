import java.util.Scanner;
import java.io.*;
//importing the things
public class Seven_Three_Part_Two {
    //Justin Ecarma
    //3/20/2019
    //Lab 7.3 Part 2
    //
    public static void main(String[] args) {
        File dog = new File("Seven/src/Dog.txt");
        //declaring and initializing the variables
        try
        {
            Scanner theScanner = new Scanner(dog);
            //making the scanner
            //looping to print names and check age
            while(1<2){
                System.out.println(theScanner.next());
                if(theScanner.nextInt() < 7) {
                    System.out.println("Young Dog");
                }
                else {
                    System.out.println("Old Dog");
                }
                if(!theScanner.hasNext()) {
                    break;
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            //error result
        }
    }
}
