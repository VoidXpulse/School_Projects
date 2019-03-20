import java.io.*;
import java.util.Scanner;

//importing the things
public class Seven_Three_Part_Three {
    //Justin Ecarma
    //3/20/2019
    //Lab 7.3 Part 3
    //The user can input dog names and ages
    public static void main(String[] args) {
        Scanner theScanner = new Scanner(System.in);
        int start, age;
        String input = " ";
        do {
            System.out.println("Enter a name of a dog");
            input = input + theScanner.next() + " ";
            System.out.println("Enter the age of the dog");
            age = theScanner.nextInt();
            input = input + age + " ";
            System.out.println("Would you like to exit?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            start = theScanner.nextInt();
        }
        while(start != 1);
        try{
            //making file connections
            FileWriter fw = new FileWriter("Seven/src/Dog.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            //appends the files
            pw.print("Beatrice 3 Tasha 4 Patty 1");
            pw.print(input);
            //closes the file
            pw.close();
        }
        catch(IOException e) {
            //error message
            System.out.println(e.getMessage());
        }
    }
}
