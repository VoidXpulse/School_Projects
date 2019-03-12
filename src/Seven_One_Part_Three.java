import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class Seven_One_Part_Three {
    //Justin Ecarma
    //3/12/2019
    //Lab 7.1 Part Three
    //
    public static void main(String[] args) {
        File numbers = new File("src/Numbers.txt");
        PrintWriter pw;
        int number;
        String randnums = "";
        Scanner theScanner = new Scanner(System.in);
        Random rando = new Random();

        System.out.println("Enter the number of random numbers");
        number = theScanner.nextInt();

        for(int i = 0; i < number; i++)
        {
            randnums = randnums + rando.nextInt(101) + " ";
        }

        try
        {
            pw = new PrintWriter(numbers);
            pw.println(randnums);
            pw.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
