import java.io.*;
import java.util.Scanner;
//importing the things
public class Seven_Two_Part_One {
    //Justin Ecarma
    //3/14/2019
    //Lab 7.2 Part 1
    //
    public static void main(String[] args) {
        File course = new File("src/course.txt");
        String fromfile;
        int one, two, three, average;
        //declaring and initializing the variables
        try
        {
            //making the scanner
            Scanner theScanner = new Scanner(course);
            System.out.println("Name: " + theScanner.next());
            System.out.println("Course: " + theScanner.next());
            one = theScanner.nextInt();
            System.out.println("Grade One: " + one);
            two = theScanner.nextInt();
            System.out.println("Grade One: " + two);
            three =theScanner.nextInt();
            System.out.println("Grade One: " + three);
            average = (one + two + three) / 3;
            System.out.println("Teacher: " + theScanner.next());
            System.out.println("Average: " + average);
            //printing the things
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            //error result
        }


    }
}
