import java.io.*;
import java.util.Scanner;
import java.util.Random;
//importing the things
public class Seven_One_Part_Three {
    //Justin Ecarma
    //3/12/2019
    //Lab 7.1 Part Three
    //Extra: You can choose the highest random number
    public static void main(String[] args) {
        File numbers = new File("src/Numbers.txt");
        PrintWriter pw;
        //making the file
        //making the variables
        int number, roof = 101;
        String randnums = "";
        Scanner theScanner = new Scanner(System.in);
        Random rando = new Random();
        boolean high;

        System.out.println("Enter the number of random numbers");
        number = theScanner.nextInt();
        //getting the number of random numbers
        System.out.println("Would you like to enter the highest number the random numbers can go to. (Enter a boolean)");
        high = theScanner.nextBoolean();
        if(high)
        {
            System.out.println("Enter the maximum number");
            roof = theScanner.nextInt();
        }
        else
        {
            System.out.println("The default is 101");
        }
        for(int i = 0; i < number; i++)
        {
            randnums = randnums + rando.nextInt(roof) + " ";
            //looping random number input
        }

        try
        {
            pw = new PrintWriter(numbers);
            pw.println(randnums);
            pw.close();
            //writing input to the file and closing the file
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            //error result
        }
    }
}
